public class shape{
    double l;
    double b;
    double area;
    void calarea(double l,double b){
    area=l*b;
    System.out.println("rect area="+area);
    }
    void calarea(int b){
    area=3.14*b*b;
    System.out.println("cir area="+area);
    }
    }
    class cir extends shape{
    void calarea(int b){
    area=3.14*b*b;
    System.out.println("cir area="+area);
    }
    public static void main(String[] args){
    shape s1=new shape();
    s1.calarea(5,6);
    s1.calarea(2);
    }
    } 