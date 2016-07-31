package com.hsbc.global.mna.rel.extract;

import java.util.HashMap;
import java.util.Map;

import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyLanguage;
import com.ibm.watson.developer_cloud.alchemy.v1.model.DocumentSentiment;
import com.ibm.watson.developer_cloud.alchemy.v1.model.Entities;
import com.ibm.watson.developer_cloud.relationship_extraction.v1_beta.RelationshipExtraction;
import com.ibm.watson.developer_cloud.relationship_extraction.v1_beta.model.Dataset;

public class RelationshipExtractService {

	public static void main(String[] args) {
		
		AlchemyLanguage service = new AlchemyLanguage();
		service.setApiKey("0f1ec9c0e016bf1a0a1c1241b7f2167a504e93fb");

		Map<String,Object> params = new HashMap<String, Object>();
//		params.put(AlchemyLanguage.TEXT, "IBM Watson won the Jeopardy television show hosted by Alex Trebek");
		params.put(AlchemyLanguage.TEXT, "I am gonna fail in the upcoming exam");
		DocumentSentiment sentiment = service.getSentiment(params).execute();

		Map map = new HashMap();
		map.put("key1", "Vikram singh rajawat is working in HSBC Global Technology, Pune and getting annual salary of 5 Lac");
		Entities entities = service.getEntities(map).execute();
		System.out.println(entities);
		
		RelationshipExtraction reService = new RelationshipExtraction();
		reService.setUsernameAndPassword("25927d9a-4093-410c-b8d0-162d76b573ca", "ZQm1BoaWGcNS");

		reService.setDataset(Dataset.ENGLISH_NEWS);		
		String response = reService.extract("During a trip to Milwaukee, Obama cited a new administration report attributing the increase in the number of insured Americans to provisions that created health insurance marketplaces where consumers can buy private plans, expanded Medicaid, required insurers to cover people with medical conditions and permitted young people to stay on their parents’ health plans until they turned 26."+
				"The president’s trip was designed to reward Milwaukee for its success in signing up people for coverage. It won a competition called the Healthy Communities Challenge that involved 20 cities.").execute();
//		System.out.println(response);
		String response1 = reService.extract("IBM Watson Developer Cloud").execute();
		System.out.println(response);
	}

}
