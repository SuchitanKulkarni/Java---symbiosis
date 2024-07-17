package com.java.symboisis.collection.map;

import java.util.HashMap;

public class Hashmap {
	
	public static void main(String[] args) {
		
		HashMap h = new HashMap();
		
		
		h.put(1, "hi");
		h.put(2, "ho");
		h.put(3, "he");
		h.put(4, "hii");
		h.put(5, "hy");
		
		System.out.println(h.containsKey("hii"));
		System.out.println(h.containsValue("xyz"));
		System.out.println(h.get(1));
		System.out.println(h.isEmpty());

		h.clear();
		
		System.out.println(h.isEmpty());
		
	}

}
