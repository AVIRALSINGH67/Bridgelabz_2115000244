class Student {
    int rollNo;
    String name;
    int age;
    String grade;
    Student next;

    public Student(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    Student head;

    public void addAtBeginning(int rollNo, String name, int age, String grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    public void addAtEnd(int rollNo, String name, int age, String grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    public void addAtPosition(int position, int rollNo, String name, int age, String grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        if (position == 0) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }
        Student temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    public void deleteByRollNo(int rollNo) {
        if (head == null) return;
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }
        if (temp.next == null) return;
        temp.next = temp.next.next;
    }

    public Student searchByRollNo(int rollNo) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void updateGrade(int rollNo, String newGrade) {
        Student student = searchByRollNo(rollNo);
        if (student != null) {
            student.grade = newGrade;
        }
    }

    public void displayAllRecords() {
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNo + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        list.addAtEnd(1, "Aviral", 20, "A");
        list.addAtEnd(2, "Ayush", 21, "B");
        list.addAtBeginning(3, "Arpit", 19, "A");
        list.addAtPosition(1, 4, "Pankaj", 22, "C");

        list.displayAllRecords();

        list.updateGrade(2, "A+");
        System.out.println("After updating grade:");
        list.displayAllRecords();

        list.deleteByRollNo(3);
        System.out.println("After deleting student with Roll No 3:");
        list.displayAllRecords();
    }
}
