package exercise3;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    boolean flag = true;
    for(int i = 2; i < n; i++) {
      if(n % i == 0) flag = false;
    }
    System.out.println("Prime number: " + flag);
  }
}