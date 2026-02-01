package Session6.HW2;

public class bai2 {
     static class Account{
        String userName;
        String password;
        String email;

        public Account(String userName, String password , String email){
            this.userName = userName;
            this.password = password;
            this.email = email;
        }

        public void changePassword ( String oldPassword , String newPassword){
            if(this.password.equals(oldPassword)){
                this.password = newPassword;
                System.out.println("congration");
            }else {
                System.out.println("fail");
            }
        }
        public void display(){
            System.out.println("name" + userName);
            System.out.println("password : **********");
            System.out.println("email:"+email);
        }
    }


}
