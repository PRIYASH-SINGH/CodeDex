import java.util.*;

public class BUBBLE_SORT {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("WELCOME !!! THIS IS THE SIIMPLEST SORTING ALGORITHM \n THIS WORKS ON THE PRINCIPLE OF BUBBLE UP THE HIGHEST ELEMENT \n TO THE ADJACENT ELEMENT :)\nENTER THE SIZE OF THE ARRAY >>> ");
        int n=scan.nextInt();        
        int arr[]=new int[n];
        for(int i=0;i<=n-1;i++){
            System.out.print("ENTER ANY VALUE AT INDEX "+i+" >>> ");
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("After Applying Bubble Sort >>> ");
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]);
        }
    }
}