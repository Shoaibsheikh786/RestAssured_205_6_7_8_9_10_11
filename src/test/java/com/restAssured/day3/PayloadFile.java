package com.restAssured.day3;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class PayloadFile {
	
	
	@Test
	public void test1() throws FileNotFoundException
	{
		//file -> read-> jso -jsonObject
		File f=new File("./body.json");
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		JSONObject jo=new JSONObject(jt);

		given()
		.contentType("application/json")
		.body(jo.toString())
		.when()
		 .post("https://reqres.in/api/users")
		.then().log().all();
	}
	
	@Test
	public void myTest() throws FileNotFoundException
	{ 
		
		//file -> read-> jso -jsonObject
		File f=new File("./body.json");
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		JSONObject jo=new JSONObject(jt);

		given()
		.contentType("application/json")
		.body(jo.toString())
		.when()
		 .post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.body("name", Matchers.equalTo("Java"))
		.body("job", Matchers.equalTo("Tester"))
		.header("Content-Type",Matchers.equalTo("application/json; charset=utf-8"))
		.time(Matchers.equalTo(2l),TimeUnit.SECONDS);
	}
	
	@Test
	public void test12()
	{
		given()
		.when()
		 .get("https://www.google.com")
		.then()
		.cookie("AEC",Matchers.not("AVcja2f4y2p-HnN3Y_EXKuymBQd0JKchqRnlcy92Ym5xpO-Akobv3S8t6nA;Path=/;Domain=.google.com;Secure;HttpOnly;Expires=16/09/25, 5:30 am;SameSite=lax"));
		
	}
	

}
