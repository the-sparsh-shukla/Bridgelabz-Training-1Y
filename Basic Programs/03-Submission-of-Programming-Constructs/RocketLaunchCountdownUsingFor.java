//Rewrite program 8 to do the countdown using the for-loop

import java.util.Scanner;

public class RocketLaunchCountdownUsingFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown number: ");
        int counter = sc.nextInt();   // Taking user input

        for (int i = counter; i >= 1; i--) {   // For loop countdown
            System.out.println(i);
        }

        System.out.println("🚀 Rocket Launched!");
        sc.close();
    }
}
