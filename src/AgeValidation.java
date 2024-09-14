import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner inputEnter = new Scanner(System.in);

        System.out.print("enter your age: ");
        int ageEnter = inputEnter.nextInt();
        final int AGE_LIMIT = 18;
        
        if (ageEnter >= AGE_LIMIT) {
            System.out.println("Access granted");
        }
        else if (ageEnter < AGE_LIMIT){
            System.out.println("you are minor age");
        }
        else {
            System.out.println("Access denied");
        }
    }
}
