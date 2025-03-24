package com.restAssured.day5;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class QueryParam {
	
	@Test
	public void pathAndQuery()
	{  
		
		//user --> admin, catery,,
	Response res=	given()
		.pathParam("mypath","users" )
		.queryParam("page",2)
		.when()
		.get("https://reqres.in/api/{mypath}");
		
	Object o1=res.jsonPath().get("data[1].first_name");
	System.out.println("data-> 0 "+o1);
		
	}

}
