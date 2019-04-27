package lambda;

import java.util.stream.IntStream;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] filterIntArray = IntStream.of(1,2,3,4,5,6).filter(i -> i > 2).toArray();
		for(int i = 0 ; i < filterIntArray.length ; i++) {
			System.out.println(i);
		}
	}

}
