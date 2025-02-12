class Process {
    int id, burstTime, priority;
    Process next;

    Process(int id, int burstTime, int priority) {
        this.id = id;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    private Process head = null, tail = null;
    private final int TIME_QUANTUM = 4;

    void addProcess(int id, int burstTime, int priority) {
        Process newProcess = new Process(id, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    void removeProcess(int id) {
        if (head == null) return;
        if (head.id == id && head == tail) {
            head = tail = null;
            return;
        }
        Process temp = head, prev = null;
        do {
            if (temp.id == id) {
                if (prev != null) prev.next = temp.next;
                if (temp == head) head = head.next;
                if (temp == tail) tail = prev;
                tail.next = head;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void executeProcesses() {
        if (head == null) return;
        Process temp = head;
        int totalTime = 0, waitingTime = 0, turnaroundTime = 0, count = 0;
        do {
            if (temp.burstTime > 0) {
                int executedTime = Math.min(temp.burstTime, TIME_QUANTUM);
                temp.burstTime -= executedTime;
                totalTime += executedTime;
                turnaroundTime += totalTime;
                if (temp.burstTime == 0) {
                    removeProcess(temp.id);
                }
            }
            temp = temp.next;
            count++;
        } while (head != null);

        System.out.println("Average Waiting Time: " + (double) waitingTime / count);
        System.out.println("Average Turnaround Time: " + (double) turnaroundTime / count);
    }

    void displayProcesses() {
        if (head == null) return;
        Process temp = head;
        do {
            System.out.println(temp.id + " " + temp.burstTime + " " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}

public class RoundRobinManager {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 3);
        scheduler.displayProcesses();
        scheduler.executeProcesses();
    }
}
