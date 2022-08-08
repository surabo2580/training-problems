import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args){
        List<Integer> noOfHrsList =  new ArrayList<Integer>();

        for (int i=1;i<8;i++){
            Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
            System.out.print("Enter no of hours- ");
            int week = sc.nextInt();
            noOfHrsList.add(week);

        }
        System.out.println(noOfHrsList);

        var extraHourPerDay= 0;
        int fixedHour = 8; 
        for (int i=0;i<noOfHrsList.size();i++){
            if (noOfHrsList.get(i)>fixedHour){
                System.out.println("++" + noOfHrsList.get(i));
                extraHourPerDay += noOfHrsList.get(i) - fixedHour;
                i++;

            }

        }
        System.out.println(extraHourPerDay);


    }
}
