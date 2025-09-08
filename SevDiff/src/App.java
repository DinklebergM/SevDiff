import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

            System.out.println("\n--- To-Do-Liste ---");
            System.out.println("1. Aufgabe hinzufügen");
            System.out.println("2. Aufgaben anzeigen");
            System.out.println("3. Aufgabe löschen");
            System.out.println("4. Beenden");
            System.out.print("Was möchtest du tun? -> ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                CreateTodo.idErstellen();
                break;
            }

            scanner.close();

    }
}
