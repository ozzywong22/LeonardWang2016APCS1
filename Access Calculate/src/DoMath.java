//Class to call and test all calculate functions
//Leonard Wang 1st period, 9/23/16
public class DoMath {
 
	public static void main(String[] args) {
			System.out.println("The result of the method square in the Calculate library is " + Calculate.square(5));
			System.out.println("The result of the method cube in the Calculate library is " + Calculate.cube(5));
			System.out.println("The result of the method average in the Calculate library is " + Calculate.average(5, 2));
			System.out.println("The result of the method average in the Calculate library is " + Calculate.average(5, 5, 5));
			System.out.println("The result of the method toDegree in the Calculate library is " + Calculate.toDegrees(5));
			System.out.println("The result of the method toRadian in the Calculate library is " + Calculate.toRadians(180));
			System.out.println("The result of the method discrimminant in the Calculate library is " + Calculate.discriminant(5, 2, 3));
			System.out.println("The result of the method toImproperFrac in the Calculate library is " + Calculate.toImproperFrac(2, 1, 2));
			System.out.println("The result of the method toMixedNum in the Calculate library is " + Calculate.toMixedNUm(5, 2));
			System.out.println("The result of the method foil in the Calculate library is " + Calculate.foil(5, -2, 3, 4, "x"));
			System.out.println("The result of the method isDivisbleBy in the Calculate library is " + Calculate.isDivisibleBy(10, 10));
			System.out.println("The result of the method absValue in the Calculate library is " + Calculate.absValue(5));
			System.out.println("The result of the method max in the Calculate library is " + Calculate.max(5, 10));
			System.out.println("The result of the method max in the Calculate library is " + Calculate.max(5, 10, 15));
			System.out.println("The result of the method min in the Calculate library is " + Calculate.min(5.0, 10.0));
			System.out.println("The result of the method round2 in the Calculate library is " + Calculate.round2(3.146));
			System.out.println("The result of the method exponent in the Calculate library is " + Calculate.exponent(2, 3));
			System.out.println("The result of the method factorial in the Calculate library is " +Calculate.factorial(3));
			System.out.println("The result of the method isPrime in the Calculate library is " + Calculate.isPrime(5));
			System.out.println("The result of the method gcf in the Calculate library is " + Calculate.gcf(200, 65));
			System.out.println("The result of the method sqrt in the Calculate library is " + (Calculate.sqrt(100.0)));
			System.out.println("The result of the method quadform in the Calculate library is " + Calculate.quadForm(-1, 32, 10));
		

	}

}
