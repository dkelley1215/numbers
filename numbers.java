import java.util.Scanner;

public class numbers1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int sum;
        int average;
        int product;
        int largest;
        int smallest;

        System.out.print("Enter First Integer: ");
        num1 = input.nextInt();

        System.out.print("Enter Second Integer: ");
        num2 = input.nextInt();

        System.out.print("Enter Third Integer: ");
        num3 = input.nextInt();
        
        System.out.print("Enter Fourth Integer: ");
        num4 = input.nextInt();

        System.out.print("Enter Fifth Integer: ");
        num5 = input.nextInt();


        sum = num1 + num2 + num3 + num4 + num5;
        average = sum / 5;
        product = num1 * num2 * num3 * num4 * num5;

        largest = num1;
        smallest = num1;

        if(num2 > largest)
            largest = num2;

        if(num3 > largest)
            largest = num3;
        
        if(num4 > largest)
            largest = num4;
        
        if(num5 > largest)
            largest = num5;

        if(num2 < smallest)
            smallest = num2;

        if (num3 < smallest)
            smallest = num3;
        
        if (num4 < smallest)
            smallest = num4;
        
        if (num5 < smallest)
            smallest = num5;

        System.out.println("The sum is " + sum);

        System.out.println("The average is " + average);

        System.out.println("The product is " + product);

        System.out.println("Largest of the five integers is " + largest + " and the smallest is "+ smallest + ".");
    }
}
