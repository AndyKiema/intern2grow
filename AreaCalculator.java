import java.util.Scanner;

public class AreaCalculator{
    public static void main(String[] args) {
        System.out.println("Welcome to the Area Calculator");
        System.out.println("What is the shape you want to calculate the area of?Enter 1, 2 or 3 to select from the list of shapes below");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        Scanner sc=new Scanner(System.in);
        int shape;
        while(true){
            shape=sc.nextInt();
            if(shape==1 || shape==2 ||shape==3){
               break;
            }
            else{
                System.out.println("Enter 1, 2 or 3 to select from the list of shapes below");
                System.out.println("1. Square");
                System.out.println("2. Rectangle");
                System.out.println("3. Circle");
            }
        }
        if(shape==1){
           System.out.println("Enter the length of the square in centimetres");
           int squarelength=sc.nextInt();
           long squarearea=squarelength*squarelength;
           System.out.println("The area of the square is "+squarearea+" centimetres");
        }
        else if(shape==2){
            System.out.println("Enter the length of the rectangle in centimetres");
            int rectanglelength=sc.nextInt();
            System.out.println("Enter the width of the rectangle in centimetres");
            int rectanglewidth=sc.nextInt();
            long rectanglearea=rectanglelength*rectanglewidth;
            System.out.println("The area of the rectangle is "+rectanglearea+" centimetres");
        }
        else{
            System.out.println("Enter the radius of the circle in centimetres");
            int circleradius=sc.nextInt();
            double pi=3.1429;
            double carea=pi*(circleradius*circleradius);
            int circlearea=(int)carea;
            System.out.println("The area of the circle is "+circlearea+" centimetres");
        }
    }
}