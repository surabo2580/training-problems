package august10Task;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.round;
class LuggageLimitException extends Exception{
    LuggageLimitException(String name,double exceedWeight)
    {
        System.out.println(name+" ,you have an extra weight of "+exceedWeight+" kg");
    }

}

class Passenger
{
    String name;
    double weight;
    Passenger(String name,double weight)
    {
        this.name=name;
        this.weight=weight;
    }
    static void isLuggageWeightUnderLimit(Passenger passenger) throws LuggageLimitException
    {
        if(passenger.weight>15.0)
        {
            double extraWeight=  Math.round((passenger.weight-15)*100.0)/100.0;
            throw new LuggageLimitException(passenger.name,extraWeight);
        }
        else
        {
            System.out.println(passenger.name+" have a nice journey");
        }
    }


}

public class Luggage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Passenger passengerOne=new Passenger("Shruti",15.1);
        Passenger passengerTwo=new Passenger("Bhavya",18);
        try {
            Passenger.isLuggageWeightUnderLimit(passengerOne);
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
            System.out.println(e+" ");
            double extraWeight=  Math.round((passengerOne.weight-15)*100.0)/100.0;
            System.out.println(passengerOne.name+", You have to pay "+(extraWeight*500)+" rs");
        }
        try
        {
            Passenger.isLuggageWeightUnderLimit(passengerTwo);
        }
        catch (Exception e)
        {
            System.out.println("Exception caught");
            System.out.println(e+" ");
            double extraWeight=  Math.round((passengerTwo.weight-15)*100.0)/100.0;
            System.out.println(passengerTwo.name+", You have to pay "+(extraWeight*500)+" rs");
        }





//

    }
}