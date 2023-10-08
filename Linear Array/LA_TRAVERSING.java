//-> Write an algorithm for travesing in array <-//

// 1. initialize  set k = lb. 
// 2. repear step 3 and 4 while k <= ub.
// 3. visit element
//    Apply process la = [k].
// 4. Increase counter; k = k+1
//    End of step 2 loop. 
// 5. exit. 


public class LA_TRAVERSING {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i=0; i<arr.length; i++){
            System.out.println("Array Element "+i +" = "+ arr[i]);
        }
    }
}
