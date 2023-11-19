package c4.sample;

public class Father
 
{

    protected String name;
    protected int age;

    public Father(String name, int age)
 
	{
        this.name = name;
        this.age = age;
    }
}

class ChildClass extends Father {

    public ChildClass(String name, int age) {
        super(name, age);
    }

    public void accessProtectedInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

 class Main {

    public static void main(String[] args) {
        c4.sample.ChildClass childClass = new c4.sample.ChildClass("anvd", 20);
        childClass.accessProtectedInfo();
    }
}