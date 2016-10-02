package com.vsr.global.mna.rel.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyDataNews;
import com.ibm.watson.developer_cloud.alchemy.v1.model.DocumentsResult;

public class AlchemyDataNewsVSR {

	public static void main(String[] args) {
		
		AlchemyDataNews service = new AlchemyDataNews();
		service.setApiKey("0f1ec9c0e016bf1a0a1c1241b7f2167a504e93fb");

		Map<String, Object> params = new HashMap<String, Object>();

		String[] fields =
		    new String[] {"enriched.url.title", "enriched.url.url", "enriched.url.author",
		        "enriched.url.publicationDate", "enriched.url.enrichedTitle.entities",
		        "enriched.url.enrichedTitle.docSentiment"};
		params.put(AlchemyDataNews.RETURN, StringUtils.join(fields, ","));
		params.put(AlchemyDataNews.START, "1440720000");
		params.put(AlchemyDataNews.END, "1441407600");
		params.put(AlchemyDataNews.COUNT, 7);

		DocumentsResult result = service.getNewsDocuments(params).execute();

		System.out.println(result);

	}

}
