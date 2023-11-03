package Searching_Algorithm;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int searchItem = sc.nextInt();
        int arr [] = {1,2,3,45,6,7};
        for (int i=1 ; i<arr.length ; i++){
            if (i==searchItem){
                System.out.println("Item fouud at index : "+arr[i]);
            }
            else{
                System.out.println("Item not found");
            }
        }
    }
}
