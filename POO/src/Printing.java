import java.util.Scanner;

class Studant {
    String name;
    int registration;
    String discipline;
    float score;

        void read() {
            name = input();
            registration = Integer.parseInt(input());
            discipline = input();
            score = Float.parseFloat(input());
        }

        void print() {
            System.out.println("Name = " + name);
            System.out.println("Registration = " + registration);
            System.out.println("Discipline = " + discipline);
            System.out.println("Score = " + score);
        }

        Scanner scan = new Scanner(System.in);
        String input() {
            return scan.nextLine();
        }
}

public class Printing {
    public static void main(String[] args) {
        Studant s1 = new Studant();

        s1.read();

        s1.print();
    }
}
