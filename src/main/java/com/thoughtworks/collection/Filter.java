package com.thoughtworks.collection;

import java.util.ArrayList;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Filter {

	List<Integer> array;

	public Filter(List<Integer> array) {
		this.array = array;
	}

	public List<Integer> filterEven() throws Exception {
		List<Integer> resultList = new ArrayList<Integer>();
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i)%2==0) {
				resultList.add(array.get(i));
			}
		}

		return resultList;
	}

	public List<Integer> filterMultipleOfThree() throws Exception {
		List<Integer> resultList = new ArrayList<Integer>();
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i)%3==0) {
				resultList.add(array.get(i));
			}
		}
		return resultList;
	}
}
