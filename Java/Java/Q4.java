/*Write a program that defines a sphere class with three constructors. The first form accepts no arguments.
 It assumes the sphere is centred at the origin and has a radios of one unit. The second form accepts one 
 double value that represents the radios of the sphere. It assumes the sphere is centred at the origin. 
 The third form accepts three double arguments. These specify the coordinates of the centre and radios. 
 Overload the constructors with the appropriate use of it.  */

class Sphere {

    private double x;
    private double y;
    private double z;
    private double Radius;

    Sphere() {
        x = 0;
        y = 0;
        z = 0;
        Radius = 1;
    }

    Sphere(double Radius) {
        this.Radius = Radius;
    }

    Sphere(double x, double y, double z, double Radius) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.Radius = Radius;
    }

    public double getX() {
        return x;
    }

    public void getX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void getY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void getZ(double z) {
        this.z = z;
    }

    public double getRadius() {
        return Radius;
    }

    public void getRadius(double Radius) {
        this.Radius = Radius;
    }

}

public class Q4 {

    public static void main(String args[]) {

        Sphere sp = new Sphere();
        System.out.println("Sphere 1: X -> " + sp.getX() + " Y -> " + sp.getY() + " Z -> " + sp.getZ() +
                " Radius -> " + sp.getRadius());

        Sphere sp1 = new Sphere();
        System.out.println("Sphere 2: X -> " + sp1.getX() + " Y -> " + sp1.getY() + " Z -> " + sp1.getZ() +
                " Radius -> " + sp1.getRadius());

        Sphere sp2 = new Sphere();
        System.out.println("Sphere 3: X -> " + sp2.getX() + " Y -> " + sp2.getY() + " Z -> " + sp2.getZ() +
                " Radius -> " + sp2.getRadius());

    }

}
