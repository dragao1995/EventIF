package br.edu.ifg.tads.mtp.eventif.util;

import javax.swing.text.MaskFormatter;
import java.security.*;
import java.math.*;

public class Mascaras {
	public MaskFormatter Mascara(String Mascara){  
        
	       MaskFormatter F_Mascara = new MaskFormatter();  
	       try{  
	           F_Mascara.setMask(Mascara); //Atribui a mascara  
	           F_Mascara.setPlaceholderCharacter(' '); //Caracter para preencimento   
	       }  
	       catch (Exception excecao) {  
	       excecao.printStackTrace();  
	       }   
	       return F_Mascara;  
}
	public String MD5(String md5) throws NoSuchAlgorithmException {
       String s=md5;
       MessageDigest m=MessageDigest.getInstance("MD5");
       m.update(s.getBytes(),0,s.length());
	return new BigInteger(1,m.digest()).toString(16);

}
}
