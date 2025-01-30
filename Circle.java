import java.lang.Math;
public class Circle {
    private double radius;
    private final double PI =Math.PI;
    public Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return this.PI*(this.radius*this.radius);
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
this.radius=radius;
    }
}
