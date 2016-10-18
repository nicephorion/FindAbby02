import java.util.Scanner;

public class BackgroundE {

    Scanner input = new Scanner(System.in);

    BackgroundF BackgroundFObject = new BackgroundF();

    //---E1---
    public void backgroundE1() {
        System.out.println("You stand next to a lake. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else if (choose.equals("S")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else if (choose.equals("R")) {
            BackgroundFObject.backgroundF1();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

    //---E2---
    public void backgroundE2() {
        System.out.println("You stand in a forest. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else if (choose.equals("S")) {
            BackgroundFObject.backgroundF1();
        }
        else if (choose.equals("R")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

    //---E3---
    public void backgroundE3() {
        System.out.println("You stand if front of an abandoned theme park. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            BackgroundFObject.backgroundF1();
        }
        else if (choose.equals("S")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else if (choose.equals("R")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

    //---E4---
    public void backgroundE4() {
        System.out.println("You stand next to a lake. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else if (choose.equals("S")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else if (choose.equals("R")) {
            BackgroundFObject.backgroundF2();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

    //---E5---
    public void backgroundE5() {
        System.out.println("You stand in a forest. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            BackgroundFObject.backgroundF2();
        }
        else if (choose.equals("S")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else if (choose.equals("R")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }
    }

    //---E6---
    public void backgroundE6() {
        System.out.println("You stand if front of an abandoned theme park. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else if (choose.equals("S")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else if (choose.equals("R")) {
            BackgroundFObject.backgroundF3();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }
    }

    //---E7---
    public void backgroundE7() {
        System.out.println("You stand if front of an abandoned theme park. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else if (choose.equals("S")) {
            BackgroundFObject.backgroundF3();
        }
        else if (choose.equals("R")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }
    }

    //---E8---
    public void backgroundE8() {
        System.out.println("You stand if front of an abandoned theme park. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            BackgroundFObject.backgroundF3();
        }
        else if (choose.equals("S")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else if (choose.equals("R")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }
    }
}
