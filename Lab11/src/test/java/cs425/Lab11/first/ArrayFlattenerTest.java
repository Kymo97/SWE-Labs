package cs425.Lab11.first;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFlattenerTest {
	private ArrayFlattener arrFlat;

	@BeforeEach
	void setUp() {
		this.arrFlat = new ArrayFlattener();
	}

	@AfterEach
	void tearDown() {
		this.arrFlat = null;
	}

	@Test
	void flattenArray() {
		int[][] inputArr = { { 1, 3 }, { 0 }, { 4, 5, 9 } };
		int[] acual = arrFlat.flattenArray(inputArr);
		int[] expected = { 1, 3, 0, 4, 5, 9 };
		assertArrayEquals(expected, acual);
	}

	@Test
	void flattenArrayNull() {
		int[][] inputArr = null;
		int[] acual = arrFlat.flattenArray(inputArr);
		int[] expected = null;
		assertArrayEquals(expected, acual);
	}
}