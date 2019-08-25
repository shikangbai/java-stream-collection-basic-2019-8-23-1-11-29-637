package com.thoughtworks.collection;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyMap {

	List<Integer> array;

	public MyMap(List<Integer> array) {
		this.array = array;
	}

	public List<Integer> sortFromBig() throws Exception {
		Collections.sort(array, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		System.out.println(array);
		return array;
	}

	public List<Integer> sortFromSmall() throws Exception {
		Collections.sort(array);
		
		return array;

	}
}
