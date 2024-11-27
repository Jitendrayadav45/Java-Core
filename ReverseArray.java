public class ReverseArray {
     public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 7, 4, 9 };
        //output : { 9, 4, 7, 3, 5, 1}

        //index last = first 
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
        
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            //move towards center
            first++;
            last--;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
                }

     }
}
