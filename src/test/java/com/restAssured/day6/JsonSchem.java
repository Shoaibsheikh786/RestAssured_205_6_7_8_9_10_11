package com.restAssured.day6;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class JsonSchem {
	
	@Test
	public void test()
	{
		//generate the schema 
		//validate 
		
	Response res=	RestAssured.given()
		.when()
		.get("https://reqres.in/api/users/2");
	
	res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json")); 

		
	}

}
