class Item {
    String name;
    int id, quantity;
    double price;
    Item next;

    Item(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    private Item head = null;

    void addItemAtBeginning(int id, String name, int quantity, double price) {
        Item newItem = new Item(id, name, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    void addItemAtEnd(int id, String name, int quantity, double price) {
        Item newItem = new Item(id, name, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newItem;
    }

    void addItemAtPosition(int id, String name, int quantity, double price, int position) {
        if (position <= 1) {
            addItemAtBeginning(id, name, quantity, price);
            return;
        }
        Item newItem = new Item(id, name, quantity, price);
        Item temp = head;
        int count = 1;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) return;
        newItem.next = temp.next;
        temp.next = newItem;
    }

    void removeItemById(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.id != id) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    void updateQuantityById(int id, int quantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = quantity;
                return;
            }
            temp = temp.next;
        }
    }

    void searchItemById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println(temp.id + " " + temp.name + " " + temp.quantity + " " + temp.price);
                return;
            }
            temp = temp.next;
        }
    }

    void searchItemByName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println(temp.id + " " + temp.name + " " + temp.quantity + " " + temp.price);
                return;
            }
            temp = temp.next;
        }
    }

    void calculateTotalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    void sortByNameAscending() {
        head = mergeSort(head, true, false);
    }

    void sortByNameDescending() {
        head = mergeSort(head, true, true);
    }

    void sortByPriceAscending() {
        head = mergeSort(head, false, false);
    }

    void sortByPriceDescending() {
        head = mergeSort(head, false, true);
    }

    private Item mergeSort(Item head, boolean byName, boolean descending) {
        if (head == null || head.next == null) return head;
        Item mid = getMiddle(head);
        Item midNext = mid.next;
        mid.next = null;
        Item left = mergeSort(head, byName, descending);
        Item right = mergeSort(midNext, byName, descending);
        return merge(left, right, byName, descending);
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Item merge(Item left, Item right, boolean byName, boolean descending) {
        if (left == null) return right;
        if (right == null) return left;
        boolean condition;
        if (byName) condition = left.name.compareToIgnoreCase(right.name) < 0;
        else condition = left.price < right.price;
        if (descending) condition = !condition;
        if (condition) {
            left.next = merge(left.next, right, byName, descending);
            return left;
        } else {
            right.next = merge(left, right.next, byName, descending);
            return right;
        }
    }

    void displayInventory() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.name + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }
}

public class InventoryManager {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addItemAtEnd(1, "Laptop", 5, 1000);
        inventory.addItemAtEnd(2, "Phone", 10, 500);
        inventory.addItemAtBeginning(3, "Tablet", 7, 300);
        inventory.displayInventory();
        inventory.calculateTotalValue();
        inventory.sortByNameAscending();
        inventory.displayInventory();
        inventory.updateQuantityById(1, 8);
        inventory.searchItemById(1);
        inventory.removeItemById(2);
        inventory.displayInventory();
    }
}
