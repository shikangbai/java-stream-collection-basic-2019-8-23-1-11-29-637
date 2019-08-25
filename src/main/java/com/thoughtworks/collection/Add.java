package com.thoughtworks.collection;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Add {
	public int getSumOfEvens(int leftBorder, int rightBorder) throws Exception {
		int sum = 0;
		if (rightBorder < leftBorder) {
			int temp = rightBorder;
			rightBorder = leftBorder;
			leftBorder = temp;
		}
		for (int i = leftBorder; i <= rightBorder; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public int getSumTripleAndAddTwo(List<Integer> arrayList) throws Exception {
		int sum = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			sum += (arrayList.get(i) * 3 + 2);
		}
		return sum;
	}

	public double getAverageOfEven(List<Integer> arrayList) throws Exception {
		int sum = 0;
		int count=0;
		double average;
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i)  % 2 == 0) {
				sum += arrayList.get(i) ;
				count+=1;
			}
		}
		average = (double)(sum/count);
		return average;
	}
}
