package JavaPrograms;

import java.util.Arrays;

public class stringofarraythatsumpuptotarget {

    public static void main(String[] args) {

        String [] arr = {"1","-1","4","5","3"};
        int target =3;

        int[] numarr=Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

        for(int i=0;i<numarr.length-1;i++){

            for(int j=i+1;j<numarr.length-1;j++){

                if(numarr[i]+numarr[j]==target){
                    System.out.println( "First number" +numarr[i]+ "second number" +numarr[j]);
                }
            }
        }

    }
}
