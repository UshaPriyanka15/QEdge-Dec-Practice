public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method on the object
  }
}
#feature201 changes by ethan developer on Dec21st
public class Main {
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
}
#end of feature201code
#Adding Webhook details here
  public class MethodExample {

    // Method to add two numbers
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        // Creating an object of the class
        MethodExample obj = new MethodExample();

        // Calling the method and storing the result
        int result = obj.addNumbers(5, 7);

        // Printing the result
        System.out.println("The sum is: " + result);
    }
}
