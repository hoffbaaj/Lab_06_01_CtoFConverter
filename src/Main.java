import javax.swing.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double cel = 0;
        double far = 0;


        System.out.print("Enter your C temperature ");

        if(in.hasNextDouble())
        {
            cel = in.nextDouble();
            far = (cel * 2) + 30;
            System.out.println("The temperature you enter in C is " + far + " in Fahrenheit ");
        }
        else
        {
            System.out.println("That is not a correct input");
        }

    }
}