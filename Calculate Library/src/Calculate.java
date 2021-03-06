
//Leonard Wang 8/30/16, 1 period
public class Calculate {
	//Number to be squared
	public static int square(int numToBeSquared){
		return numToBeSquared*numToBeSquared;
	} 
	//number to be cubed
	public static int cube(int numToBeCubed){
		return numToBeCubed*numToBeCubed*numToBeCubed;
	}
	//average method with 2 parameters
	public static double average(double num1, double num2){
		return (num1+num2)/2;
	}
	//average method with 3 parameters
	public static double average(double num1, double num2, double num3){
		return (num1+num2+num3)/3;
	}
	//Converts to degrees
	public static double toDegrees(double radians){
		return (180*radians)/3.14159;
	}
	//converts to radians
	public static double toRadians(double degrees){
		return 3.14159*degrees/(180);
	}
	//returns discriminant
	public static double discriminant(double a, double b, double c){
		return((b*b)-(4*a*c));
	}
	//changes numbers to an improper fraction
	public static String toImproperFrac(int addend1, int addend2, int addend3){
		int numerator = (addend1*addend3) + addend2;
		return (numerator + "/" + addend3);
	}
	//changes numbers to a mixed number
	public static String toMixedNum(int number1, int denominator){
		int wholeNumber = number1/denominator;
		int numerator = number1%denominator;
		if(numerator != 0){
			return(wholeNumber + "_" + numerator + "/" + denominator);
		} else{
			return(wholeNumber + "");
		}
	}
	//returns the foil of a quadratic
	public static String foil( int a, int b, int c, int d, String x){
		if((b*c) + (d*a) < 0 && (d*b) < 0){
			return((a*c) + x +"^2  - " + ((b*c)+(d*a))*-1 + x + " - " +  d*b*-1);
		} else if((b*c) + (d*a) < 0){
			return((a*c) + x +"^2  - " + ((b*c)+(d*a))*-1 + x + " + " +  d*b);
		} else if((d*b) < 0){
			return((a*c) + x +"^2  + " + ((b*c)+(d*a)) + x + " - " +  d*b*-1);
		} else{
		return((a*c) + x +"^2  + " + ((b*c)+(d*a)) + x + " + " +  d*b);
		}
	}
	//tells if its divisble or not
	public static boolean isDivisibleBy(int dividend, int divisor){
		if(divisor < 0){
			throw new IllegalArgumentException("Input is negative");
		}
		if(dividend%divisor ==0){
			return true;
		}
		else{
			return false;
		}
	}
	//returns absolute value
	public static double absValue(double num1){
		if(num1 < 0){
			return num1*-1;
		}
		else{
			return num1;
		}
	}
	//max of a number
	public static int max(int num1, int num2){
		if(num1>num2){
			return num1;
		}
		else{
			return num2;
		}
	}
	//max with 3 parameters
	public static double max(double num1, double num2, double num3){
		if(num1>num2 && num1>num3){
			
			return num1;
		}
		else if(num2>num1 && num2>num3){
			return num2;
		}
		else{
			return num3;
		}
	}
	//returns min of a number
	public static double min(double num1, double num2){
		if(num1<num2){
			return num1;
		}
		else{
			return num2;
		}
	}
	//rounds number to 2 decimal places
	public static double round2 (double numToBeRounded){
		int answer = ((int)(numToBeRounded * 100));
		 if ((numToBeRounded * 100)-answer >= .5){
			 double roundup = ((int)(numToBeRounded*100)+1)/100.00;
			 return roundup;		
		 }
		 
		 else {
			 double rounddown = (int)(numToBeRounded*100)/(100.00);
			 return rounddown;
		 }
	}
	//returns value to a certain exponent
	public static double exponent(double base, double power){
		if(power < 0){
			throw new IllegalArgumentException("Input is negative");
		}
		double answer = 1.0;
		for(int i = 0; i < power; i++){
			answer *= base;
		}
		return answer;
	}
	//returns factorial
	public static int factorial(int num1){
		int answer = 1;
		if(num1 < 0){
			throw new IllegalArgumentException("Input is negative");
		}
		for(int i = 1; i <= num1; i++){
			answer *= i;
		}
		return answer;
	}
	//returns if a number is prime or not
	public static boolean isPrime(int num1){
		boolean s = true;
		for(int i = 2; i < num1; i++){
			if(s = Calculate.isDivisibleBy(num1, i)){
				return false;
			}else{
				s = true;
			}
		}
		return s;
	}
	//returns the greatest common factor
	public static int gcf(int num1, int num2){
		boolean d = true;
		if(d = Calculate.isDivisibleBy(num1, num2)){
			return num2;
		}
		if(num2 == 0){
			return num2;
		}else{
			return gcf(num2, num1%num2);
			}
	}
	//returns the square root of a number
	public static double sqrt(double a){
		if(a < 0){
			throw new IllegalArgumentException("Input is negative");
		}
		double t;
		 
		double squareRoot = a / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (a / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
	//returns the roots of a quadratic equation
	public static String quadForm(int a, int b, int c){
		double x = (double)(a);
		double y = (double)(b);
		double z = (double)(c);
		double solution1 = 0;
		double solution2 = 0;
		String returnValue = "";
		String returnValue2 = "";
		//if discriminant is less than 0
		if(Calculate.discriminant(a, b, c) < 0){
			returnValue = "no real roots";
			return returnValue;
		} else if(Calculate.discriminant(a, b, c) == 0){
			solution1 = -b/2*a;
			solution1 = Calculate.round2(solution1);
			returnValue = String.valueOf(solution1);
			return returnValue;
		} else{
			solution1 = Calculate.round2((-b - (Calculate.sqrt(Calculate.discriminant(x, y, z))))/(2*a));
			solution2 = Calculate.round2((-b + (Calculate.sqrt(Calculate.discriminant(x, y, z))))/(2*a));
			if(solution1>solution2){
				returnValue = String.valueOf(solution1);
				returnValue2 = String.valueOf(solution2);
				return solution2 + " and " + solution1;
			} else{
				return solution1 + " and " + solution2;
			}
		}
	}

	
}

