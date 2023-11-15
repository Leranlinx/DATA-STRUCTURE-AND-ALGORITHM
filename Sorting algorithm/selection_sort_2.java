public class selection_sort_2 {
    public static void printarray (int [] arr){
        for (int i =0 ;i<arr.length ; i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {43,43,455,3444,33};
        int n = arr.length ; 

        for (int i =0 ; i<n-1; i++){
            int index_min = i ;
            for (int j = 0 ; j<i ; j ++){
                if (arr[j] < arr[index_min]){
                    index_min = arr[j];
                }
            }
            int temp = arr[i];
            arr[i]= index_min;
            index_min  = temp;
        }
        printarray(arr);
    }
}
