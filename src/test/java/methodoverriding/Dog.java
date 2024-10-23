package methodoverriding;

public class Dog extends Animal2 {
	
	public void sound(){
		
		super.sound();
		System.out.println("Dog barks");
	}

}
