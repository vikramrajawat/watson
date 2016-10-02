package com.vsr.global.mna.rel.service;

import java.util.HashMap;
import java.util.Map;

import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyLanguage;
import com.ibm.watson.developer_cloud.alchemy.v1.model.Entities;

public class AlchemyLangEntityService {

	public static void main(String[] args) {

		String input = "IBM Watson won the Jeopardy television show hosted by Alex Trebek";
		AlchemyLangEntityService service = new AlchemyLangEntityService();
		System.out.println("Entities: " + service.getRelExtractResult(input));

	}

	public Entities getRelExtractResult(String inputText){
		
		AlchemyLanguage service = new AlchemyLanguage();
		service.setApiKey("625f2673f130f48620166f603af5323e67045b35");

		Map<String, Object> params = new HashMap<String, Object>();
		params.put(AlchemyLanguage.TEXT, inputText);

		return service.getEntities(params).execute();	

		
	}
}