package com.cgi;

import java.util.Arrays;
import java.util.List;

public class CountOnceAndZeros {
	public static void main(String[] args) {

		String str = "1,1,0,0,1,0,1,0,1";

		long out1 = str.chars().filter(f -> f == '1').count();
		long oout2 = str.chars().filter(o -> o == '0').count();
		System.out.println("count 1s :" + out1);
		System.out.println("count 0s :" + oout2);

		List<Integer> list = Arrays.asList(1, 0, 1, 0, 0, 1, 1, 1, 0);

		long o = list.stream().filter(n -> n == 0).count();
		System.out.println(" zeros :" +o);
		long once = list.stream().filter(n -> n == 1).count();

		System.out.println(" once : "  +once);
	}
}
