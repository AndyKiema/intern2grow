import java.util.Scanner;

public class AreaCalculator{
    public static void main(String[] args) {
        System.out.println("Welcome to the Area Calculator");
        System.out.println("What is the shape you want to calculate the area of?Enter 1, 2 or 3 to select from the list of shaped below");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        Scanner sc=new Scanner(System.in);
        while(true){
            int shape=sc.nextInt();
            if(shape==1 || shape==2 ||shape==3){
               break;
            }
            else{
                System.out.println("?Enter 1, 2 or 3 to select from the list of shaped below");
            }
        }
        
    }
}