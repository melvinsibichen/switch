import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        System.out.println("Enter 1 to find largest among 3 numbers");
        System.out.println("Enter 2 to find smallest among 3 numbers");
        System.out.println("Enter 3 to check prime or not");
        System.out.println("Enter 4 to check even or odd");
        System.out.println("Enter 5 to reverse a number");
        System.out.println("Enter 6 to exit");
        int z=sc.nextInt();
        switch(z)
        {
            case 1: largest();
                break;
            case 2: smallest();
                break;
            case 3: prime();
                break;
            case 4: oddeven();
                break;
            case 5: reverse();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("wrong input");
        }

    }

  static  void largest()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x>y && x>z)
        {
            System.out.println(x+" is larger");

        }
        if(y>x && y>z)
        {
            System.out.println(y+" is larger");
        }
        if(z>x && z>y)
        {
            System.out.println(z+" is larger");
        }

    }

   static void smallest()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x<y && x<z)
        {
            System.out.println(x+" is smallest");

        }
        if(y<x && y<z)
        {
            System.out.println(y+" is smallest");
        }
        if(z<x && z<y)
        {
            System.out.println(z+" is smallest");
        }

    }

  static  void prime()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int flag=0;

        int x=sc.nextInt();
        if(x==0||x==1){
            System.out.println(x+" is not prime number");
        }else{
            for(int i=2;i<=x;i++){
                if(x%i==0){
                    System.out.println(x+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(x+" is prime number"); }
        }}

 static void oddeven()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int x=sc.nextInt();
    if(x%2==0)
    {
        System.out.println("even number");

    }
    else
    {
        System.out.println("odd number");
    }
}
static void reverse()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number to reverse");
    int x=sc.nextInt();
    int reverse=0;
    while(x!=0)
    {
       int reminder =x % 10;
       reverse=reverse*10+reminder;
       x=x/10;

    }
    System.out.println("reversed number is ="+reverse);
}


    }

