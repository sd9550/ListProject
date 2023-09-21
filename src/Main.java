import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        boolean keepGoing = true;
        Scanner scanner = new Scanner(System.in);
        LinkedList<Slime> slimes = new LinkedList<>();
        System.out.print("Enter the number of slimes to generate: ");
        int size = scanner.nextInt();
        pushSlimes(slimes, size);
        scanner.nextLine();

        while (keepGoing) {
            System.out.print("\nEnter 1 to pop a slime, 2 to display all slimes, or 3 to push a slime: ");
            String entry = scanner.nextLine();
            if (entry.equals("1"))
                popSlimes(slimes);
            else if (entry.equals("2"))
                printSlimes(slimes);
            else if (entry.equals("3")) {
                pushSlimes(slimes, 1);
                System.out.println("A new slime was pushed!");
            }
            else
                keepGoing = false;
        }

    }

    public static void printSlimes(LinkedList<Slime> temp) {
        System.out.println("Total number of slimes: " + temp.size());
        for (Slime slime : temp) {
            System.out.println("Slime Color: " + slime.getColor());
            System.out.println("Slime Health: " + slime.getHealth());
        }
    }

    public static void popSlimes(LinkedList<Slime> temp) {
        try {
            Slime slime = temp.pop();
            System.out.println("Popped Slime Color: " + slime.getColor());
            System.out.println("Popped Slime Health: " + slime.getHealth());
            System.out.println("Farewell popped slime.");
        } catch (NoSuchElementException ex) {
            System.out.println("No more slimes to pop! Perhaps add some more?");
        }
    }

    public static void pushSlimes(LinkedList<Slime> temp, int size) {
        Random random = new Random();
        for (int i = 0; i < size; ++i) {
            int ran = random.nextInt(Slime.COLORS.length);
            temp.push(new Slime(Slime.COLORS[ran], 5));
        }
    }
}
