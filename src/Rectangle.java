public class Rectangle {
    private double width;
    private double length;
    public Rectangle(double width,double length){
    this.length = length;
    this.width = width;
    }

    public Rectangle() {

    }

    public double getArea(){
        return width * length;
    }
    public double getParameter(){
        return 2*(width + length);
    }
}
