package br.edu.ifg.tads.mtp.eventif.util;

import java.security.*;
import java.math.*;

public class GerarMD5 {
    public static void main(String args[]) throws Exception{
       String s="Coloca oq vc quer gerar aq";
       MessageDigest m=MessageDigest.getInstance("MD5");
       m.update(s.getBytes(),0,s.length());
       System.out.println("A senha é essa:"+new BigInteger(1,m.digest()).toString(16));
       System.out.println("\na senha é so oq esta dps dos dois pontos");
    }
}
