public class cal {
    double sum; 
    void add(int a, int b) {
        sum = a + b;
        System.out.println("Sum is = " + sum);
    }

    void add(double a, double b) {
        sum = a + b;
        System.out.println("Sum is = " + sum);
    }

    void add(int a, int b, int c) {
        sum = a + b + c;
        System.out.println("Sum is = " + sum);
    }
    public static void main(String[] args) {
        cal c1 = new cal();
        c1.add(2, 7, 3); 
        c1.add(3,4);
        c1.add(3.2, 6.7);
    }
} 
