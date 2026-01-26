import java.util.Scanner;
public class FriendsDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Amar's height: ");
        int amarHeight = input.nextInt();
        System.out.print("Enter Akbar's height: ");
        int akbarHeight = input.nextInt();
        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = input.nextInt();
     
	 if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Amar is the youngest.");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }


        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Amar is the tallest.");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }
    }
}
