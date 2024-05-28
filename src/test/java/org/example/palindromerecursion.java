package org.example;

public class palindromerecursion {

    public static boolean palin(String str){
        if(str==null){
            return false;
        }
        if(str.length()<1) {
            return true;
        }
             String first=str.substring(0,1);
             String last=str.substring(str.length()-1,str.length());
             if(!first.equals(last)){
              return false;
             }
             else{
                 return palin(str.substring(1,str.length()-1));
             }

}

    public static void main (String args[]){
       String str1="amma";
        boolean res=palin(str1);
        System.out.println(res);

        System.out.println("Given string is palindrome"+ res);
}

}
