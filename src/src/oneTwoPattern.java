import java.util.Scanner;

public class oneTwoPattern {
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);

        int fno =myObj.nextInt();

        int sno =myObj.nextInt();

        int lines=myObj.nextInt();

        for(int i=0;i<lines;i++)

        {

            int j=0;

            for( j=0;j<=i;j++) System.out.print(fno);

            for( int k=j;k<lines+1;k++) System.out.print(sno);

            System.out.println();

        }





    }
    }

