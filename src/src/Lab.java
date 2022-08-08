import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab {
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



//        int x = 30;
//        int y = 40;
//        int z = 20;
//        int n = 25;
        List<Integer> labsList=new ArrayList<Integer>();

        labsList.add(a);
        labsList.add(b);
        labsList.add(c);
        Collections.sort(labsList);



        System.out.println(labsList);

        if(a>=n){
            System.out.println("L1");
        }
        else if (b>=n){
            System.out.println("L2");
        }
        else{
            System.out.println("L3");
        }
    }
}
