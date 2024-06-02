package JavaPrograms;

public class palindrome {

    public static void main (String args[]){
        String nor = "Happy";

        String reversed = " ";
        char[] ch1=nor.toCharArray();
        for(int i=ch1.length-1;i>=0;i--){
          reversed =reversed+ch1[i];

        }
        System.out.println(reversed);

        if(reversed.equals(nor)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
    }


}
