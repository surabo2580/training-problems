public class MaxInOneD {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};

        int i;


        int max = arr[0];


        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        System.out.println(max);
    }
}
