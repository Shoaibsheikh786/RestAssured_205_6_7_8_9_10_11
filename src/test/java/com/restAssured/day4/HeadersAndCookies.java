package com.restAssured.day4;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeadersAndCookies {
	
	@Test
	public void validateHeaders()
	{
		Response res=given()
		.when()
		.get("https://reqres.in/api/users/2");
		
		String val=res.header("Content-Type");
		System.out.println(val);
		
	//	String val2=res.header("Date");
	//	System.out.println(val2);
		
		//print all headers 
		
	//	res.then().log().headers();
		
		//i want to print only header keys
		
		Headers hd=res.headers();
		
		for(Header h:hd)
		{
			//key --- value (first header)
			//check does the header container key --> Cache-Control
		//	System.out.println(h.getName()+" "+h.getValue());
			
			String str=h.getName();
			if(str.equals("Authentication"))
			{
				System.out.println("Header is Present");
			}
		}
		
		
	}
	
	@Test
	public void validateValue()
	{
		Response res=given()
				.when()
				.get("https://reqres.in/api/users/2");
		
		//validate if it contains a particular header(key);
		
		//1. first get the headers
		//2. Exp Header value    :->        application/json; charset=utf-8
		//3. loop to iterate the values 
		
		
		//res.header("Content-Type");
		
		Headers hd=res.headers();
		
		for(Header h:hd)
		{
			String str=h.getValue();
			if(str.equals("application/json; charset=utf-8"))
			{
				System.out.println("Header Value is Present");
			}
		}
		
	}

}
