package br.edu.ifg.tads.mtp.eventif.util;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.smaxe.uv.media.VideoFrameFactory;
import com.smaxe.uv.media.core.VideoFrame;
import com.smaxe.uv.media.swing.JVideoScreen;
import com.smaxe.uv.na.WebcamFactory;
import com.smaxe.uv.na.webcam.IWebcam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

@SuppressWarnings({"rawtypes", "unchecked"})
public final class LerQrcode{
        public static void TelaWebcam() {
        final JComboBox webcamComboBox = new JComboBox();
        
        final JFrame frame = new JFrame();
        
        final JPanel content = new JPanel(new FlowLayout());
        content.setBackground(new Color(102, 204, 102));
        content.setBorder(new EmptyBorder(8, 8, 8, 8));
        content.setPreferredSize(new Dimension(640, 48));
        
        content.add(new JLabel("Webcam: ", JLabel.RIGHT));
        content.add(webcamComboBox);
        content.add(new JButton(new AbstractAction("Open")
        {
            private final static long serialVersionUID = -4792981545160764997L;
            
            public void actionPerformed(ActionEvent e)
            {
                final IWebcam webcam = (IWebcam) webcamComboBox.getSelectedItem();
                if (webcam == null) return;
                
                final AtomicReference<JFrame> frameRef = new AtomicReference<JFrame>();
                
                final JVideoScreen videoScreen = new JVideoScreen();
                
                new Thread(new Runnable()
                {
                    public void run()
                    {
                        final AtomicReference<VideoFrame> lastFrameRef = new AtomicReference<VideoFrame>();
                        
                        try
                        {
                            webcam.open(new IWebcam.FrameFormat(640, 480), new IWebcam.IListener()
                            {
                                private VideoFrame lastFrame = new VideoFrame(0, 0, null);
                                
                                public void onVideoFrame(final VideoFrame frame)
                                {
                                    SwingUtilities.invokeLater(new Runnable()
                                    {
                                        public void run()
                                        {
                                            videoScreen.setFrame(frame);
                                            
                                            if (lastFrame.width != frame.width || lastFrame.height != frame.height)
                                            {
                                                final JFrame frame = frameRef.get();
                                                
                                                if (frame != null) frame.pack();
                                            }
                                            
                                            lastFrame = frame;
                                            
                                            lastFrameRef.set(lastFrame);
                                        }
                                    });
                                }
                            });
                            
                            final IWebcam.FrameFormat[] supportedFormats = webcam.getFormats();
                            
                            if (supportedFormats != null)
                            {
                                System.out.println("Webcam: " + webcam.getName());
                                System.out.println("Supported formats: ");
                                
                                for (IWebcam.FrameFormat format : supportedFormats)
                                {
                                    System.out.println("=> " + format);
                                }
                            }
                            
                            webcam.startCapture();
                            
                            SwingUtilities.invokeLater(new Runnable()
                            {
                                public void run()
                                {
                                    
                                    frameRef.set(frame);                                    
                                    frame.getContentPane().setLayout(new BorderLayout());
                                    frame.getContentPane().add(videoScreen, BorderLayout.CENTER);
                                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                    frame.setResizable(false);
                                    frame.setTitle(webcam.getName());
                                    
                                    
                                    frame.addWindowListener(new WindowAdapter()
                                    {
                                        public void windowClosing(WindowEvent e)
                                        {
                                            webcam.close();
                                        }
                                    });
                                    content.add(new JButton(new AbstractAction("Capturar"){
                            			
                            			public void actionPerformed(ActionEvent arg0) {
                            				try{
                                                File file = new File("D://ifg.png");
                                                VideoFrameFactory.saveAsPng(file, lastFrameRef.get());
                                                lerqr();
                                           	} catch (Throwable t) {  
                                                   t.printStackTrace();  
                                               } 
                            			}
                            		}));
                                        frame.pack();
                                }
                            });
                        }
                        catch (Exception ex)
                        {
                            JOptionPane.showMessageDialog(frame,
                                    ex.getMessage(), ex.getMessage(), JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }).start();
            }
        }));
        
        frame.getContentPane().add(content);
        
        frame.setTitle("Webcam capture options");
        frame.pack();
        frame.setVisible(true);
        
        webcamComboBox.setModel(new WebcamComboModel(WebcamFactory.getWebcams()));
    }
    
    
    private final static class WebcamComboModel extends AbstractListModel implements ComboBoxModel
    {
        private final static long serialVersionUID = -8627944517955777531L;
        
        // fields
        private final List<IWebcam> devices;
        // state
        private Object selected = null;
        
        /**
         * Constructor.
         * 
         * @param devices
         */
        public WebcamComboModel(List<IWebcam> devices)
        {
            this.devices = devices;
        }
        
        // MutableComboBoxModel implementation
        
        public void setSelectedItem(final Object item)
        {
            this.selected = item;
        }
        
        public Object getSelectedItem()
        {
            return selected;
        }
        
        public Object getElementAt(int index)
        {
            return devices.get(index);
        }
        
        public int getSize()
        {
            return devices.size();
        }
    }
    
    /**
     * Constructor.
     */
    public LerQrcode()
    {
    }
    public static void lerqr() throws FileNotFoundException, NotFoundException, IOException{
  	String filePath = "D://ifg.png";
  	String charset = "UTF-8";
  	Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();
  	hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
  	System.out.println("Data read from QR Code: "
  			+ readQRCode(filePath, charset, hintMap));
  }
  public static String readQRCode(String filePath, String charset, Map hintMap)
			throws FileNotFoundException, IOException, NotFoundException {
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(
				new BufferedImageLuminanceSource(
						ImageIO.read(new FileInputStream(filePath)))));
		Result qrCodeResult = new MultiFormatReader().decode(binaryBitmap,
				hintMap);
		return qrCodeResult.getText();
	}
}