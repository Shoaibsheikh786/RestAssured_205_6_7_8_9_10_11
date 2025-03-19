package com.restAssured.day2;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class HashMapPayload1 {
	 Map<String,String> data;
	@BeforeTest
	public void genPayload()
	{
		data=new HashMap<String,String>();
		   data.put("name", "Hello World");
		   data.put("job", "Tester");
	}
	
	@Test
	public void payload1()
	{
       /*
        * {
          "name": "Hello world",
          "job": "Tester"
   
          }
        */
		
  
   
   RestAssured
   .given()
   .contentType("application/json")
   .body(data)   
   .when()
    .post("https://reqres.in/api/users")
   .then().log().all();
		
		
	}

}
