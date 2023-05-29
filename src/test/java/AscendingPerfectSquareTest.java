
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.tarver.app.Logic;

/**
 * Unit tests for Logic class
 * 
 * @author jtarver 2023
 *
 */
class AscendingPerfectSquareTest {

	@Test
	void testIsPerfectSquare() {
		// some positive tests
		assertTrue(Logic.isPerfectSquare(4));
		assertTrue(Logic.isPerfectSquare(16));

		// some negative tests
		assertFalse(Logic.isPerfectSquare(99));
		assertFalse(Logic.isPerfectSquare(42));

		// edge cases
		assertTrue(Logic.isPerfectSquare(-1));
		assertTrue(Logic.isPerfectSquare(0));
		assertTrue(Logic.isPerfectSquare(1));
	}

	@Test
	void testGetPerfectSquares() {

		ArrayList<Integer> candidates = new ArrayList<>();

		candidates.add(4);
		candidates.add(16);
		candidates.add(99);
		candidates.add(42);
		candidates.add(0);
		candidates.add(1);
		candidates.add(-1);

		List<Integer> results = Logic.getPerfectSquares(candidates);

		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(-1);
		expected.add(0);
		expected.add(1);
		expected.add(4);
		expected.add(16);

		// quick check for size
		assertEquals(results.size(), expected.size());

		// iterate through the list and ensure elements match
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(results.get(i), expected.get(i));
		}

	}
}
