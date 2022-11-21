import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {

        System.out.println("Enter 3 numbers");
        System.out.println("Enter 1 to find largest among 3 numbers");
        System.out.println("Enter 2 to find smallest among 3 numbers");
        System.out.println("Enter 3 to check prime or not");
        System.out.println("Enter 4 to check even or odd");
        System.out.println("Enter 5 to reverse a number");
        System.out.println("Enter 6 to exit");
    }

    void largest()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x>y && x>z)
        {
            System.out.println("x is larger");

        }
        if(y>x && y>z)
        {
            System.out.println("y is greater");
        }
        if(z>x && z>y)
        {
            System.out.println("z is greater");
        }

    }

    void smallest()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x<y && x<z)
        {
            System.out.println("x is smallest");

        }
        if(y<x && y<z)
        {
            System.out.println("y is smallest");
        }
        if(z<x && z<y)
        {
            System.out.println("z is smallest");
        }

    }

}