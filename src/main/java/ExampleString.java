import java.util.Scanner;

public class ExampleString {
    public static void main(String[] args) {
        String text = "This is a text";
        String newText = new String("This is a text");
//        System.out.println(text.length());

//        if(text.equals(newText)) {
//            System.out.println("Text is equal to the new text");
//            return;
//        }

        //make ask for password till valid password is entered, and exit after it is entered
        int passwordMinLength = 8;
//        System.out.println("Enter a password");
        Scanner scanner = new Scanner(System.in);
//        String password = scanner.nextLine();
        String password;


        do {
            System.out.println("Enter a password");
            password = scanner.nextLine();
            if(password.length() < passwordMinLength) {
                System.out.println("Password should be not less than " + passwordMinLength);
            }
        } while (password.length() < passwordMinLength);
        System.out.println("Password accepted");


//        if (password.length()< passwordMinLength) {
//                System.out.println("Password must be greater than " + passwordMinLength");
//        return;
//        }
//        System.out.println("Password is accepted");
//
    }
}
