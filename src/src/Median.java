import java.util.Arrays;

public class Median {
    public static void main(String[] args){

        int a[] = { 10, 8, 5, 8, 0, 5, 8, 6 };
        int n = a.length;
        Arrays.sort(a);


        if (n % 2 != 0)
            System.out.println("Median is" + (double)a[n / 2]);
        else
            System.out.println("Median is"+(double)(a[(n - 1) / 2] + a[n / 2]) / 2.0);


    }

}
