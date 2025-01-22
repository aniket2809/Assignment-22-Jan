
import java.util.*;

public class TestStudent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s[] = new Student[2];
        String swc;
        //Accepting the values
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();
            System.out.println("Enter the details for Student " + (i + 1));
            System.out.println("--------------------");
            System.out.println("Enter Roll Number");
            s[i].setRoll(sc.nextInt());
            System.out.println("Enter Name");
            s[i].setName(sc.next());
            System.out.println("Enter the certification done of these following -");
            System.out.println("1.OCJP\t2.OCA\t3.MCSA\t4.GCP");
            swc = sc.next();
            switch (swc) {
                case "GCP":
                    s[i].setMarks(92);
                    break;
                case "OCJP":
                    s[i].setMarks(90);
                    break;
                case "OCA":
                    s[i].setMarks(80);
                    break;
                case "MCSA":
                    s[i].setMarks(77);
                default:
                    System.out.println("Invalid Input");
            }
        }

        //Printing the values
        for (Student i : s) {
            System.out.println("Details of Student ");
            System.out.println("Roll of the student " + i.getRoll());
            System.out.println("Name of the student " + i.getName());
            System.out.println("Marks of the student " + i.getMarks());
            System.out.println("----------------------------");
        }
    }
}
