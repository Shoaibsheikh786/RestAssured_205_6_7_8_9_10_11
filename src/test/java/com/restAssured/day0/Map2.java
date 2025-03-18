package com.restAssured.day0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map2 {
	
	public static void main(String[] args) {
		
		//name --> marks; keys and values
		//name --> marks
		
		//DataType--> String , Integer, Boolean , Float 
		
	// Map<DataType of Keys, DataType of value> map= new HashMap<>();
		
		Map<String,Integer> m1=new HashMap<>();
		
		//if we want to add data into map
		//--> put
		
		m1.put("abc", 70);
		m1.put("Jhon",60);
		m1.put("jack", 70);
		
		
		//to get the data we get(key)--> value	
		Integer jMarks=m1.get("jack");
		System.out.println(jMarks);
				
		// i want to all the keys
		
		Set<String> allKeys   =m1.keySet();		
		//how to get the data from 
		
		//Iterator , convert set into list	
		List<String> li=new ArrayList<>( allKeys);
		
		for(int i=0;i<li.size();i++)
		{
		String d1=li.get(i);  //abc   70
	//	System.out.println(d1);jhon
		
		System.out.println(d1 +" "+ m1.get(d1)); ;
		}
		
		
		
		
		
	
		
	}

}
