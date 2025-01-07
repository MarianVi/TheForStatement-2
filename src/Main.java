import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TO DO:
        int numarCitit = scanner.nextInt();
        int x = numarCitit;
        System.out.print("1. ");
        for (int numar = 0; numar <= numarCitit; numar++) {
            System.out.print(numar + " ");
        }
        System.out.println();
        System.out.print("2. ");
        for (int numar2 = 0; numar2 <= numarCitit; numar2++) {
            if (numar2 % 2 != 0) {
                System.out.print(numar2 + " ");
            }
        }
        System.out.println();
        System.out.print("3. ");
        for (int numar3 = 0; numar3 <= numarCitit; numar3++) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
            x--;
        }
        System.out.println();
        System.out.print("4. ");
        for (int numar4 = 0; numar4 <= numarCitit; numar4++) {
            if (numar4 % 5 == 0) {
                System.out.print(numar4 + " ");
            }
        }

    }
}