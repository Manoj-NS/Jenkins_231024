package opps_concepts;

public class Calculator1 {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(5, 5));
		System.out.println(calc.add(5, 5,5));
		System.out.println(calc.add(3.5,4.5));
	}
	

}
