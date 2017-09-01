import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        Circle c4 = new Circle();
        Circle c5 = new Circle();

        System.out.println("Circle 1:");
        c1.printCircle();

        System.out.println("Circle 2:");
        c2.printCircle();

        System.out.println("Circle 3:");
        c3.printCircle();

        System.out.println("Circle 4:");
        c4.printCircle();

        System.out.println("Circle 5:");
        c5.printCircle();

        System.out.println("Testing circle 1 and 2 for overlap:");
        areTouching(c1,c2);

        System.out.println("Testing circle 1 and 3 for overlap:");
        areTouching(c1,c3);

        System.out.println("Testing circle 1 and 4 for overlap:");
        areTouching(c1,c4);

        System.out.println("Testing circle 1 and 5 for overlap:");
        areTouching(c1,c5);

        System.out.println("Testing circle 2 and 3 for overlap:");
        areTouching(c2,c3);

        System.out.println("Testing circle 2 and 4 for overlap:");
        areTouching(c2,c4);

        System.out.println("Testing circle 2 and 5 for overlap:");
        areTouching(c2,c5);

        System.out.println("Testing circle 3 and 4 for overlap:");
        areTouching(c3,c4);

        System.out.println("Testing circle 3 and 5 for overlap:");
        areTouching(c3,c5);

        System.out.println("Testing circle 4 and 5 for overlap:");
        areTouching(c4,c5);




    }
    public static void areTouching(Circle c1, Circle c2){
        double distanceBetweenCenters = distanceBetweenCenters(c1,c2);
        double radiusAdd = c1.getRadius() + c2.getRadius();
        double radiusSub = Math.abs(c1.getRadius() - c2.getRadius());

        if((c1.getCenter().getX() == c2.getCenter().getX() && c1.getCenter().getY() == c2.getCenter().getY()) && c1.getRadius() == c2.getRadius()){
            System.out.println("The circles are the same and are completely overlapping each other.");
        }else if(distanceBetweenCenters > radiusAdd){
            System.out.println("The circles are separate from each other");
        }else if (distanceBetweenCenters < radiusSub){
            System.out.println("The circles are complete within each other");
        }else{
            if(distanceBetweenCenters == radiusAdd){
                System.out.println("The circles intersect once.");
            }else{
                System.out.println("The circles intersect twice.");
            }
        }

        System.out.println();

    }

    public static double distanceBetweenCenters(Circle c1, Circle c2){

        int c1x, c1y;
        int c2x, c2y;

        c1x = c1.getCenter().getX();
        c1y = c1.getCenter().getY();

        c2x = c2.getCenter().getX();
        c2y = c2.getCenter().getY();

        return  Math.sqrt(Math.pow((c1x-c2x),2) + Math.pow((c1y-c2y),2));
    }

}
class Center {
    private int x;
    private int y;


    public Center(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

class Circle{
    private Center center;
    private double radius;

    Circle(){

        Scanner input = new Scanner (System.in);
        int x, y;
        double radius;

        System.out.println("The center point of the circle: ");
        x = input.nextInt();
        y = input. nextInt();

        this.center = new Center(x,y);

        System.out.println("The radius of the circle: ");
        radius = input.nextDouble();

        this.radius = radius;
    }

    public void printCircle (){
        System.out.println("The center of the circle is: (" + center.getX() + "," + center.getY() + ")");
        System.out.println("The radius of the circle is: " + radius);
        System.out.println();
    }

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
