import java.util.Scanner;

public class BackgroundD {

    Scanner input = new Scanner(System.in);

    BackgroundE BackgroundEObject = new BackgroundE();

    //---D1---
    public void backgroundD1() {
        System.out.println("You stand next to a lake. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            BackgroundEObject.backgroundE1();
        }
        if (choose.equals("S")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        if (choose.equals("R")) {
            BackgroundEObject.backgroundE2();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

    //---D2---
    public void backgroundD2() {
        System.out.println("You stand in a forest. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        if (choose.equals("S")) {
            BackgroundEObject.backgroundE2();
        }
        if (choose.equals("R")) {
            BackgroundEObject.backgroundE3();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

    //---D3---
    public void backgroundD3() {
        System.out.println("You stand if front of an abandoned theme park. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            BackgroundEObject.backgroundE3();
        }
        if (choose.equals("S")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        if (choose.equals("R")) {
            BackgroundEObject.backgroundE4();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

    //---D4---
    public void backgroundD4() {
        System.out.println("You stand next to a lake. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        if (choose.equals("S")) {
            BackgroundEObject.backgroundE4();
        }
        if (choose.equals("R")) {
            BackgroundEObject.backgroundE5();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

    //---D5---
    public void backgroundD5() {
        System.out.println("You stand in a forest. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            BackgroundEObject.backgroundE5();
        }
        if (choose.equals("S")) {
            BackgroundEObject.backgroundE6();
        }
        if (choose.equals("R")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }
    }

    //---D6---
    public void backgroundD6() {
        System.out.println("You stand if front of an abandoned theme park. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            BackgroundEObject.backgroundE6();
        }
        if (choose.equals("S")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        if (choose.equals("R")) {
            BackgroundEObject.backgroundE7();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }
    }

    //---D7---
    public void backgroundD7() {
        System.out.println("You stand if front of an abandoned theme park. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            BackgroundEObject.backgroundE7();
        }
        if (choose.equals("S")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        if (choose.equals("R")) {
            BackgroundEObject.backgroundE8();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }
    }

    //---D8---
    public void backgroundD8() {
        System.out.println("You stand if front of an abandoned theme park. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3

        if (choose.equals("L")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        if (choose.equals("S")) {
            BackgroundEObject.backgroundE8();
        }
        if (choose.equals("R")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }
    }

}
