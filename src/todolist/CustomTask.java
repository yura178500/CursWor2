package todolist;

import java.time.LocalDate;

public class CustomTask extends Task  {

    public CustomTask(String title, String project, String taskDescription,String ld, LocalDate dueDate) {
        super(title, project, taskDescription,ld, dueDate);
    }
    public void run() {
        try {
            System.out.println("");

        } catch (Exception ex) {
            System.out.println("error running thread " + ex.getMessage());
        }
    }
}