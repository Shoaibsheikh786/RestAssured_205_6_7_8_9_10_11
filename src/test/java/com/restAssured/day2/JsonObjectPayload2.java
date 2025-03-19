package com.restAssured.day2;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class JsonObjectPayload2 {
	
	@Test
	public void payload2()
	{  
		JSONObject data=new JSONObject();
		data.put("name", "Hello");
		data.put("job", "Leader");
		
		 RestAssured
		   .given()
		   .contentType("application/json")
		   .body(data.toString())   
		   .when()
		    .post("https://reqres.in/api/users")
		   .then().log().body();
		 
		 //Note JsonObject --> data.toString();
	}

}
