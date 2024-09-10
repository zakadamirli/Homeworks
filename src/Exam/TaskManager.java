package Exam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class TaskManager {
    private List<Task> tasks;
    private Set<String> taskNames;

    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.taskNames = new HashSet<>();
    }

    // method 1
    public void addTask(Task task) throws DuplicateTaskExample {
        if (taskNames.contains(task.getName())) {
            throw new DuplicateTaskExample("Task with name " + task.getName() + " already exists");
        }
        tasks.add(task);
        taskNames.add(task.getName());
    }

    // method 2
    public void removeName(String name) {
        Iterator<Task> iterator = tasks.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (Objects.equals(name, task.getName())) {
                iterator.remove();
                taskNames.remove(name);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found task for removing");
        }
    }

    public void displayAll() {
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    // method 3
    public void displayTaskSpe(TaskStatus taskStatus) {
        for (Task t : tasks) {
            if (taskStatus.equals(t.getStatus())) {
                System.out.println(t);
            }
        }
    }

    // method 4
    public void updateStatus(String name, TaskStatus taskStatus) {
        for (Task t : tasks) {
            if (Objects.equals(t.getName(), name)) {
                t.setStatus(taskStatus);
                break;  // Exit the loop once the task is found and updated
            }
        }
    }

    // method 5
    public void totalStatus() {
        int newStatus = 0;
        int inProgress = 0;
        int completed = 0;

        for (Task task : tasks) {
            switch (task.getStatus()) {
                case NEW:
                    newStatus++;
                    break;
                case IN_PROGRESS:
                    inProgress++;
                    break;
                case COMPLETED:
                    completed++;
                    break;
            }
        }

        System.out.println("NEW: " + newStatus);
        System.out.println("IN_PROGRESS: " + inProgress);
        System.out.println("COMPLETED: " + completed);
    }
}
