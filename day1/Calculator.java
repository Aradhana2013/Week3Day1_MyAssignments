package week3.day1;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a+b);

	}

	public void add(int a, int b, int c) {
		System.out.println(a+b+c);

	}

	public void multiple(double x, double y) {
		System.out.println(x*y);

	}

	public void multiple(int x, double y) {
		System.out.println(x*y);

	}


	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(2, 3);
		calc.add(2, 3, 4);
		calc.multiple(4, 5);
		calc.multiple(5, 6);

	}

}
