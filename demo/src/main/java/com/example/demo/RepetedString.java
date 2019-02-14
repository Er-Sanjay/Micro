package com.example.demo;

import java.util.HashMap;
import java.util.Scanner;

public class RepetedString {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String inpStr = in.nextLine();
			int key;

			HashMap<String, Integer> hm = new HashMap<String, Integer>();
			String[] strArr = inpStr.split(" ");

			for (int i = 0; i < strArr.length; i++) {
				if (hm.get(strArr[i]) != null) {
					key = hm.get(strArr[i]);
					hm.put(strArr[i], hm.get(strArr[i]) + 1);

				} else {
					hm.put(strArr[i], 1);
				}
			}
			System.out.println(hm);
		}
	}
