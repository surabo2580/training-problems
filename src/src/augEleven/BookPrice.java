package augEleven;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;



public class BookPrice {


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your user name");
        String userName = sc.nextLine();
        System.out.println("enter book name you want to buy or add to cart");
        String bookName = sc.nextLine();
        System.out.println("enter quantity");
        int quantity = sc.nextInt();

        int price = 0;
        int total = 0;
        HashMap<String,Integer> userCart = new HashMap<>();


        HashMap<Integer, String> bookPrn = new HashMap<>();
        bookPrn.put(15674, "book1");
        bookPrn.put(25457, "book2");

        HashMap<String, Integer> bookPrice = new HashMap<>();
        bookPrice.put("book1", 200);
        bookPrice.put("book2", 250);



        try{
            price = Integer.parseInt(String.valueOf(bookPrice.get(bookName)));
            System.out.println("price of the book is " + price);
            total = price * quantity;
            System.out.println("total cart value of " + userName + " is "  + total);
            userCart.put(userName,quantity);
            System.out.println("stock details  " + userCart);
        } catch (NumberFormatException e) {
            throw new RuntimeException("book is not found");
        }

    }

}









//class BookOutOfStockException extends Exception
//{
//    public BookOutOfStockException(String message)
//    {
//        super(message);
//    }
//}


//        if(bookPrice.containsKey(bookName)){
//            price = Integer.parseInt(String.valueOf(bookPrice.get(bookName)));
//            System.out.println(price);
//            total = price * quantity;
//            System.out.println("total cart value of " + userName + " is "  + total);
//            userCart.put(userName,quantity);
//            System.out.println("stock details  " + userCart);
//        }
//        else{
//            throw new BookOutOfStockException("Book out of stock!!");
//        }
