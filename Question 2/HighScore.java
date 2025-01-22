import java.util.*;
public class HighScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int arr[]=new int[n];

        // Creating a new array
        for(int i=0;i<n;i++){
            System.out.println("Enter the value for "+(i+1)+" index");
            arr[i]=sc.nextInt();
        }

        // Searching for the first high score
        int first = 0;
        for (int i=0;i<n;i++){
            if(arr[i]>first){
                first=arr[i];
            }
        }

        // Searching for the second high score
        int second = 0;
        for (int i=0;i<n;i++)
        {
            if(first > arr[i] && arr[i] > second){
                second=arr[i];
            }
        }

        // Storing the high scores in a new array
        int highscore[] = {first, second};

        System.out.println("----------------------------------");
        System.out.println("First ="+first+" Second ="+second);
        System.out.println("Printing the high score");
        // Printing the high score
        for(int r : highscore)
            System.out.println(r);
    }
}
