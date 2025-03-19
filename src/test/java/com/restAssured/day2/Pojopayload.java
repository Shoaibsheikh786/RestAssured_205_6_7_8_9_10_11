package com.restAssured.day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Pojopayload {
	
	@Test
	public void test1()
	{  
		User data=new User();
		data.setName("Hello");
		data.setJob("Devops");
		 RestAssured
		   .given()
		   .contentType("application/json")
		   .body(data)   
		   .when()
		    .post("https://reqres.in/api/users")
		   .then().log().body();
	}

}
