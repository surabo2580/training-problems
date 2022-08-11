package augEleven;

import java.util.HashMap;
import java.util.Map;

public class MangoRate {
    public static void main(String args[]){
        HashMap<String,Integer> mangorate = new HashMap<>();

        mangorate.put("mango1",100);
        mangorate.put("mango2",200);
        mangorate.put("mango3",300);

        for(Map.Entry<String,Integer> iterator : mangorate.entrySet()){
            System.out.println("price of the " + iterator.getKey() + " is " + iterator.getValue() + " per kg ");
        }
    }
}
