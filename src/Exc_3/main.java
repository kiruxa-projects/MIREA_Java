package Exc_3;

public class main {
    public static void main(String args[]){

//        Задания 1-3
        System.out.println("");
        Shape s1 = new Circle("RED", false, 5.5); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle) s1).getRadius());
        System.out.println("");

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        System.out.println("");

        Shape s3 = new Rectangle("RED",false,1.0, 2.0); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println("");

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        System.out.println("");

        Shape s4 = new Square(6.6,"RED",false); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(((Square) s4).getSide());
        System.out.println("");

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(((Square) r2).getSide());
        System.out.println(r2.getLength());
        System.out.println("");

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

//        Задание 4
        System.out.println("\nЗадание 4");

        MovableCircle t = new MovableCircle(0,0,5,5,5);
        t.moveDown();
        t.moveRight();
        System.out.println(t);

//        Задание 5

        System.out.println("\nЗадание 5\n____\nДо перемещения");
        MovableRectangle t1 = new MovableRectangle(0,0,5,5,5,5);
        System.out.println(t1);
        System.out.println("____\nПосле перемещения");
        t1.moveDown();
        t1.moveRight();
        System.out.println(t1);
    }
}
