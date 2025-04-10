/* Create a java program with class named ‘MyClass’ with static variable count of int type, initaialized to zero and a constant variable ‘pi’ or type double initialized to 3.14 as attributes of the class.
Now define a constructor for “MyClass”that increments the count variable eachtime an object of MyClass is created.
Finally print the final values of count and pi variables.
Create three objects and a constructor.*/

class Myclass {
    // Static variable count initialized to 0
    static int count = 0; 

    // Constant variable for pi, initialized to 3.14
    final double pi = 3.14159 ;

    // Constructor
    public Myclass() {
        // Increment objects numbers incresing
        count = count+1;
    }

    // Main method to create objects and print values
    public static void main(String[] args) {
        // Creating three objects of MyClass
        Myclass object1 = new Myclass();
        Myclass object2 = new Myclass();
        Myclass object3 = new Myclass();
        Myclass object4 = new Myclass();
        Myclass object5 = new Myclass();
        // Printing count and pi
        System.out.println("G. POOJA PRIYANKA ,24107,CSE-B");
        System.out.println("Final count of objects created: " + count);
        System.out.println("Value of pi: " + object1.pi);  
    }
}
