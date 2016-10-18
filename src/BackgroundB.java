import java.util.Scanner;

public class BackgroundB {

    Scanner input = new Scanner(System.in);

    BackgroundC BackgroundCObject = new BackgroundC();

    //---B1---
    public void backgroundB1() {
        System.out.println("You stand next to a lake. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3
        if (choose.equals("L")) {
            BackgroundCObject.backgroundC1();
        }
        if (choose.equals("S")) {
            BackgroundCObject.backgroundC2();
        }
        if (choose.equals("R")) {
            BackgroundCObject.backgroundC3();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");

        }

    }

    //---B2---
    public void backgroundB2() {
        System.out.println("You stand in a forest. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3
        if (choose.equals("L")) {
            BackgroundCObject.backgroundC3();
        }
        if (choose.equals("S")) {
            BackgroundCObject.backgroundC4();
        }
        if (choose.equals("R")) {
            BackgroundCObject.backgroundC5();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

    //---B3---
    public void backgroundB3() {
        System.out.println("You stand if front of an abandoned theme park. You are at a crossroad, are you " +
                "going to turn right(R), left(L) or go straight(S)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3
        if (choose.equals("L")) {
            BackgroundCObject.backgroundC5();
        }
        if (choose.equals("S")) {
            System.out.println("You fall off a cliff. You fain!");
        }
        if (choose.equals("R")) {
            BackgroundCObject.backgroundC6();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }
}
