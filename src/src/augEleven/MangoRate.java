package augEleven;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MangoRate {
    public static void main(String args[]){
        HashMap<String,Integer> mangorate = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter quantity");
        int quantity = sc.nextInt();
        mangorate.put("mango1",100);
        mangorate.put("mango2",200);
        mangorate.put("mango3",300);


        for(Map.Entry<String,Integer> iterator : mangorate.entrySet()){

            System.out.println("price of the " + iterator.getKey() + " is " + iterator.getValue() + " per kg ");
            int price = iterator.getValue() * quantity;
            System.out.println("total price of the " + iterator.getKey() + " is " + price);
        }
//

    }
}
