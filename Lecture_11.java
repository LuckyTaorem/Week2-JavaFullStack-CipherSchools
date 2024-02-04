// Class A is the parent class
class A {
    // A class variable
    int x = 10;
  
    // A class method
    void display() {
      System.out.println("This is class A");
    }
  }
  
  // Class B is the child class of A
  class B extends A {
    // B class variable
    int y = 20;
  
    // B class method
    void show() {
      System.out.println("This is class B");
    }
  }
  
  // Class C is the child class of B
  class C extends B {
    // C class variable
    int z = 30;
  
    // C class method
    void print() {
      System.out.println("This is class C");
    }
  }
  
  // Main class
  public class Lecture_11 {
    public static void main(String[] args) {
      // Create an object of C class
      C c = new C();
  
      // Access the variables and methods of all classes
      System.out.println("x = " + c.x);
      System.out.println("y = " + c.y);
      System.out.println("z = " + c.z);
      c.display();
      c.show();
      c.print();
    }
  }
