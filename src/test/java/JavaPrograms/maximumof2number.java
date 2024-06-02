package JavaPrograms;

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

    public static void main (String args[]){
        int a[] = {1,2,3,4,5,6};
        System.out.println(getarray(a,6));
    }
}
