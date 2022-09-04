package DSA_java;
import java.util.Scanner;











public class ArrayDsa01 {

    //print array function
    static void printArray(int arr[]){
        for (int x = 0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }
    }

    //reverse array function
    static void reverseArray(int arr[]){
        int start =0;
        int end = arr.length -1;
        int tem ;
        while(start<end){
            tem = arr[start];
            arr[start] = arr[end];
            arr[end]=tem;
            start++;
            end--;
        }
        System.out.println();
        printArray(arr);
    }

    //the main function is start
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ind = input.nextInt();
        int arr[] = new int[ind];

        for (int i=0;i<=ind-1;i++) {
            arr[i] = input.nextInt();
        }
        printArray(arr);
        System.out.println();
        reverseArray(arr);
    }
}
