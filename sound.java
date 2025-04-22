/* Write a Java program to create an abstract class Animal with an abstract method called sound().
Create subclasses Lion and Tiger that extend the Animal class and
 implement the sound() method to make a specific sound for each animal.  */

// Abstract class
abstract class animal00 {
    // Abstract method
    abstract void sound();
}

// Subclass: Lion
class lion extends animal00 {
    @Override
    void sound() {
        System.out.println("Lion roars....");
    }
}

// Subclass: Tiger
class tiger extends animal00 {
    @Override
    void sound() {
        System.out.println("Tiger roars....");
    }
}

// Main class
class sound {
    public static void main(String[] args) {
        System.out.println("G.POOJA PRIYANKA,24107,CSE-B");
        animal00 lion = new lion();
        animal00 tiger = new tiger();
        lion.sound();  
        tiger.sound();  
    }
}

