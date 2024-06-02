package JavaPrograms;

public class test {

    public static void main (String args[]){

        int a[] = {1,2,3,4,5};
        int total;
        for (int i =0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    total = a[i];
                    a[i]= a[j];
                    a[j]=total;
                }
            }
        }

        System.out.println(a[a.length-3]);
    }
}
