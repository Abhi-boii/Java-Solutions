import jdk.dynalink.NamedOperation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Containers first = new Containers();
        Containers second = new Containers();

        while (true) {
            System.out.println("First: " + first.Container1() + "/" + first.getMaxvalue());
            System.out.println("Second: " + second.Container2() + "/" + second.getMaxvalue());
            System.out.print("> ");

            String input = sc.nextLine();
            String[] parts = input.split(" ");

            if (parts[0].equals("add")) {
                int amount = Integer.parseInt(parts[1]);
                first.add(amount);
            } else if (parts[0].equals("move")) {
                int moveAmt = Integer.parseInt(parts[1]);
                if(moveAmt>first.Container1()){
                    moveAmt= first.Container1();
                }
                first.n1-=moveAmt;
                if(second.Container2()+moveAmt> second.getMaxvalue()){
                    second.n2= second.getMaxvalue();
                } else{
                    second.n2+=moveAmt;
                }
            } else if (parts[0].equals("remove")) {
                int amount = Integer.parseInt(parts[1]);
                second.remove(amount);
            } else if (parts[0].equals("quit")) {
                break;
            } else {
                System.out.println("Invalid command. Use 'add', 'move', 'remove', or 'quit'.");
            }
        }

    }
}

