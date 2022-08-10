import java.util.Scanner;

interface AccountType{
    void withdraw(float amount);
    void deposit(float amount);
    double balance(int time,int ROI,float amount);
}

class CurrentType implements AccountType{
    double bal=0;



    @Override
    public void withdraw(float amount) {
        if (amount<0.2*bal){
            System.out.println("you cant withdrwa as you have a limit of 20% draft");
            bal-=amount;
        }

    }

    public void deposit(float amount){
        bal+=amount;
    }

    @Override
    public double balance(int time, int ROI, float amount) {
        return bal+bal*(1+(time/365)*ROI);
    }
}

class SavingsType implements AccountType{
    double bal = 0;

    @Override
    public void withdraw(float amount) {
        if (amount>=bal){
            System.out.println("withdraw succesfull");
            bal-=amount;
        }
    }

    @Override
    public void deposit(float amount) {
        bal+=amount;
    }

    @Override
    public double balance(int time, int ROI, float amount) {
        if(time<=75){
            return bal+bal*(1+(time/365)*ROI);
        }
        return bal;

    }
}

public class bankTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account type:");
        String accountType = sc.next();
        System.out.println("interst period");
        int time = sc.nextInt();
        System.out.println("Enter your amount");
        float amount = sc.nextFloat();
        System.out.println("Enter your interest");
        int ROI = sc.nextInt();
        if (accountType.equals("savings")) {
            SavingsType s = new SavingsType();
            System.out.print("Do u wanna deposit y or n?");
            String deposit = sc.next();
            if (deposit.equals("y")) {
                System.out.println("Enter deposit amount");
                float dep = sc.nextFloat();
                s.deposit(dep);
            }
            System.out.println(s.balance(time, ROI, amount));
        } else {
            CurrentType c = new CurrentType();
            System.out.print("Do u wanna deposit y or n?");
            String deposit = sc.next();
            if (deposit.equals("y")) {
                System.out.println("Enter deposit amount");
                float dep = sc.nextFloat();
                c.deposit(dep);
            }
            System.out.println(c.balance(time, ROI, amount));
        }

    }

}
