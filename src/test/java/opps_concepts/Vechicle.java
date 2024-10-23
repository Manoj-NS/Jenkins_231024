package opps_concepts;

public class Vechicle {
	
	String bike;
	String color;
	
	public Vechicle(String bike, String color) {    // Constructor
		
		this.bike=bike;
		this.color=color;
	}
	
	public void vechicleType() {
		
		System.out.println("Care name is "+bike+" bike name is "+color);
	}
	
//	public class Main {								// Object for the constructor
		public static void main (String[] args) {
			
			Vechicle myVechicle = new Vechicle("TVS","Black");
			myVechicle.vechicleType();
		}
		
		
//	}

}
