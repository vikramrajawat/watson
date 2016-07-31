package com.hsbc.global.mna.rel.extract;

import java.io.File;

import com.ibm.watson.developer_cloud.document_conversion.v1.DocumentConversion;

public class DocumentConversionService {

	public static void main(String[] args) {
		DocumentConversionService service = new DocumentConversionService();
		System.out.println(service.getDocAsTxt("D:/Vikram/Java/WatsonPOCs-Workspace/M&AProject/src/sample.pdf"));

	}

	public String getDocAsTxt(String filePath){
		
		DocumentConversion service = new DocumentConversion("2015-12-01");
		service.setUsernameAndPassword("fd684fcf-12a2-4de8-ab17-865df1d08855", "aiNl8NgIV3vG");
		File doc = new File(filePath);
//		Answers htmlToAnswers = service.convertDocumentToAnswer(doc).execute();
		return service.convertDocumentToText(doc).execute();
		
	}
}
