import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Adding values in the array
        for(int i=0;i<n;i++){
            System.out.println("Enter the value of the "+(i+1)+" index");
            arr[i] = sc.nextInt();
        }

        // Converting the array
        String con[] = new String[n];
        for(int i=0;i<n;i++){
            con[i]=Integer.toString(arr[i]);
        }

        System.out.println("Integer Array converted to String");
        System.out.println("The new array is");

        for (int i=0;i<n;i++){
            System.out.println(con[i]);
        }
    }
}
