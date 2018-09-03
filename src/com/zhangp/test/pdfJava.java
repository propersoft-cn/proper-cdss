package com.zhangp.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.lowagie.text.DocumentException;

public class pdfJava {
	
	public static void main(String[] args) throws DocumentException, IOException  {
		String inputFile = "C://Users//my//Desktop//html//addIndex.html";  
	    String outFile = "C://Users//my//Desktop//html//180803500979.pdf";  
	    OutputStream os = new FileOutputStream(outFile);  
//	    ITextRenderer renderer = new ITextRenderer();  
//	    
//	    ITextFontResolver fontResolver = renderer.getFontResolver(); 
//	    //启动中文支持
//	    fontResolver.addFont("C:\\Windows/fonts/simsun.ttc", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);  
//
//	    String url = new File(inputFile).toURI().toURL().toString();  
//	    renderer.setDocument(url);  
//	    renderer.layout();  
//	    renderer.createPDF(os);  
	    os.close();   
		
	}

}
