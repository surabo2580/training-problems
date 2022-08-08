import java.util.Scanner;

public class MangoTree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int noOfRows = sc.nextInt();
        int noOfCols = sc.nextInt();
        int indexOne = sc.nextInt();
        int indexTwo = sc.nextInt();

        String isMango = "no";
        for(int i=1;i<=noOfRows;i++) {
            if(indexOne==i && indexTwo==1)
                isMango="yes";
            if(indexOne==i && indexTwo==noOfCols)
                isMango="yes";
        }
        for(int i=1;i<=noOfCols;i++){
            if(indexOne==1 && indexTwo==i)
                isMango="yes";
        }
        System.out.println(isMango);
    }
}
