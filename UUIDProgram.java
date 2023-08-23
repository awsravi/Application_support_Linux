package com.cgi;

import java.util.UUID;
import java.util.stream.Stream;

public class UUIDProgram {
public static void main(String[] args) {
	Stream.generate(UUID::randomUUID).limit(5).forEach(System.
			out::println);
	
}
}
