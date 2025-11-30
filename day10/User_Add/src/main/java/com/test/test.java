package com.test;

import java.util.List;

import com.dataReader.dataReader;
import com.pojo.Pojo;

public class test {

	public void login () {
		//  why  write this firstly  fetch data from excel in the form  of object 
		List<Pojo> users = dataReader.Reader();
		System.out.println(users.size());
		
		//  for loop 
		
		for(Pojo pp :users) {
			System.out.println("user :"+pp.getUser() +" password : "+pp.getPassword() );
		}
	}
}
