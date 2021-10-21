package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        do{
          char type = input.next().charAt(0);
          double grad = input.nextInt();
          if(type == 'd') {
            double r = grad*Math.PI/180;
            System.out.println("Angle: " + r + "r");
          } else if(type == 'r') {
            double d =  grad*180/Math.PI;
            System.out.println("Angle: " + d + "d");
          }
        }while(flag);
    }
}