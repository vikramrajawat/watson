package com.vsr.global.mna.rel.service;

import java.io.File;

import com.ibm.watson.developer_cloud.document_conversion.v1.DocumentConversion;

public class DocumentConversionService {

	public static void main(String[] args) {
		DocumentConversionService service = new DocumentConversionService();
		System.out.println(service.getDocAsTxt("D:/Vikram/Java/WatsonPOCs-Workspace/M&AProject/src/sample.pdf"));

	}

	public String getDocAsTxt(String filePath){
		
		DocumentConversion service = new DocumentConversion("2015-12-01");
		service.setUsernameAndPassword("caba2d1d-90de-4307-8208-291bb2e506e8", "vu6lWMYHP1Eh");
		File doc = new File(filePath);
//		Answers htmlToAnswers = service.convertDocumentToAnswer(doc).execute();
		return service.convertDocumentToText(doc).execute();
		
	}
}
