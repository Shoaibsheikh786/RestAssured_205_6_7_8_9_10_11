package com.restAssured.day6;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Authentications {
	
	@Test
	public void basicAuthTest()
	{
		RestAssured.given()
		.auth().basic("postman", "password")
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then().log().body();
	}
	
	
	@Test
	public void digestAuthTest()
	{ 
		String myuser="postman";
		String pass="password";
		RestAssured.given()
		.auth().digest(myuser,pass)
		.when()
		.get("https://postman-echo.com/digest-auth")
		.then().log().body();
	}
	
	@Test
	public void preemptivAuth()
	{
	RestAssured.given()
	.auth().preemptive().basic("postman", "password")
	.when()
	.get("https://postman-echo.com/basic-auth")
	.then().log().body();
	}


}
