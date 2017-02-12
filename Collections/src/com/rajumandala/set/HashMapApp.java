package com.rajumandala.set;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashMapApp {
	public static void main(String[] args) {
		Map<String, List<String>> map = new LinkedHashMap<>();
		String s1 = "Section A";
		String s2 = "Section B";
		String s3 = "Section C";
		
		List<String> l1 = Arrays.asList("s1 l1 1", "s1 l1 2");
		List<String> l2 = Arrays.asList("s2 l2 1", "s2 l2 2");
		List<String> l3 = Arrays.asList("s3 l3 1", "s3 l3 2");
		
		map.put(s1, l1);
		map.put(s2, l2);
		map.put(s3, l3);
		
		for (Map.Entry<String, List<String>> m: map.entrySet()) {
			System.out.println(m.getKey());
			List<String> students = m.getValue();
			for (String s: students) {
				System.out.println(s);
			}
		}
	}
}
