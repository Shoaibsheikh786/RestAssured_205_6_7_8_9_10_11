package com.restAssured.day1;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicHttpMethods {
	
	//rest Assured
	
	/* given():->  
	 * precondition 
	 * when() 
	 * tests
	 * then()
	 * Validation  */
	
	/*RestAssured*/
	/*
	 * given()
	 *  --> payload 
	 *  --> type of data 
	 *  --> authentication 
	 *  ....
	 *  
	 *  when()
	 *   --> get() put() post() delete();
	 *   
	 *   
	 *   then()
	 *   --> Validate, print*/
	
	@Test
	public void getSingleUser()
	{
		RestAssured
		.given()
		.when()
		.get("https://reqres.in/api/users/2")
		.then().statusCode(201);
	}
	@Test
	public void getSingleUser2()
	{
		Response res=RestAssured
		.given()
		.when()
		.get("https://reqres.in/api/users/2");
		res.then().log().body();
		res.then().log().headers();
		res.then().log().status();
	}
	
	@Test
	public void deleteUser()
	{
		RestAssured.given()
		.when()
		.delete("https://reqres.in/api/users/2")
		.then().statusCode(204);
	}
	
	@Test
	public void getSingleUser3()
	{
		Response res=RestAssured
		.given()
		.when()
		.get("https://reqres.in/api/users/2");
		
		res.then();
	}
	
	@Test
	public void createUser()
	{
		/*{
           "name": "morpheus",
           "job": "leader"
         }*/
	
	Map<String,String> map=new HashMap<>();
	map.put("name", "shaoib");
	map.put("job", "Devops");
		
		RestAssured
		.given()
		.contentType("application/json")
		.body(map)
		.when()
		.post("https://reqres.in/api/users")
		.then().statusCode(201);
	}
	
	
	
	
	
	

}
