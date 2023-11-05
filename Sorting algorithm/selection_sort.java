/**
 * selection_sort
 */
public class selection_sort {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int min_index = 0 ;
        int i;
        int j;
        int [] arr = {21,3,4,2,42,12,32};

        for ( i =0 ; i<7 ; i++){
            min_index = i ;
            for (j = i+1 ; j<7 ; j++){
                if (arr[j] <arr[min_index]){
                    min_index = j;
                }
            }
        int temp = arr[i];
        arr[i]= arr[min_index];
        arr[min_index] = temp;
        
        }
        for (i = 0 ; i<7 ; i++){
            System.out.println(arr[i]);
        }
    }
}