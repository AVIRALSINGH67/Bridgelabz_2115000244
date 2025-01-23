import java.util.Scanner;
public class MarksAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();

        double total = physics + chemistry + maths;
        double marks = (total / 300) * 100;

        System.out.println("marks :" + marks  );

        if (marks >= 80) {
            System.out.println("Grade: A");
            System.out.println("Level 4, above agency-normalized standards");
        } else if (marks>=70 && marks<=79 ) {
            System.out.println("Grade: B");
            System.out.println("Level 3, at agency-normalized standards");
        } else if (marks>60 && marks<=69) {
            System.out.println("Grade: C");
            System.out.println("Level 2, below but approaching agency-normalized standards");
        } else if (marks>=50 && marks<=59) {
            System.out.println("Grade: D");
            System.out.println("Level 1, well below agency-normalized standards");
        }
 else if (marks>=40 && marks<=49) {
            System.out.println("Grade: E");
            System.out.println("Level 1, too below agency-normalized standards");
        }
 else {
            System.out.println("Grade: R");
            System.out.println("Remedial standards");
        }
sc.close();
    }
}
