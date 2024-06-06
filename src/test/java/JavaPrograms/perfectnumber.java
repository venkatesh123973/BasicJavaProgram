package JavaPrograms;

public class perfectnumber {

    public static void main(String[] args) {

        int i,sum=0;

        int num =99;

        for(i=1;i<=num/2;i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
            if(sum==num){
                System.out.println("given num is perfect number" +num);
            }

            else{
                System.out.println("given number is not perfect number" +num);
            }

    }
}
