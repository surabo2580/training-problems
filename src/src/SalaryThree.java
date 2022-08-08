import java.util.Scanner;

public class SalaryThree {
    public static void main(String []args)
    {
        int weekdays[]=new int[7];
        int totalhours=0;
        Scanner myObj = new Scanner(System.in);
        for(int i=0;i<7;i++)
        {
            weekdays[i]=myObj.nextInt();
            totalhours+=weekdays[i];
        }
        int weeksalary=0;
        for(int i=1;i<=5;i++)
        {
            if(weekdays[i]<=8)
                weeksalary+=weekdays[i]*100;
            else
            {
                int extrahours=weekdays[i]-8;
                weeksalary+=extrahours*100+extrahours*15+800;
            }
        }
        weeksalary+=weekdays[6]*125;
        weeksalary+=weekdays[0]*150;
        if(totalhours>40){
            int extrahours=totalhours-40;
            weeksalary+=extrahours*25+totalhours*100;
        }
        System.out.println(weeksalary);
    }
}
