import java.util.*;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ename[] = new String[3];
        int sal[] = new int[3];

        //Taling user input
        for (int i=0;i<ename.length;i++){
                System.out.println("Enter your name");
                ename[i]=sc.next();
                System.out.println("Enter your salary");
                sal[i]=sc.nextInt();
        }

        // Finding highest salary
        int highsal = 0;
        String name="";
        
        for(int i=0;i<sal.length;i++){
            if(sal[i]>highsal){
                highsal = sal[i];
                name = ename[i];
            }
        }

        // Printing the details of the employee with the highest salary
        System.out.println("The Employee with highest salary is "+name+" with a salary of "+highsal);
    }
}
