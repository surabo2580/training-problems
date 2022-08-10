package Exception;

import java.util.Scanner;

public class Election {
    public static void check(int age) throws Exception {

        if(age<25) {
            //throw exception if not eligible to stand in election
            throw new Exception("nominee is not eligible to stand in election");
        }
        else {
            System.out.println("nominee is eligible to vote!!");
        }
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter nominee age");
        int age = sc.nextInt();
        check(age);

    }
}

