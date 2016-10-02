package com.vsr.global.mna.main;

import java.util.Collection;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.ibm.watson.developer_cloud.alchemy.v1.model.Entities;
import com.vsr.global.mna.rel.extract.AlchemyLangEntityService;
import com.vsr.global.mna.rel.extract.DocumentConversionService;
import com.vsr.global.mna.utility.MnaUtility;

public class MnaMain {

	public static void main(String[] args) {
		
		String inputFile = "D:/Vikram/Java/WatsonPOCs-Workspace/GIT/M&AProject/src/sample.pdf";
		
		DocumentConversionService documentConversionService = new DocumentConversionService();
		AlchemyLangEntityService entityService = new AlchemyLangEntityService();
		
		String docText = documentConversionService.getDocAsTxt(inputFile);
		
//		System.out.println("docText - "+docText);
		
		Entities entity = entityService.getRelExtractResult(docText);
		
//		System.out.println("entity - "+entity);
		
		MnaUtility.showQuantityEntity(entity);
	}
}
