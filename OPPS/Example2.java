package OPPS;
// In this example we work know Method Overloading which is complie time Polymorphism along with Inheritance Also.

class Shape {
    int len;
    int width;
    int height;

    void getData(int x, int y, int z) {
        len = x;
        width = y;
        height = z;
    }
}

class Perimeter extends Shape {
    int peri;
    double circum;

    // Here we are using Method Overloading, As we have already getData Method in
    // Shape Class which take three arguments but this one get two arguments only.
    // Also getPeri Method name is used 2 times but we change the number of Parameters as condition.
    public void getData(int x, int y) {
        len = x;
        width = y;
    }

    public void getPeri(int len, int width) {
        peri = 2 * (len + width);
        System.out.println("Perimeter is " + peri);
    }

    public void getPeri(int len) {
        peri = 4 * len;
        System.out.println("Perimeter is " + peri);
    }

    public void getCircum(int width){
        circum = 2 * 3.14 * width;
        System.out.println("Circumference of Circle  " + circum);
    }

}

class Area extends Shape {
    int area;

    // Here we are using Method Overloading, As we have already getData Method in
    // Shape Class which take three arguments but this one get two arguments only.
    public void getData(int x, int y) {
        len = x;
        width = y;
    }

    public void getArea() {
        area = len * width;
        System.out.println("Area is " + area);
    }
}

public class Example2 {
    public static void main(String args[]) {
        // Calling Constructor
        Area tri = new Area();
        tri.getData(5, 6);
        tri.getArea();

        Perimeter rect = new Perimeter();
        rect.getData(10, 20);
        rect.getPeri(4);

        Perimeter circle = new Perimeter();
        circle.getCircum(4);

    }
}
