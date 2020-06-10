package cs425.Lab11.first;


import java.util.Arrays;

public class ArrayFlattener {

public  int[] flattenArray(int[][] arr){
		return Arrays.stream(arr)
	    .flatMapToInt(e -> Arrays.stream(e))
	    .toArray();
	}

}
