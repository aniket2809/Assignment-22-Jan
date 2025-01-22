import java.util.*;
public class MiddleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();

        //Creating the first array
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value for the "+i+" index");
            arr[i]=sc.nextInt();
        }

        //Priting the middle of the array
        System.out.println("--------------------------------------------");
        System.out.println("Priting the middle array");
        for(int j=1;j<n-1;j++){
            System.out.println(arr[j]);
        }

    }
}
