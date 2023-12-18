import Lib.Rectangle;
import Lib.Point;
class ProjectA {
    public static void main(String args[]){
        System.out.println("Hello Project A");
        Rectangle r1 = new Rectangle(2,5,8,10);
        System.out.println(r1);
        Point p1 = new Point(3,6);
        Point p2 = new Point(1,6);
        System.out.println(r1.contains(p1));
        System.out.println(r1.contains(p2));
    }
}