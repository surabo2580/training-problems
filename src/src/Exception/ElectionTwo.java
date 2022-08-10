package Exception;



import java.util.Scanner;

public class ElectionTwo {
    public static void check(int age) throws Exception {

        if(age<25) {
            //throw exception if not eligible to stand in election
            throw new RuntimeException("nominee is not eligible to stand in election");
        }
        else {
            System.out.println("nominee is eligible to vote!!");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter nominee age");
        int age = sc.nextInt();
        try {
            check(age);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}


