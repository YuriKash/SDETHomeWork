package class12;

public class Task {

    public static void main(String[] args) {

        String password="11111111";
        String confirmedPassword="11111111";
        String userName="YuriKashirin";

        if(password.isBlank() || userName.isBlank()){
            System.out.println("Cannot be empty");
        }else if(password.length()<8){
            System.out.println("Password is too short");
        }else if(password.equals(userName)){
            System.out.println("Password cannot contain username");
        }else if(!confirmedPassword.equals(password)){
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Has been created");
        }

    }
}
