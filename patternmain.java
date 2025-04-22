/* 3Q)write a java program using an abstract class to define a method for pattern printing 
• Create an abstract class named patternprinter with an abstract method printpattern(int n) and a concrete method to display the pattern title 
• Implement two subclasses
 1. Star pattern prints a right angle triangle of Star( *)
 2. Numberpattern-prints a right angled triangle of increasing numbers
• In the main( ) method ,create objects of both subclasses and print the patterns for a given number of rows Expected output:
Pattern 1: 
*
* * 
* * * 
* * * * 
* * * * *
Pattern 2: 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
 */

abstract class patternprinter { 
    abstract  void patternprinting(int n); 
} 
class StarPattern extends patternprinter { 
    void patternprinting(int n) { 
        System.out.println("Star pattern"); 
        for(int i=1;i<=n;i++) { 
            for(int j=1;j<=i;j++) { 
                System.out.print("*"); 
            } 
            System.out.println(); 
        } 
    } 
} 
class Numberpattern extends patternprinter { 
    void patternprinting(int n) { 
        System.out.println("Number pattern"); 
        for(int i=1;i<=n;i++) { 
            for(int j=1;j<=i;j++) { 
                System.out.print(j); 
            } 
            System.out.println(); 
        } 
    } 
} 
public class patternmain { 
    public static void main (String[] args) {
        System.out.println("G.POOJA PRIYANKA,24107,CSE-B");
        StarPattern s = new StarPattern(); 
        Numberpattern n = new Numberpattern(); 
        s.patternprinting(5); 
        n.patternprinting(5); 
    } 
}