import java.util.ArrayList;

class User {
    int id, age;
    String name;
    ArrayList<Integer> friends;
    User next;

    User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}

class SocialNetwork {
    private User head = null;

    void addUser(int id, String name, int age) {
        User newUser = new User(id, name, age);
        if (head == null) {
            head = newUser;
            return;
        }
        User temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newUser;
    }

    void addFriend(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null && !user1.friends.contains(userId2)) {
            user1.friends.add(userId2);
            user2.friends.add(userId1);
        }
    }

    void removeFriend(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.friends.remove((Integer) userId2);
            user2.friends.remove((Integer) userId1);
        }
    }

    void displayFriends(int userId) {
        User user = findUserById(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + ": " + user.friends);
        }
    }

    void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.friends.retainAll(user2.friends);
            System.out.println("Mutual Friends: " + user1.friends);
        }
    }

    void searchUserByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println(temp.id + " " + temp.name + " " + temp.age);
            }
            temp = temp.next;
        }
    }

    void searchUserById(int id) {
        User user = findUserById(id);
        if (user != null) {
            System.out.println(user.id + " " + user.name + " " + user.age);
        }
    }

    void countFriends(int userId) {
        User user = findUserById(userId);
        if (user != null) {
            System.out.println(user.name + " has " + user.friends.size() + " friends.");
        }
    }

    private User findUserById(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }
}

public class SocialNetworkManager {
    public static void main(String[] args) {
        SocialNetwork network = new SocialNetwork();
        network.addUser(1, "Alice", 25);
        network.addUser(2, "Bob", 27);
        network.addUser(3, "Charlie", 22);
        network.addFriend(1, 2);
        network.addFriend(1, 3);
        network.displayFriends(1);
        network.findMutualFriends(1, 2);
        network.searchUserByName("Alice");
        network.countFriends(1);
        network.removeFriend(1, 2);
        network.displayFriends(1);
    }
}
