public class Mode {
    static int mode(int a[],int n) {
        int maxVal = 0, maxCount = 0, i, j;

        for (i = 0; i < n; ++i) {
            int count = 0;
            for (j = 0; j < n; ++j) {
                if (a[j] == a[i])
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxVal = a[i];
            }
        }
        return maxVal;
    }
    public static void main(String args[]){
        int n = 5;
        int a[] = {0,6,7,2,7};
        System.out.println("Mode is "+mode(a,n));
    }
}
