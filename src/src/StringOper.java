import java.util.Scanner;

public class StringOper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String str = sc.nextLine();
        System.out.println("enter second string");
        String str2 = sc.nextLine();


        StringBuilder input = new StringBuilder();

        input.append(str);
        input.append(str2);
        input.reverse();
        System.out.println(input);
        System.out.println("length is "+ str.length());
        System.out.println(str + str2);
        if(str.equals(str2)){
            System.out.println("equal");
        }


    }
}


