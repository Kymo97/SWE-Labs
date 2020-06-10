package cs425.Lab11.second;

import java.util.ArrayList;
import java.util.Arrays;

public class FlattenArrayService {
    public  int[] flattenArray(int[][] arr){
		return Arrays.stream(arr)
			    .flatMapToInt(e -> Arrays.stream(e))
			    .toArray();
    }

}
