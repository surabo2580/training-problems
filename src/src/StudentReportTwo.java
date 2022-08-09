import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReportTwo {
    // students report practice two
    public static void main(String args[])
    {
        String name;
        float eng, socialScience, science, math, compScience;
        double total, average, percentage;
        Scanner op=new Scanner(System.in);
        /* Input marks of all five subjects */
        System.out.println(" enter name of student");
        name = op.nextLine();
        System.out.println("Enter marks of five subjects:");
        System.out.print("Enter marks of English subjects:");
        eng=op.nextFloat();
        System.out.print("Enter marks of social science subjects:");
        socialScience=op.nextFloat();
        System.out.print("Enter marks of science subjects:");
        science=op.nextFloat();
        System.out.print("Enter marks of maths subjects:");
        math=op.nextFloat();
        System.out.print("Enter marks of computer science subjects:");
        compScience=op.nextFloat();

        List<Integer> marksList = new ArrayList<>();
        List<String> nameList = new ArrayList<>();
        nameList.add(name);
        marksList.add((int) eng);
        marksList.add((int) science);
        marksList.add((int) eng);
        marksList.add((int) eng);

        /* Calculate total, average and percentage */
        total = eng + science + socialScience + math + compScience;

        average = (total / 5.0);
        percentage = (total / 500.0) * 100;

        /* Print all results */
        System.out.println("Total marks ="+total);
        System.out.println("Average marks = "+average);
        System.out.println("Percentage = "+percentage);

    }
}
