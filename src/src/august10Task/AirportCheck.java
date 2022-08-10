package august10Task;

import java.util.Scanner;

class TravellerData{
    float weight1;
    String name1 ;
    String name2;
    float weight2;

    public TravellerData(String name1, String name2 ,float weight1,float weight2) {
        this.name1 = name1;
        this.name2= name2;
        this.weight1 = weight1;
        this.weight2 = weight2;

    }

    public static float checkAndCalculate(String name1, String name2, float weight1,float weight2){
        float fine1= 0;
        float fine2 = 0;
        if(weight1>15){
           fine1 = (weight1 - 15) * 500;
            System.out.println("fine for"+ name1 + fine1);
        }
        else if (weight2>15){
            fine2 = (weight2 - 15) * 500;
            System.out.println(" fine for " + name2 + fine2);
        }
        System.out.println("total fine will be" + fine1+fine2);
        return (fine1+fine2);
    }
}

public class AirportCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name1 ");
        String name1 = sc.nextLine();
        System.out.println("enter your name2 ");
        String name2 = sc.nextLine();
        System.out.println("weight of bag1");
        float weight1 = sc.nextFloat();
        System.out.println("weight of bag2");
        float weight2 = sc.nextFloat();


        System.out.println(TravellerData.checkAndCalculate(name1,name2,weight1,weight2));

    }
}
