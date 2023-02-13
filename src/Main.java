import java.util.Random;
import java.util.Scanner;

public class Main {

   static String tokenGenerator(int targetStringLength) {
       int leftLimit = 33;
       int rightLimit = 125;

        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;
   }
    public static void main(String[] args) {
        int targetStringLength=0;
        boolean done = false;
        while (!done) {
            try {
                do {
                    System.out.println("What token length do you need?\n" + "Select and enter 5,10 or 15");
                    Scanner sc = new Scanner(System.in);
                    targetStringLength = sc.nextInt();
                } while ((targetStringLength != 5 && (targetStringLength != 10)) && targetStringLength != 15);
                done = true;
            } catch (Exception e) {
                System.out.println("You must write a number");
            }
        }

        switch (targetStringLength) {
            case 5 -> {
                tokenGenerator(5);
                System.out.println(Main.tokenGenerator(targetStringLength));
            }
            case 10 -> {
                tokenGenerator(10);
                System.out.println(Main.tokenGenerator(targetStringLength));
            }

            case 15 -> {
                tokenGenerator(15);
                System.out.println(Main.tokenGenerator(targetStringLength));
            }

        }
        }
    }

