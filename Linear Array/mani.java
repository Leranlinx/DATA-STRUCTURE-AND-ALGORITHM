/**
 * mani
 */
import java.util.Scanner;
public class mani {

    public static void main(String[] args) {

        try (//Array length def ..
        Scanner input = new Scanner (System.in)) {
            System.out.print("Length of array : ");
            int size = input.nextInt();

            // Array elements def ..
            System.out.println("Enter array element : ");
            int[]arr = new int[size+1];
            for (int i=0; i<arr.length; i++){
                arr[i]=input.nextInt();
            }

            // Arrasy new item location 
            System.out.print("New item index number : ");
            int loc = input.nextInt();
            System.out.print("Enter new item : ");
            int new_item = input.nextInt();

            for (int i=size; i>loc ;i--) {
                arr[i]=arr[i-1];
            }
            arr[loc]=new_item; 
            size++ ;
                    for (int i=0; i<arr.length; i++){
                System.out.println("Array element :"+arr[i]);
            }
        }
    }   
}

// import java.util.Scanner;
// public class LA_INSEART {
//     public static void main(String[] args) {
//         Scanner input =new Scanner (System.in);
//         int size,loc,new_item,i;
//         System.out.print("Enter array/length size : ");
//         size =input.nextInt();

//         int arr[]=new int [size+1];
//         System.out.print("Enter arry element : ");
//         for (i =0 ; i<arr.length ; i++){
//             arr[i]=input.nextInt();

//         }
//         System.out.print("Enter Array location index : ");
//         loc = input.nextInt();
//         System.out.print("Enter your new item");
//         new_item = input.nextInt();

//         for (i=size; i>loc ;i--) {
//             arr[i]=arr[i-1];
//         }
//         arr[loc]=new_item;
//         size++;
//         for (i=0 ; i<arr.length ;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

