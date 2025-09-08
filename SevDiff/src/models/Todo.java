package models;

public class Todo {

    private int id;
    private String name;
    private int date;
    private boolean finished;

    public Todo(int id, String name, int date, boolean finished){
        this.id = id;
        this.name = name;
        this.date = date;
        this.finished = finished;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}