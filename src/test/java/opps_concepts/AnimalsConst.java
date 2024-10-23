package opps_concepts;

public class AnimalsConst {
	
	String color;
	String name;
	
	public AnimalsConst() {
		
		this.color="White";
		this.name="Cow";
		
		System.out.println("Default Constructor");
	}
	
	public AnimalsConst(String color, String name) {
		
		this.color=color;
		this.name=name;
		
		System.out.println("Parameterised Constructor");
		
	}
	
	public void displayInfo() {
		
		System.out.println("Animal name is "+name+ " and color is "+color);
		
	}
	
	public static void main (String [] args) {
		
		AnimalsConst animals1=new AnimalsConst();
		animals1.displayInfo();
		
		AnimalsConst animals2=new AnimalsConst("Black", "Dog");
		animals2.displayInfo();
		
	}

}
