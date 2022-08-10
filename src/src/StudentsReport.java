
/*

Class Teacher of X-A wants to calculate the total of each of her 15 students and give rank for them.
 The teacher has less than an hour to compute and wants to know her class performance.
 The students had taken exams for 5 subjects - Maths, Computer Science, Science, Social Science, English.
 1. She wants to rank each of them.
 2. She wants to know the total of each of them.
 3. She wants to know the top 3 best performers in each subject.
 4. Finally the list of students who are the below average performers must be listed along with their
 totals, ranks and subjects which they did poor.
 5. Calculate the average of the class performance overall and for each subject.
 Criteria for below average: Marks less than 50.


 */

import java.util.*;
class Global
{
    static TreeMap<String,Integer> ranking=new TreeMap<String,Integer>();

}
class AveragePerformerShape
{
    String name;
    int totalMarks;
    int rank;
    String subjects[] = new String[5];


    AveragePerformerShape(String name,int totalMarks,int rank,String subjects[])
    {
        this.name=name;
        this.rank=rank;
        this.totalMarks=totalMarks;
        this.subjects=Arrays.copyOf(subjects,subjects.length);
    }


}

class Student
{
    private String name;
    private int subjects[]=new int[5];
    private int totalMarks;
    Student(String name,int subjects[])
    {
        this.name=name;
        this.subjects= Arrays.copyOf(subjects,subjects.length);
        int total=0;
        for(int i=0;i<subjects.length;i++)
        {
            total+=subjects[i];
        }
        this.totalMarks=total;

    }
    static void rankThemAll(Student[] students)
    {
        System.out.println("NAME"+"    "+"RANK");
        TreeMap<Integer,String> sortedStudentTotalMarks=new TreeMap<Integer,String>(Collections.reverseOrder());
        for(int i=0;i<students.length;i++)
        {
            sortedStudentTotalMarks.put(students[i].totalMarks,students[i].name);
        }
        int rank=1;
        for(Map.Entry m:sortedStudentTotalMarks.entrySet()) {
            String name=m.getValue().toString();
            Global.ranking.put(name,rank);
            System.out.println(m.getValue()+"    "+(rank));
            rank++;
        }
    }
    static void totalOfEachOfThem(Student students[])
    {
        System.out.println("NAME"+"    "+"TOTAL");
        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name+"    "+students[i].totalMarks);
        }
    }
    static void topThreeBestPerformer(Student students[])
    {
        int subjects[]=new int[5];
        for(int j=0;j< students.length;j++)
            for(int i=0;i<subjects.length;i++) {
                subjects[i]=students[j].subjects[i];
            }
        TreeMap<Integer, List<String>> bestPerformer=new TreeMap<Integer,List<String>>(Collections.reverseOrder());
        for(int  i=0;i<subjects.length;i++)
        {
            List<String> nameList = new ArrayList<String>();

            for(int j=0;j<students.length;j++)
            {
                if(subjects[i]==students[j].subjects[i])
                    nameList.add(students[j].name);

            }
            bestPerformer.put(subjects[i],nameList);
        }
        int counterFor3BestPerformer=0;
        System.out.println("Marks"+"    "+"Name");
        for(Map.Entry m:bestPerformer.entrySet()) {
            counterFor3BestPerformer++;
            if(counterFor3BestPerformer<=3)
                System.out.println(m.getKey()+"    "+m.getValue().toString());
            else
                break;

        }
    }
    static void averagePerformer(Student students[])
    {
        int flagForCheckingPoorPerformance=0;
        List<AveragePerformerShape> averagePerformerShapesList = new ArrayList<AveragePerformerShape>();

        for(int i=0;i<students.length;i++)
        {
            String subjects[]=new String[5];
            int subjectindex=0;
            for(int j=0;j<5;j++)
            {
                if(students[i].subjects[j]<50)
                {
                    flagForCheckingPoorPerformance=1;
                    switch(j)
                    {
                        case 0:
                            subjects[subjectindex++]="Math";
                            break;
                        case 1:
                            subjects[subjectindex++]="Computer Science";
                            break;
                        case 2:
                            subjects[subjectindex++]="English";
                            break;
                        case 3:
                            subjects[subjectindex++]="science";
                            break;
                        case 4:
                            subjects[subjectindex++]="Social science";
                            break;

                    }

                }
            }
            int rank=0;
            for(Map.Entry m:Global.ranking.entrySet()) {
                if(students[i].name.equals((String)m.getKey()))
                    rank=(int)m.getValue();


            }
            if(flagForCheckingPoorPerformance==1) {
                AveragePerformerShape averagePerformerShape =
                        new AveragePerformerShape(students[i].name, students[i].totalMarks, rank
                                , subjects);
                averagePerformerShapesList.add(averagePerformerShape);

            }
        }
        System.out.println("NAME"+"    "+"TOTAL"+"    "+"Rank");
        for (int i = 0; i < averagePerformerShapesList.size(); i++) {

            // Print all elements of List
            System.out.println(averagePerformerShapesList.get(i).name+"    "+
                    averagePerformerShapesList.get(i).totalMarks+"      "+
                    averagePerformerShapesList.get(i).rank);
        }
    }
    static void averageOfMarks(Student students[])
    {
        int totalAverage=0;
        for(int i=0;i<students[0].subjects.length;i++)
        {
            int average=0;
            for(int j=0;j<students.length;j++)
            {

                average+=students[j].subjects[i];
            }
            double subjectAverage=(double) average/students.length;
            switch(i)
            {
                case 0:
                    System.out.println("Math"+"    "+subjectAverage);
                    break;
                case 1:
                    System.out.println("Computer Science"+"    "+subjectAverage);                        break;
                case 2:
                    System.out.println("English"+"    "+subjectAverage);                        break;
                case 3:
                    System.out.println("Science"+"    "+subjectAverage);                        break;
                case 4:
                    System.out.println("Social Science"+"    "+subjectAverage);
                    break;

            }

        }
        for(int i=0;i<students.length;i++)
        {
            totalAverage+=students[i].totalMarks;

        }
        System.out.println("Total Average marks is "+(double)totalAverage/students.length);


    }



}



public class StudentsReport {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Student arrayOfStudents[];
        arrayOfStudents=new Student[15];
        for(int i=0;i<15;i++)
        {
            System.out.println("Enter Student name");
            String name=input.next();
            System.out.println("Enter Maths marks");
            int  maths=input.nextInt();
            System.out.println("Enter Computer Science marks");
            int computerScience=input.nextInt();
            System.out.println("Enter English marks");
            int english=input.nextInt();
            System.out.println("Enter Science marks");
            int science=input.nextInt();
            System.out.println("Enter Social Science marks");
            int socialScience=input.nextInt();
            int subjects[]={maths,computerScience,english,science,socialScience};
            Student student=new Student(name,subjects);
            arrayOfStudents[i]=student;
        }
        Student.rankThemAll(arrayOfStudents);
        Student.totalOfEachOfThem(arrayOfStudents);
        Student.topThreeBestPerformer(arrayOfStudents);
        Student.averagePerformer(arrayOfStudents);
        Student.averageOfMarks(arrayOfStudents);


    }
}
