package augEleven;

import java.util.ArrayList;

public class MarkSheet {
    public static void main(String args[]){
        ArrayList<Integer> marksheet = new ArrayList<>();
        marksheet.add(56);
        marksheet.add(67);
        marksheet.add(87);
        marksheet.add(45);

        double total = 0;

        for(int position=0;position< marksheet.size();position++){
            total+=marksheet.get(position);
            System.out.println(marksheet.get(position));

        }
        System.out.println(total);
        double  percentageOfStudent = (total * 100)/400;
        System.out.println("percentage of student is " + percentageOfStudent);

        // delete the position 2
        marksheet.remove(marksheet.get(2));
        System.out.println("after deletion subject 2 from marksheet" + marksheet);
    }
}
