import java.util.*;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n]; // Fpr storing the array
        int revarr[] = new int[n]; // For storing the reversed array
        
        // Entering the value in the array
        for(int i=0;i<n;i++){
            System.out.println("Enter the value for the "+(i+1)+" index");
            arr[i]=sc.nextInt();
        }   

        
        // Reversing the array
        int j = n;
        int t=0;
        while(j>0){
            revarr[j-1]=arr[t];
            j--;
            t++;
        }

        System.out.println("Reversed Array created");

        //Sum of the Arrays
        System.out.println("Sum of the arrays");
        for(int i=0;i<n;i++){
            System.out.println((arr[i]+revarr[i]));
        }
    }
}
