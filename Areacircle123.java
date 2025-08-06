package oops1;
//package oops1;


class Circle{

    // Method with parameter
    public void Area(double radius) {//file name AreaCircle2.java

        double area = 3.14159 * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }
}

class AreaCircle123{
	public static void main(String[] args) {
        Circle c = new Circle();

        // Calling method with argument
        c.Area (2.5);  // Pass radius as parameter
    }
}
