import java.util.Scanner;

public class CreateTodo {
public static void idErstellen(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Wie soll die Todo heißen ?");
    String name = scanner.nextLine();
    scanner.close();

    System.out.println("Welches datum muss die Todo erledigt sein? ()");
    String input = scanner.nextLine();

    System.out.println("Ist die Todo erledigt? (ja / nein)");
}
}
