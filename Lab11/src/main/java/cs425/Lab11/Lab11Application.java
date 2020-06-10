package cs425.Lab11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cs425.Lab11.first.ArrayFlattener;
import cs425.Lab11.second.ArrayReversor;
import cs425.Lab11.second.FlattenArrayService;



@SpringBootApplication
public class Lab11Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab11Application.class, args);
        int[][] arr = {{1,3},{0},{4, 5, 9}};
		ArrayReversor a = new ArrayReversor();
		int res[] =a.reverseArray(arr);
//        ArrayFlattener arrFlat=new ArrayFlattener();
//        int res[] = arrFlat.flattenArray(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

		
	}

}
