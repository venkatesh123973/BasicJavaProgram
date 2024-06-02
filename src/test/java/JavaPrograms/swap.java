package JavaPrograms;

public class swap {

    public static void main (String args[]){

        int num1= 20;
        int num2 =40;

//        int temp;
//
//        System.out.println("Before Swapping" + num1+ "" +num2);
//
//        temp= num1;
//        num1=num2;
//        num2=temp;
//
//        System.out.println("After Swapping" + num1+ "" +num2);

        num1 = num1-num2;
        num2=num1+num2;
        num1= num2-num1;
        System.out.println("After Swapping" +num1+ "" +num2);

    }
}
