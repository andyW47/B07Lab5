public class Circle{

Point center;
double radius;

public Circle(Point center, double radius){

    this.center = center;
    this.radius = radius;

}

public double circumference(){

    return 2*radius*Math.PI;

}

public double calculateArea(){

    return Math.PI*(Math.pow(radius,2));


}

}