package lambdaexpression;

import java.util.Arrays;
import java.util.List;


public class LambdaExpressionDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,4,5,6,7,8);
		list.stream().filter(data -> data > 4).forEach(data -> System.out.println(data * 2));
		
	}
}
