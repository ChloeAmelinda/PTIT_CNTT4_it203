package Session13.HW1;

import java.util.ArrayList;
import java.util.Iterator;

public class Bai1 {
    static void main(String[] args) {
        ArrayList<Double> bodyTemperature  =  new ArrayList<>();

        bodyTemperature.add(36.5);
        bodyTemperature.add(12.5);
        bodyTemperature.add(38.0);
        bodyTemperature.add(44.0);
        bodyTemperature.add(46.5);

        Iterator<Double> iterator = bodyTemperature.iterator();
        System.out.printf("before filter body temperature:");
        for (double i : bodyTemperature){
            System.out.printf(" %f\t",i);
        }
        System.out.println();
        double avg = 0;
        while (iterator.hasNext()){
            double element = iterator.next();

            if (element< 34.0 || element>45.0){
                iterator.remove();
            }
           avg += element;
        }
        System.out.printf("after filter body temperature:");
        for (double i : bodyTemperature){
            System.out.printf(" %f\t",i);
        }
        System.out.println();
        System.out.printf("Nhiet do trung binh : %.2f",avg/bodyTemperature.size());

    }


}
