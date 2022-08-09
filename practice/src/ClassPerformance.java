//class Student{
//    private String name;
//
//    public Student(String name){
//        this.name=name;
//    }
//}


class Subject{
    //Maths, Computer Science, Science, Social Science, English.
    private String name;
    private int maths;
    private int computerScience;
    private int science;
    private int socialScience;
    private int english;

    public Subject(String name,int maths,int computerScience,int science,int socialScience, int english){
        this.name = name;
        this.maths = maths;
        this.computerScience=computerScience;
        this.science=science;
        this.socialScience=socialScience;
        this.english=english;
    }

    public static void total(Subject subject){
        int totalMarks = subject.computerScience + subject.english + subject.maths + subject.science + subject.socialScience;
    }

}




public class ClassPerformance {
    public static void main(String[] args){

        Subject obj1 = new Subject("suraj",5,2,4,5,5);
        System.out.println(obj1);
    }
}
