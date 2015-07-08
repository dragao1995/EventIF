package br.edu.ifg.tads.mtp.eventif.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import br.edu.ifg.tads.mtp.eventif.control.ControlTelaLogin;

public class Cracha {
	ControlTelaLogin controlTelaLogin;
	public String line;
	public void SalvarNomeaq(String Nome) throws IOException {
		FileWriter arq = new FileWriter("D:/eventIF/nome.txt");
		PrintWriter gravarArq = new PrintWriter(arq);

		gravarArq.printf(Nome);

		arq.close();

	}
	public String Nome() throws IOException {
		BufferedReader data = new BufferedReader(new InputStreamReader(new FileInputStream("D:/eventIF/nome.txt")));  
		       line = data.readLine();
		            System.out.println("KKKK  "+line);  
		          
		data.close();
		return line;  
	}  
}
