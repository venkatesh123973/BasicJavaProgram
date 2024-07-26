package JavaPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class maximumof2number {

    public static int getarray(int[] a, int total){

        int temp;

        for (int i=0;i <total;i++){

            for (int j=i+1; j<total;j++){

                if(a[i]<a[j]){
                    temp= a[i];
                    a[i]= a[j];
                    a[j]=temp;
                }
            }
        }
      return a[total-3];
    }

    public static int thirdLargest(int[] arr) {
        return Arrays.stream(arr)
                .boxed()  // Convert int elements to Integer objects
                .sorted(Comparator.reverseOrder())  // Sort in descending order
                .skip(2)  // Skip the first two elements
                .findFirst()  // Get the third element
                .orElseThrow(() -> new IllegalArgumentException("Array does not have enough elements"));
    }

    public static void main (String args[]){
        int a[] = {1,2,3,4,5,6};
        int total = a.length;
        System.out.println(getarray(a,total));
        System.out.println(thirdLargest(a));
    }
}
