package demo;

public class demo {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Aditya");
		System.out.println("ABC");

		int number1 = 100;
		int number2 = 200;
		int add = number1 + number2;
		int sub = number1 - number2;
		int mul = number1 * number2;
		int mod = number1 % number2;

		System.out.println("Add of " + number1 + " and " + number2 + " is = " + add);
		System.out.println("Sub of " + number1 + " and " + number2 + " is = " + sub);
		System.out.println("Mul of " + number1 + " and " + number2 + " is = " + mul);
		System.out.println("Mod of " + number1 + " and " + number2 + " is = " + mod);

		// Operator
		number1++;
		System.out.println("the increment value of no1 is =" + number1);
		number2--;
		System.out.println("The decrement value of no2 is=" + number2);
		System.out.println("the equal to operator is=" + (number1 == number2));

		System.out.println("the not equal to operator is=" + (number1 != number2));
		System.out.println(number1 > number2);
		System.out.println(number1 < number2);
		System.out.println(number1 >= number2);
		System.out.println(number1 <= number2);

		// Logical Operators
		// AND

		System.out.println((number1 == number2) && (number1 > number2));
		System.out.println((number1 != number2) && (number1 > number2));
		System.out.println((number1 == number2) && (number1 < number2));
		System.out.println((number1 != number2) && (number1 < number2));

		// OR

		System.out.println((number1 == number2) || (number1 > number2));
		System.out.println((number1 != number2) || (number1 > number2));
		System.out.println((number1 == number2) || (number1 < number2));
		System.out.println((number1 != number2) || (number1 < number2));

		// NOT

		System.out.println(!(number1 > number2));
		System.out.println(!(number1 < number2));
		System.out.println(!(number1 != number2));

		// Bitwise Operator
		// Bitwise AND Operator

		System.out.println(1 & 3);
		System.out.println(9 & 10);
		System.out.println(4 & 6);

		// Bitwise OR
		System.out.println(1 | 3);
		System.out.println(9 | 10);
		System.out.println(4 | 6);

		// Bitwise XOR

		System.out.println(1 ^ 3);
		System.out.println(9 ^ 10);
		System.out.println(4 ^ 6);

		// Bitwise NOT~
		int a = 80;
		int b = ~a;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(b);

		// Left Shift

		System.out.println(1 << 3);
		System.out.println(9 << 10);
		System.out.println(4 << 6);

		// Right Operator

		System.out.println(1 >> 3);
		System.out.println(9 >> 10);
		System.out.println(4 >> 6);

	}

}
