public class hw01{
    public static void main(String[] args) {
        //建立類別
        Shape shape1 = new Shape(11.77); 
        Shape shape2 = new Shape(6.5, 8.5); 
        Shape shape3 = new Shape(3.0, 6.0, 60);
        //周長
        System.out.println(shape1.getPerimeter()); 
        System.out.println(shape2.getPerimeter()); 
        System.out.println(shape3.getPerimeter()); 
        //面積
        System.out.println(shape1.getArea()); 
        System.out.println(shape2.getArea()); 
        System.out.println(shape3.getArea()); 
        //物件個數
        System.out.println(Shape.getCount());

    }
}