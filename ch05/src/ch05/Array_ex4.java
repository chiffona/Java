package ch05;
import java.util.Arrays;

public class Array_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[45];
		
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		System.out.println(Arrays.toString(ball));
		
		for (int i = 0; i < ball.length; i++) {
			int ranNum = (int)(Math.random() * ball.length);
			int temp = ball[i];
			ball[i] = ball[ranNum];
			ball[ranNum] = temp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d", ball[i]);
			
			if(i != 5)
				System.out.print(", ");
		}
	}

}
