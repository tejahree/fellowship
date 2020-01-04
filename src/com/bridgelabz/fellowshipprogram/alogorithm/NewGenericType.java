package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

public class NewGenericType<T> {
T tarray[];
public NewGenericType(T arr[]) {
	tarray=arr;
}
T getArray(int i) {
	return tarray[i];
}

}
