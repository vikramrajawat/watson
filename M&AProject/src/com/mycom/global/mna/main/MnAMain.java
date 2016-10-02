package com.mycom.global.mna.main;

import com.ibm.watson.developer_cloud.alchemy.v1.model.Entities;
import com.mycom.global.mna.rel.extract.AlchemyLangEntityService;
import com.mycom.global.mna.rel.extract.DocumentConversionService;

public class MnAMain {

	public static void main(String[] args) {
		
		String inputFile = "D:/Vikram/Java/WatsonPOCs-Workspace/M&AProject/src/sample.pdf";
		
		DocumentConversionService documentConversionService = new DocumentConversionService();
		AlchemyLangEntityService entityService = new AlchemyLangEntityService();
		
		String docText = documentConversionService.getDocAsTxt(inputFile);
		
		System.out.println("docText - "+docText);
		
		Entities entity = entityService.getRelExtractResult(docText);
		
		System.out.println("entity - "+entity);
		
	}

}
