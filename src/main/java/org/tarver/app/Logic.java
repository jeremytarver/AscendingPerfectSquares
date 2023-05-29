package org.tarver.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * Library class containing methods for detecting & sorting perfect squares.
 * 
 * @author jtarver
 *
 */
public class Logic {

	/**
	 * Given a list of candidate integers, checks each to determine if it is a
	 * perfect square.
	 * Adds each perfect square to a new list, which is sorted in ascending order.
	 * 
	 * @param candidates
	 * @return a list of perfect squares in ascending order
	 */
	public static List<Integer> getPerfectSquares(List<Integer> candidates) {
		ArrayList<Integer> perfectSquares = new ArrayList<>();

		for (Integer candidate : candidates) {
			if (isPerfectSquare(candidate)) {
				perfectSquares.add(candidate);
			}
		}

		Collections.sort(perfectSquares);
		return perfectSquares;
	}

	/**
	 * Detects if the candidate is a perfect square.
	 * Uses Math.sqrt, and checks if the result is the same as the floor of the
	 * result.
	 * 
	 * @param candidate
	 * @return true if the candidate is a perfect square
	 */
	public static boolean isPerfectSquare(int candidate) {

		double squareRoot = Math.sqrt(candidate);
		double floor = Math.floor(squareRoot);
		if (squareRoot - floor > 0) {
			return false;
		}
		return true;
	}
}
