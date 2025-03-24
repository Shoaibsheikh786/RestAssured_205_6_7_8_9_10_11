package com.restAssured.day5;

import static io.restassured.RestAssured.given;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PathQuery {
	
	@Test
	public void pathAndQuery()
	{  
		String myData;
		Scanner sc=new Scanner(System.in);
		myData=sc.next();
		
		//user --> admin, catery,,
		given()
		.pathParam("mypath",myData )  
		.when()
		.get("https://reqres.in/api/{mypath}?page=2")
		.then().log().body();
		
	}

}
