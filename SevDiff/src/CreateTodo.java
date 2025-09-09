import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import models.Todo;

public class CreateTodo {
public static void idErstellen(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Wie soll die Todo heißen ?");
    String name = scanner.nextLine();

    LocalDate dueDate = null;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    while(dueDate == null){
        System.out.println("Welches Datum muss die Todo erledigt sein? (dd.MM.yyyy)");
        String input = scanner.nextLine();

        try {
            dueDate = LocalDate.parse(input, formatter);
            System.out.println("Eingegebenes Datum: "+ dueDate);
        } catch (DateTimeParseException e){
            System.out.println("Ungültiges Format! Bitte 'dd.MM.yyyy' eingeben.");
        }
    }

    boolean finished;

    while (true) {
        System.out.println("Ist die Todo erledigt? (ja / nein)");
        String marked = scanner.nextLine();
        if(marked.equals("ja")){
            finished = true;
            scanner.close();
            break;
        }else if(marked.equals("nein")){
            finished = false;
            scanner.close();
            break;
        }else{
            System.out.println("Bitte nur 'ja' oder 'nein' eingeben.");
        }
    }
    
    Todo todo = new Todo(0, name, dueDate, finished);
    System.out.println(todo.getName()+ ", " +todo.getDate()+ ", " +todo.getFinished());
}
}
