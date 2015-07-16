package br.edu.ifg.tads.mtp.eventif.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.smaxe.uv.na.webcam.IWebcam;

@SuppressWarnings({"rawtypes", "unchecked"})
public final class LerQrcode{
        public static void TelaWebcam() {}
    
    
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
