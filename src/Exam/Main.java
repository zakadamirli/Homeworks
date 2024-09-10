package Exam;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        try {
            taskManager.addTask(new Task("Level1", PriorityLevel.LOW, TaskStatus.NEW));
        } catch (DuplicateTaskExample e) {
            System.out.println(e.getMessage());
        }
        try {
            taskManager.addTask(new Task("Level1", PriorityLevel.LOW, TaskStatus.NEW));
        } catch (DuplicateTaskExample e) {
            System.out.println(e.getMessage());
        }
        try {
            taskManager.addTask(new Task("Level2", PriorityLevel.LOW, TaskStatus.COMPLETED));
        } catch (DuplicateTaskExample e) {
            throw new RuntimeException(e);
        }

        taskManager.removeName("Level2");
        taskManager.displayAll();

        taskManager.displayTaskSpe(TaskStatus.COMPLETED);

        taskManager.updateStatus("Level2", TaskStatus.NEW);
        taskManager.totalStatus();
    }
}
