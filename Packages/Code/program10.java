// Package declaration
package pack1;

// Public class with public members
public class Package10 {

    public String name;
    public int age;

    public Package10(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printPublicInfo() {
        System.out.println("Public Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Class that accesses the public members of ParentClass
class ChildClass {

    public static  void main(String arr[]) {
        // Create an instance of ParentClass
        Package10 parentClass = new Package10("John Doe", 30);

        // Access public members of ParentClass
        System.out.println("Accessing public information from ChildClass:");
        System.out.println("Name: " + parentClass.name);
        System.out.println("Age: " + parentClass.age);

        // Call the public method of ParentClass
        System.out.println("\nCalling public method from ChildClass:");
        parentClass.printPublicInfo();
    }
}