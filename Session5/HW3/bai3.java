package Session5.HW3;

public class bai3 {
    static class Product {
        String id;
        String name ;
        int price;

        public Product(String id , String name , int price){
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public void setprice (int price){
            if (price > 0 ){
                this.price  = price;
                System.out.println("Gia tien hop le");
            }else {
                System.out.println("ko hop le");
            }
        }
        public void display (){
            System.out.println("id:"+ id);
            System.out.println("name:" + name);
            System.out.println("price:" +price);
        }
    }


}
