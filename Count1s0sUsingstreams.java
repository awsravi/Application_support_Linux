package com.cgi;

import java.util.Arrays;
import java.util.List;

public class Count1s0sUsingstreams {
public static void main(String[] args) {
	
	//input : 1,0,1,0,0,1,1,1,0
	//output : 1s -5  0s -4
	
	
	List<Integer> list=Arrays.asList(1,0,1,0,0,1,1,1,0);
	int sum= list.stream().reduce(0 ,Integer::sum);
	System.out.println("1s :"+sum);
	System.out.println("0s :"+ (list.size()-sum));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * List<Integer> num=Arrays.asList(1,0,1,0,0,1,1,1,1,0,0); Integer sum=
	 * num.stream().reduce(0 , Integer::sum); System.out.println("count 1s :"+sum);
	 * System.out.println("cout 0s :"+( num.size()-sum));
	 * 
	 * 
	 */
	
	
	
	
	
	
	
}
}
