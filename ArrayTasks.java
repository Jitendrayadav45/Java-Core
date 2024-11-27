public class ArrayTasks {

    public static void main(String[] args) {
        int[] value = {1, 5, 3, 7, 4, 9};
        int no = 6;
        //output : {5, 1, 3, 13, 10, 15}

        //index mid = mid value - no
        int mid = value.length / 2;
        int[] result = new int[value.length];
        for (int i = 0; i < value.length; i++) {
            if (i < mid) {
                result[i] = no - value[i] ;
                } else {
                    result[i] = no + value[i];
                    }
                    }
                    for (int i = 0; i < result.length; i++) {
                        System.out.print(result[i] + " ");
                        }
                    


    }
}
