package com.cgi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccInt {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 1, 2, 2, 2, 3);

		// 1-2 2-3 3-1

		Map<Integer, Long> counum = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
			System.out.println(counum);
		}
		
	
		
		
		
	
}