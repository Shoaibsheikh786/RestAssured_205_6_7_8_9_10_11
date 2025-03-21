package com.restAssured.day4;

import static io.restassured.RestAssured.given;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesValidation {
	
	
	@Test
	public void test1()
	{
		Response res=given()
		.when()
		.get("https://www.google.com");
		
		//all the cookies
		
	//	res.then().log().cookies();
		
		//key i know AEC
		
		String str=res.cookie("AEC");
		
	//	System.out.println(str);
		
		Map <String, String> ck=res.cookies();
		
		//print all the keys and values 
		
		//i want to print only keys 
		
		Set<String> keys=ck.keySet();
		
		Iterator<String> it=keys.iterator();
		
		while(it.hasNext())
		{
		  String k=it.next();
		  System.out.println(res.getCookie(k));
		  
		  //if --> vaue not equal ...
		}
	}

}
