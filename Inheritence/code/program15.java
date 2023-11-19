
// Abstract class Animal
abstract class Animal {
    public abstract void sound();
}

class Lion extends Animal {

    public void sound() {
        System.out.println("Lion roars!");
    }
}

class Tiger extends Animal {

    public void sound() {
        System.out.println("Tiger growls!");
    }
}


class MainA 
{
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.sound(); 

        Animal tiger = new Tiger();
        tiger.sound(); 
    }
}
