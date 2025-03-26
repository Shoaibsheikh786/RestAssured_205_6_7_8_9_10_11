package com.restAssured.day7;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class GenerateRandomData {
	
	@Test
	public void generateRandomNames()
	{
		Faker faker=new Faker();
		String f_name=faker.name().firstName();
		String l_name=faker.name().lastName();
		String full_name=faker.name().fullName();
		System.out.println(f_name+" "+l_name);
		
		System.out.println(full_name);
		
		String ph_num=faker.phoneNumber().cellPhone();
		System.out.println(ph_num.replace("-",""));
		
		System.out.println(faker.number().randomDigitNotZero());
		
		System.out.println(faker.nation().capitalCity());
		
		System.out.println(faker.internet().password(5, 10));
		
		System.out.println(faker.business().creditCardNumber());
		
		System.out.println(faker.color().name());
		
		System.out.println(faker.medical().diseaseName());
	}
	
	@Test
	public void test2()
	{
		Faker faker=new Faker();
		System.out.println(faker.name().username()); //Male Female
	}
	
	@Test
	public void test3()
	{
		Faker f1=new Faker();
		for(int i=0;i<5;i++)
		{
			System.out.println(f1.name().fullName());
			System.out.println(f1.demographic().sex());
		}
	}

}
