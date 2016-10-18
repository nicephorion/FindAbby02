import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Objects
        BackgroundB BackgroundBObject = new BackgroundB();

        //---Startscreen---
        System.out.println("What is your name, friend?");
        String userName = input.nextLine();

        System.out.println("Hello " + userName + "! Your sister Abby is missing. Find her!");
        System.out.println("----------");

        //---A---
        System.out.println("You stand in front of a forest. You are at a crossroad, are you " +
                "going to turn left(L), go straight(S) or turn right(R)?");

        String choose = input.nextLine();

        // /Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            BackgroundBObject.backgroundB1();
        }
        else if (choose.equals("S")) {
            BackgroundBObject.backgroundB2();
        }
        else if (choose.equals("R")) {
            BackgroundBObject.backgroundB3();
        } else {
            System.out.println("Check yo grammar, mate! You fail!");
        }
    }

        /*
              switch (choose) {
            case "1":
                BackgroundBObject.backgroundB1();
                break;
            case "2":
                BackgroundBObject.backgroundB2();
                break;
            case "3":
                BackgroundBObject.backgroundB3();
                break;
            default:
                System.out.println("Check yo grammar, mate! You fail!");
        }
         */

    public void theEnd() {
        System.out.println("You found your sister! You are a great sibling!");
        System.out.println("----------");
        System.out.println("The End!");
    }

}
