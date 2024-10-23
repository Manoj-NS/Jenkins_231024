package opps_concepts;

public class CarConst {

	    // Fields
	    String model;
	    String color;

	    // Default Constructor
	    public CarConst() {
	        this.model = "Unknown";
	        this.color = "White";
	        System.out.println("Default Constructor called");
	    }

	    // Parameterized Constructor
	    public CarConst(String model, String color) {
	        this.model = model;
	        this.color = color;
	        System.out.println("Parameterized Constructor called");
	    }

	    public void displayInfo() {
	        System.out.println("Model: " + model + ", Color: " + color);
	    }

	    public static void main(String[] args) {
	        // Using the default constructor
	        CarConst car1 = new CarConst();
	        car1.displayInfo(); // Output: Model: Unknown, Color: White

	        // Using the parameterized constructor
	        CarConst car2 = new CarConst("Toyota", "Red");
	        car2.displayInfo(); // Output: Model: Toyota, Color: Red
	    }
	}

