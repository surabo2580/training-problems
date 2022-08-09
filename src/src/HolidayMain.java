class Holiday {
    private String name;
    private int day;
    private String month;
    private String hour = "1st";
    // your code goes here

    public Holiday(String name,int day,String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public static  boolean inSameMonth(Holiday holiday1,Holiday holiday2)
    {

        return (holiday1.month.equals(holiday2.month));
    }
    public static double avgDate(Holiday array[])
    {
        int avg=0;
        for(int i=0;i<array.length;i++)
        {
            avg+=array[i].day;
        }
        return (double) avg/ array.length;
    }



}
public class HolidayMain {
    public static void main(String[] args) {
        Holiday obj1=new Holiday("Independance day",15,"August");
        Holiday obj2=new Holiday("Republic day",26,"January");
        Holiday array[];
        array=new Holiday[2];
        array[0]=obj1;
        array[1]=obj2;
        System.out.println(Holiday.avgDate(array));
        System.out.println(Holiday.inSameMonth(obj1,obj2));
    }
}





