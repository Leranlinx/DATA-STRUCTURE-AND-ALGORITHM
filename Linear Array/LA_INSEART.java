// 01. set i to n 
// 02. if i>n then go step -7 
// 03. if array [i] = item , then go to stpe 6 
// 04. set i to i+1 
// 05. go to step 2 
// 06. print element item found at index location i and go to step-8 
// 07. print element not found 
// 08. exit 

/**
 * LA_INSEART
 */
import java.util.Scanner;
public class LA_INSEART {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] arr = {1,2,3,4,5,6};
        System.out.print("How many index data do you want to insert? = ");
        int loc =input.nextInt();
        System.out.println("Index Item number = ");
        int new_item = input.nextInt();

        for(int i=0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        for (int i=arr.length ; i>loc ; i--){
            
        }
    }
}

