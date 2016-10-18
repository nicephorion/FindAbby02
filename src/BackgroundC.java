import java.util.Scanner;

public class BackgroundC {

    Scanner input = new Scanner(System.in);

    BackgroundD BackgroundDObject = new BackgroundD();

    //---C1---
    public void backgroundC1() {
        System.out.println("You stand next to a lake. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3
        if (choose.equals("L")) {
            BackgroundDObject.backgroundD1();
        }
        if (choose.equals("S")) {
            BackgroundDObject.backgroundD2();
        }
        if (choose.equals("R")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

    //---C2---
    public void backgroundC2() {
        System.out.println("You stand in a forest. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3
        if (choose.equals("L")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        if (choose.equals("S")) {
            BackgroundDObject.backgroundD3();
        }
        if (choose.equals("R")) {
             BackgroundDObject.backgroundD4();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

    //---C3---
    public void backgroundC3() {
        System.out.println("You stand if front of an abandoned theme park. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3
        if (choose.equals("L")) {
            BackgroundDObject.backgroundD4();
        }
        if (choose.equals("S")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        if (choose.equals("R")) {
            BackgroundDObject.backgroundD5();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

    //---C4---
    public void backgroundC4() {
        System.out.println("You stand next to a lake. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3
        if (choose.equals("L")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        if (choose.equals("S")) {
            BackgroundDObject.backgroundD5();
        }
        if (choose.equals("R")) {
            BackgroundDObject.backgroundD6();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

    //---C5---
    public void backgroundC5() {
        System.out.println("You stand in a forest. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3
        if (choose.equals("L")) {
            BackgroundDObject.backgroundD6();
        }
        if (choose.equals("S")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        if (choose.equals("R")) {
            BackgroundDObject.backgroundD7();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

    //---C6---
    public void backgroundC6() {
        System.out.println("You stand if front of an abandoned theme park. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3
        if (choose.equals("L")) {
            BackgroundDObject.backgroundD7();
        }
        if (choose.equals("S")) {
            BackgroundDObject.backgroundD8();
        }
        if (choose.equals("R")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }
    }

}