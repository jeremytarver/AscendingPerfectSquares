package org.tarver.app;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Please pass candidate values in as command line arguments.");
			return;
		}
		ArrayList<Integer> candidates = new ArrayList<>();

		for (String arg : args) {
			try {
				candidates.add(Integer.parseInt(arg));
			} catch (NumberFormatException e) {
				// do not add to list
			}
		}

		System.out.println("List of valid integers:");
		System.out.println(candidates.toString());

		System.out.println("List of perfect squares in ascending order:");
		System.out.println(Logic.getPerfectSquares(candidates));

	}

}
