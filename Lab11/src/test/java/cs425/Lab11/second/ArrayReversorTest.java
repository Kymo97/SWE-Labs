package cs425.Lab11.second;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ArrayReversorTest {
    private ArrayReversor arrRev;
    private FlattenArrayService flattenSerice=mock(FlattenArrayService.class);

    @BeforeEach
    void setUp() {
        this.arrRev=new ArrayReversor(flattenSerice);
    }

    @AfterEach
    void tearDown() {
        this.arrRev=null;
    }

    @Test
    void reverseArray() {
        int[][] inputArr = new int[][]{{1,3}, {0}, {4,5,9}};
        when(flattenSerice.flattenArray(inputArr)).thenReturn(new int[]{1,3,0,4,5,9});
        int[] actual = arrRev.reverseArray(inputArr);
        int[] expected = new int[]{9,5,4,0,3,1};
        assertArrayEquals(expected, actual);
    }
    @Test
    void reverseArrayNull() {
        int[][] inputArr =null;
        when(flattenSerice.flattenArray(inputArr)).thenReturn(null);
        int[] actual = arrRev.reverseArray(inputArr);
        int[] expected = null;
        assertArrayEquals(expected, actual);
    }
}