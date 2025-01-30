public class Rectangle {
    private double width;
    private double height;
public Rectangle(double width,double height){
    this.width = width;
    this.height = height;
};
public double area(){
    return this.width*this.height;
};
public double perimeter(){
    return (this.width+this.height)*2;
} 
public double getWidth(){
    return this.width;
};
public double getHeight(){
    return this.height;
};
}
