package com.cgi;

import java.util.UUID;
import java.util.stream.Stream;

public class Fibonacci {
	public static void main(String[] args) {
		
		Stream.iterate(new int[] { 0, 1 }, a -> {
			int next = a[0] + a[1];
			a[0] = a[1];
			a[1] = next;
			return a;
		}).limit(10).map(a -> a[0]).forEach(System.out::println);

	}
}