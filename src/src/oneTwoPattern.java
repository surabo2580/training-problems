import java.util.Scanner;

public class oneTwoPattern {
    public static void main(String []args)
    {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number- ");
        int firstNo = sc.nextInt();
        System.out.print("Enter second number- ");
        int secondNo = sc.nextInt();

        int lines=sc.nextInt();
        for(int i=0;i<lines;i++)
        {
            int j=0;
            for( j=0;j<=i;j++) System.out.print(firstNo);
            for( int k=j;k<lines+1;k++) System.out.print(secondNo);
            System.out.println();
        }


    }
    }

