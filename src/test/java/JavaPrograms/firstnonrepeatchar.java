package JavaPrograms;

public class firstnonrepeatchar {

    public static void main(String[] args) {
        String input ="Javaa";


        for(int i=0;i<input.length();i++){
            boolean flag =true;
            for(int j=0;j<input.length();j++){

                if(i!=j && input.charAt(i)==input.charAt(j)){
                    flag=false;

                }

            }
            if(flag==false){
                System.out.println(input.charAt(i));
                break;
            }
        }
    }
}
