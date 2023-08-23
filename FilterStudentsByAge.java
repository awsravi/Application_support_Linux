package com.cgi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStudentsByAge {
	public static void main(String[] args) {

		List<Student> sd = new ArrayList<Student>();
		sd.add(new Student("ravi", 1, 2));
		sd.add(new Student("kranthi", 2, 30));
		
			List<Student> age=sd.stream().filter( n -> n.getAge() >15).collect(Collectors.toList());
		System.out.println(age);
		}

	}

