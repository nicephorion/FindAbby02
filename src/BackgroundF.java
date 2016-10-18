import java.util.Scanner;

public class BackgroundF {

    Scanner input = new Scanner(System.in);

    Main MainObject = new Main();

    //---F1---
    public void backgroundF1() {
        System.out.println("You stand next to a lake. You are at a crossroad, are you " +
                "going to turn right(R) or left (L)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3
        if (choose.equals("L")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        if (choose.equals("R")) {
            MainObject.theEnd();
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

    //---F2---
    public void backgroundF2() {
        System.out.println("You stand in a forest. You are at a crossroad, are you " +
                "going to turn right(R) or turn left(L)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3
        if (choose.equals("L")) {
            MainObject.theEnd();
        }
        if (choose.equals("R")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

    //---F3---
    public void backgroundF3() {
        System.out.println("You stand if front of an abandoned them epark. You are at a crossroad, are you " +
                "going to turn right(R) or turn left(L)?");
        System.out.println("----------");

        String choose = input.nextLine();

        ///Left = 1, Straight = 2, Right = 3
        if (choose.equals("L")) {
            MainObject.theEnd();
        }
        if (choose.equals("R")) {
            System.out.println("You fall off a cliff. You fail!");
        }
        else {
            System.out.println("Check yo grammar, mate! You fail!");
        }

    }

}