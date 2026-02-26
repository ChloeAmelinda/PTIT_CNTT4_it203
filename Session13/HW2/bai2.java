package Session13.HW2;

import java.util.ArrayList;
import java.util.Collections;

public class bai2 {
    static void main(String[] args) {
        ArrayList<String> drug = new ArrayList<>();

        drug.add("Paracetamol");
        drug.add("Ibuprofen");
        drug.add("Panadol");
        drug.add("Paracetamol");
        drug.add("Aspirin");
        drug.add("Ibuprofen");
        for (String i:drug){
            System.out.printf("%s\t",i);
        }
        System.out.println();
        for (int i = 0; i < drug.size(); i++) {
            for (int j = i+1; j < drug.size(); j++) {
                if (drug.get(i).equals(drug.get(j))){
                    drug.remove(i);
                    j--;
                }
            }
        }
        Collections.sort(drug);
        for (String i:drug){
            System.out.printf("%s\t",i);
        }
    }
}
