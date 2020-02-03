package java8;

public class MathExercise {

	public static void main(String[] args) {
		float i = 5.2f;
		float j = 5.8f;
		 
		Math.round(i); // output = 5, since the decimal point is below 5
		Math.round(j); // output = 6, since the decimal point is above 5
		 
		float k = 8.3f;
		 
		Math.ceil(k); // output = 9
		 
		Math.floor(k); // output = 8
	}

}
