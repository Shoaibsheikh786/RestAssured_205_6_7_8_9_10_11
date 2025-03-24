package com.restAssured.day5;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ParsingData {
	
	@Test
	public void pathAndQuery()
	{  
		
		//user --> admin, catery,,
	Response res=	given()
		.pathParam("mypath","users" )
		.queryParam("page",2)
		.when()
		.get("https://reqres.in/api/{mypath}");
		
        //Conver the response in JSONObject
	  
	JSONObject jo=new JSONObject(res.asString());
	
//	System.out.println(jo.get("page"));
	JSONArray ja=jo.getJSONArray("data");
	
	//print the json object whose id value is 9
	for(int i=0;i<ja.length();i++)
	{
		int id=ja.getJSONObject(i).getInt("id");
		
		//George
		if(id==9)
		{
			System.out.println(ja.getJSONObject(i));
		}
		
	}
	
	//Wap to print the recode whose firstname is George
	//Wap to check does the api container a patricular email or not 
	   //email : hello@gmail.com
	
	
		

}
}
