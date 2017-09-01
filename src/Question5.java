import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Triangle test1 = new Triangle();
        test1.findAllDistances();
        test1.isReal();

        Triangle test2 = new Triangle();
        test2.findAllDistances();
        test2.isReal();

        Triangle test3 = new Triangle();
        test3.findAllDistances();
        test3.isReal();

    }
}
class Point {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

}
class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(){
        Scanner input = new Scanner(System.in);
        int x,y;

        System.out.print("Coordinates for point 1 are: ");
        x = input.nextInt();
        y = input.nextInt();

        Point p1 = new Point(x,y);

        System.out.print("Coordinates for point 2 are: ");
        x = input.nextInt();
        y = input.nextInt();

        Point p2 = new Point(x,y);

        System.out.print("Coordinates for point 3 are: ");
        x = input.nextInt();
        y = input.nextInt();

        Point p3 = new Point(x,y);

        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void isReal(){
        double side1,side2,side3;

        boolean real = true;
        side1 = findDistance(this.p1, this.p2);
        side2 = findDistance(this.p2, this.p3);
        side3 = findDistance(this.p1, this.p3);

        if((side1 + side2) <= side3){
            real = false;
        }else if((side1 + side3) <= side2){
            real = false;
        }else if((side3 + side2) <= side1){
            real = false;
        }
        if(real){
            System.out.println("This is a real triangle.");
        }else{
            System.out.println("this is not a real triangle.");
        }
        System.out.println();

    }
    public void findAllDistances(Point p1, Point p2, Point p3){

        System.out.print("Length of side 1 is: ");
        System.out.printf("%4f\n",findDistance(p1, p2));
        System.out.print("Length of side 2 is: ");
        System.out.printf("%4f\n",findDistance(p2, p3));
        System.out.print("Length of side 3 is: ");
        System.out.printf("%4f\n",findDistance(p1, p3));


    }
    public void findAllDistances(){

        findAllDistances(this.p1,this.p2,this.p3);


    }
    public double findDistance (Point p1, Point p2){
        return Math.sqrt((Math.pow((p1.getX() - p2.getX()),2) + (Math.pow((p1.getY() - p2.getY()),2))));
    }
}
