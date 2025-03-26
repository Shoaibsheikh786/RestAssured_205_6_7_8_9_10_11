package com.restAssured.day7;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiChaining {
	HashMap<String,String > data;
	String id;
  
	@Test(priority=1)
	public void createUser()
	{
		//payload 
		// post 
		data=new HashMap<String,String>();
		
		//Random data
		Faker f1=new Faker();
		String v1=f1.name().firstName();
		String v2=f1.job().field();
		data.put("name", "abc");
		data.put("job", "xyz");
		
	Response res=	RestAssured.
		given()
		.contentType("application/json")
		.body(data)
		.when()
		.post("https://reqres.in/api/users");
	
        res.then().log().body();
	}
	
	@Test(priority=2)
	public void getUser()
	{
		RestAssured
		.given()
		.when()
		.get("https://reqres.in/api/users/"+id)
		.then().log().all();
	}
	
	@Test(priority=3)
	public void updateUser()
	{  
		data.put("name", "Kotlin");
		data.put("job", "Android Dev");
		RestAssured
		.given()
		.contentType("application/json")
		.body(data)
		.when()
		.put("https://reqres.in/api/users/"+id)
		.then().log().all();
	}
	
	@Test(priority=4)
	public void readUserAgain()
	{
		RestAssured
		.given()
		.when()
		.get("https://reqres.in/api/users/"+id)
		.then().log().all();
	}
	
	
	@Test(priority=5)
	public void deleteUser()
	{
		RestAssured
		.given()
		.when()
		.delete("https://reqres.in/api/users/"+id)
		.then().log().all();
	}
	
	
	
	//RestAssured 
	

	
	
	
	
	
	
	
}
