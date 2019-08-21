package com.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApplications {
	public static void main(String[] args) {
		String arr[] = { "All", "happy", "families", "are", "alike", "every", "unhappy", "family", "is", "unhappy",
				"in", "its", "own", "way" };
		int width = 30;
		process(arr, width);
	}

	static String[] process(String arr[], long width) {
		sort(arr, arr.length);
		List<String> values = new ArrayList<>();
		String temp = "";
		for (int i = 0; i < arr.length;) {
			String temp1 = arr[i];
			if (temp.length() + temp1.length() > width) {
				for (int k = temp.length(); k < width; k++) {
					temp += "";
				}
				values.add(temp);
				temp = "";
			} else {
				temp += temp1;
				temp+=" ";
				i++;
			}

		}
		System.out.println(Arrays.toString(values.toArray()));
		return null;

	}

	static void sort(String[] s, int n) {
		for (int i = 1; i < n; i++) {
			String temp = s[i];
			int j = i - 1;
			while (j >= 0 && temp.length() < s[j].length()) {
				s[j + 1] = s[j];
				j--;
			}
			s[j + 1] = temp;
		}
	}

}
