package JavaPrograms;

public class productofconsecutivearray {

    public static void main(String[] args) {

        int num[] = {1,2,3,4};
      int length= num.length;
      int prod =1;

      for(int i=0;i<length-1;i++){

          prod = num[i]*num[i+1];
          System.out.println(prod);
    }

}}
