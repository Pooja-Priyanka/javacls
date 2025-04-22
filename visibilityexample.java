class visibilityexample {
    public int publicvariable = 10;                                                         //variables
    private int privatevariable = 20;
    public void publicmethod() {                                                            //methods
        System.out.println("this is public method");
    }
    private void privatemethod() {
        System.out.println("this is private method");
    }
}
class main10{                                                                                                //main class
    public static void main(String[] args) {
        System.out.println("G.POOJA PRIYANKA,24107,CSE-B");
        visibilityexample v1 = new visibilityexample();
        v1.publicmethod();
        v1.privatemethod();
    }
}