package com.company.global.mna.main;

import com.company.global.mna.rel.extract.AlchemyLangEntityService;
import com.company.global.mna.rel.extract.DocumentConversionService;
import com.ibm.watson.developer_cloud.alchemy.v1.model.Entities;

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
