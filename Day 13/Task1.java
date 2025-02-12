import java.time.LocalDate;

class Task {
    int id, priority;
    String name;
    LocalDate dueDate;
    Task next;

    Task(int id, String name, int priority, LocalDate dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    private Task head = null, tail = null, current = null;

    void addTaskAtBeginning(int id, String name, int priority, LocalDate dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }

    void addTaskAtEnd(int id, String name, int priority, LocalDate dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
    }

    void addTaskAtPosition(int id, String name, int priority, LocalDate dueDate, int position) {
        if (position <= 1) {
            addTaskAtBeginning(id, name, priority, dueDate);
            return;
        }
        Task newTask = new Task(id, name, priority, dueDate);
        Task temp = head;
        int count = 1;
        while (temp.next != head && count < position - 1) {
            temp = temp.next;
            count++;
        }
        newTask.next = temp.next;
        temp.next = newTask;
        if (temp == tail) tail = newTask;
    }

    void removeTaskById(int id) {
        if (head == null) return;
        Task temp = head, prev = null;
        do {
            if (temp.id == id) {
                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                    if (temp == tail) tail = prev;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void viewCurrentTask() {
        if (current == null) current = head;
        System.out.println("Current Task: " + current.name);
    }

    void moveToNextTask() {
        if (current == null) current = head;
        current = current.next;
        viewCurrentTask();
    }

    void displayAllTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    void searchTaskByPriority(int priority) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
            }
            temp = temp.next;
        } while (temp != head);
    }
}

public class Task1 {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTaskAtEnd(1, "Task1", 2, LocalDate.of(2025, 2, 15));
        scheduler.addTaskAtEnd(2, "Task2", 1, LocalDate.of(2025, 2, 18));
        scheduler.addTaskAtBeginning(3, "Task3", 3, LocalDate.of(2025, 2, 10));
        scheduler.displayAllTasks();
        scheduler.viewCurrentTask();
        scheduler.moveToNextTask();
        scheduler.searchTaskByPriority(1);
        scheduler.removeTaskById(2);
        scheduler.displayAllTasks();
    }
}
