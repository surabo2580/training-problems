import java.util.Scanner;

public class LabTwo {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number- ");
        int a= sc.nextInt();
        System.out.print("Enter second number- ");
        int b= sc.nextInt();
        System.out.print("Enter third number- ");
        int c= sc.nextInt();
        System.out.print("Enter n ");
        int n= sc.nextInt();

        if(n<a&&n<b&&n<c)

        {

            if(a<b&&a<c)

                System.out.println("L1");

            else if(b<c)

                System.out.println("L2");

            else

                System.out.println("L3");

        }

        else if(n<a&&n<b)

        {

            if(a<b)

                System.out.println("L1");

            else

                System.out.println("L2");

        }

        else if(n<a&&n<b)

        {

            if(a<c)

                System.out.println("L1");

            else

                System.out.println("L3");

        }

        else if(n<b&&n<c)

        {

            if(b<c)

                System.out.println("L2");

            else

                System.out.println("L3");

        }

        else if(n<a)

            System.out.println("L1");

        else if(n<b)

            System.out.println("L2");

        else if(n<c)

            System.out.println("L3");

        else

            System.out.println("0");

    }

}



