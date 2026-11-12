
package rono_problem2.java;

import java.util.Scanner;

public class Rono_Problem2Java {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

input.useDelimiter("[^0-9-]+");

int num1 = input.nextInt();
int num2 = input.nextInt();

int result = gcd(num1, num2);

if (num1 < 0 || num2 < 0) {
    System.out.print("Invalid Input.");

} else if (num1 == 0 && num2 == 0) {
    System.out.println("Undefined - handle in main()");

} else {
    System.out.println(result);

}
input.close();
}

public static int gcd(int num1, int num2) {
    if (num2 == 0) {
        return num1;
    }
    return gcd(num2, num1 % num2);

}

    
    
}
