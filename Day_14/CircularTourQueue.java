import java.util.LinkedList;
import java.util.Queue;

public class CircularTourQueue {
    static class PetrolPump {
        int petrol;
        int distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStartingPoint(PetrolPump[] pumps) {
        int n = pumps.length;
        Queue<Integer> queue = new LinkedList<>();
        int start = 0, surplus = 0, deficit = 0;

        for (int i = 0; i < n; i++) {
            surplus += pumps[i].petrol - pumps[i].distance;
            if (surplus < 0) {
                queue.offer(i);
                deficit += surplus;
                surplus = 0;
                start = i + 1;
            }
        }

        while (!queue.isEmpty()) {
            int i = queue.poll();
            surplus += pumps[i].petrol - pumps[i].distance;
            if (surplus < 0) {
                return -1;
            }
        }

        return (surplus + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };
        int start = findStartingPoint(pumps);
        if (start == -1) {
            System.out.println("No solution");
        } else {
            System.out.println("Start = " + start);
        }
    }
}