import java.util.Scanner;
public class CapitalLetterSmallLetter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String vigneshInput=input.nextLine();
        for(int i=0;i<vigneshInput.length();i++)
        {
            if(vigneshInput.charAt(i)>='A' && vigneshInput.charAt(i)<='Z') {
                int asciiValue = (int) vigneshInput.charAt(i) + 32;
                char smallLetter = (char) asciiValue;
                StringBuilder newString=new StringBuilder(vigneshInput);
                newString.setCharAt(i,smallLetter);
                vigneshInput=newString.toString();
//            vigneshInput = vigneshInput.replace(vigneshInput.charAt(i), smallLetter);
            }
            else if(vigneshInput.charAt(i)>='a' && vigneshInput.charAt(i)<='z') {
                int asciiValue = (int) vigneshInput.charAt(i) - 32;
                char smallLetter = (char) asciiValue;
                StringBuilder newString=new StringBuilder(vigneshInput);
                newString.setCharAt(i,smallLetter);
                vigneshInput=newString.toString();
            }
            else {}
        }
        System.out.println(vigneshInput);
    }
}