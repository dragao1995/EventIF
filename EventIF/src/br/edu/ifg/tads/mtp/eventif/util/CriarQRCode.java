package br.edu.ifg.tads.mtp.eventif.util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.edu.ifg.tads.mtp.eventif.model.Pessoa;
import br.edu.ifg.tads.mtp.eventif.view.TelaCadastro;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class CriarQRCode {
	String CpfQR;
	public String getCpfQR() {
		return CpfQR;
	}
	public void setCpfQR(String cpfQR) {
		CpfQR = cpfQR;
	}
	public void criarQRcode() {

String qrCodeData = CpfQR;
String filePath = "D://ifg2015.png";
String charset = "UTF-8"; 
Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();
hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
try {
	createQRCode(qrCodeData, filePath, charset, hintMap, 200, 200);
} catch (WriterException | IOException e) {
	e.printStackTrace();
}
System.out.println("QR Code image created successfully!");

}
	public static void createQRCode(String qrCodeData, String filePath,
			String charset, Map hintMap, int qrCodeheight, int qrCodewidth)
			throws WriterException, IOException {
		BitMatrix matrix = new MultiFormatWriter().encode(
				new String(qrCodeData.getBytes(charset), charset),
				BarcodeFormat.QR_CODE, qrCodewidth, qrCodeheight, hintMap);
		MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath
				.lastIndexOf('.') + 1), new File(filePath));
	}
	
	
}
