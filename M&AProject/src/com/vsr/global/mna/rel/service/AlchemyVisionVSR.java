package com.vsr.global.mna.rel.service;

import java.io.File;

import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyVision;
import com.ibm.watson.developer_cloud.alchemy.v1.model.ImageKeywords;

public class AlchemyVisionVSR {

	public static void main(String[] args) {

		AlchemyVision service = new AlchemyVision();
		service.setApiKey("0f1ec9c0e016bf1a0a1c1241b7f2167a504e93fb");

		File image = new File("resources/alchemy/obama.jpg");
		Boolean forceShowAll = false;
		Boolean knowledgeGraph = false;
		ImageKeywords keywords =  service.getImageKeywords(image, forceShowAll, knowledgeGraph).execute();

		System.out.println(keywords);

	}

}
