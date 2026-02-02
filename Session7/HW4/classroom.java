package Session7.HW4;

public class classroom {
    static double classFund = 0.0;

    static String name;
    public classroom(String name){
        this.name  = name;
    }

    public static void money(double amount){
        if ( amount > 0 ){
            classFund += amount;
            System.out.printf("%s da dong %.2f\n", name,amount);
            System.out.println("quy :"+ classFund);
        }else {
            System.out.println("ko dong ");
        }

    }
}
