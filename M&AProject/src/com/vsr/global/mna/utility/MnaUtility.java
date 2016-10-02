package com.vsr.global.mna.utility;

import java.util.Collection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.ibm.watson.developer_cloud.alchemy.v1.model.Entities;

public class MnaUtility {
	
	public static void showQuantityEntity(Entities entity){
		JSONParser parser = new JSONParser();
		Object obj = null;
		try {
			obj = parser.parse(entity.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if(obj!=null){
			JSONObject jsonObj = (JSONObject) obj;
			Collection coll = jsonObj.values();
			for(Object cObj : coll){
				if(cObj instanceof JSONArray){
					JSONArray cJsonObj = (JSONArray) cObj;
					for(Object cjObj : cJsonObj){						
						if(cjObj.toString().contains("Quantity")){
							System.out.println(cjObj);
						}
					}
				}				
			}			
		}
	}
}
