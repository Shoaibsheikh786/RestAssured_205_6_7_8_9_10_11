package com.restAssured.day0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		
		//  "name" --> STring
		//  numer --> int , float , double , shor byte long 
		// boolean --> boolean --> 
		// 
		/*
 * {
         "name": "morpheus",
    "job": "leader"
}*/  
		
		int arr[]=new int[2];
		arr[0]=1;
		arr[1]=2;
		
		//for
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
	//	System.out.println(arr[0]);

		Map<String,String> map=new HashMap<>();
		
		map.put("name","morpheus");
		map.put("job","leader");
		//------------------------------------------------
		
		String str1=map.get("job");
		
		System.out.println(str1);
		
		//loop 
	    
		Set<String> keys=map.keySet();
		
		//get the data from set
		//iterator , list 
		
		List<String> li=new ArrayList<>(keys);
         
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		
		//

       Iterator <String> i1=keys.iterator();
       
       while(i1.hasNext())
       {
    	  String key=i1.next();
    	  String val=map.get(key);
    	  
    	  System.out.println(key +"   "+val);
       }
		
		
		
		
		
		
 	}

}
