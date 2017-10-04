package br.com.fiap.client;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TesteUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArquivoWeb port = new ArquivoWebService().getArquivoWebPort();
		
		try {
			File file = new File("C:/Users/logonpf/Desktop/pdt_ft1_128351.jpg");
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream inputStream = new BufferedInputStream(fis);
			byte[] imageBytes = new byte[ (int) file.length()  ];
			inputStream.read(imageBytes);
			
			port.upload("SEUBATISTA.JPG", imageBytes);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
