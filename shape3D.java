/* Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea().
Create subclasses Sphere and Cube that extend the Shape3D class and
implement the respective methods to calculate the volume and surface area of each shape */

abstract class shp {
    abstract double CalculateVolume();
    abstract double CalculateSurfaceArea();
}

class Sphere extends shp {
    double radius;

    Sphere(double r) {
        this.radius = r;
    }
    double CalculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
    double CalculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}

class Cube extends shp {
    double side;

    Cube(double s) {
        this.side = s;
    }
    double CalculateVolume() {
        return side * side * side;
    }
    double CalculateSurfaceArea() {
        return 6 * side * side;
    }
}

public class shape3D {
    public static void main(String[] args) {
        shp s = new Sphere(5.0);
        shp c = new Cube(4.0);
        System.out.println("G.POOJA PRIYANKA,24107,CSE-B");
        System.out.println("Volume of Sphere: " + s.CalculateVolume());
        System.out.println("Surface Area of Sphere: " + s.CalculateSurfaceArea());
        System.out.println("Volume of Cube: " + c.CalculateVolume());
        System.out.println("Surface Area of Cube: " + c.CalculateSurfaceArea());
    }
}
