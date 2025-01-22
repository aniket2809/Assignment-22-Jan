import java.util.*;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s[] = new Student[2];
        
        //Accepting the values
        for(int i=0;i<s.length;i++){
            s[i] = new Student();
            System.out.println("Enter the details for Student "+(i+1));
            System.out.println("--------------------");
            System.out.println("Enter Roll Number");
            s[i].setRoll(sc.nextInt());
            System.out.println("Enter Name");
            s[i].setName(sc.next());
            System.out.println("Enter marks");
            s[i].setMarks(sc.nextInt());
        }

        //Printing the values
        for(Student i:s){
            System.out.println("Details of Student ");
            System.out.println("Roll of the student "+i.getRoll());
            System.out.println("Name of the student "+i.getName());
            System.out.println("Marks of the student "+i.getMarks());
            System.out.println("----------------------------");
        }
    }
}
