package Session7.HW3;

public class main {
    static void main(String[] args) {
        double[] s = {3.4, 4, 5,9,1, 5};
        double tb = ScoreUtils.calculateAverage(s);
        System.out.printf("Average: %.2f\n" , tb );
        String result =  (ScoreUtils.checkPass(tb) == true)? "Pass" : "fail";
        System.out.println("Result:" + result);

    }
}
