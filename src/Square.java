public class Square extends Rectangle{
    public Square(double Side){
       super(Side,Side);
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(100,40);
        System.out.println("Area of Rectangle : "+rectangle.getArea());
        System.out.println("Parameter of Rectangle : "+rectangle.getParameter());
        Square obj = new Square(10);
        System.out.println("\n------------------\nArea of Square : "+obj.getArea());
        System.out.println("Parameter of Square : "+obj.getParameter());
    }
}



