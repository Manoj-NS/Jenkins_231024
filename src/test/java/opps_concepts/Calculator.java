package opps_concepts;

public class Calculator {
	
	/*
	 Method Overloading occurs when multiple methods in the same class have the same name but different parameters 
	 (either in type, number, or both). It's a way to perform polymorphism at compile time.

	  */
	
	//Example of Method Overloading
		
		public int add(int a, int b) {
			
			return a+b;
			
		}
		
		public int add (int a, int b, int c) {
			
			return a+b+c;
		}
		
		public double add(double a, double b) {
			return a+b;
		}
		
		public static void main(String [] args) {
			
			Calculator calc=new Calculator();
			
			System.out.println(calc.add(5, 5));
			System.out.println(calc.add(5, 5,5));
			System.out.println(calc.add(5.5, 5.5));
			
			
		}
}	



		
	


