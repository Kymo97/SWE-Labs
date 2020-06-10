package cs425.Lab11.second;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ArrayReversor {
private FlattenArrayService faltternService=new FlattenArrayService();

    public ArrayReversor(FlattenArrayService faltternService) {
        this.faltternService = faltternService;
    }

     public ArrayReversor() {
	}

	public int[] reverseArray(int[][] arr){   	 
        int[] ans = faltternService.flattenArray(arr);
       List<Integer> tez = Arrays.stream(ans).boxed()
        .collect(Collectors.toList());
        Collections.reverse(tez);
        return tez.stream().mapToInt(e->e).toArray();
    }
}
