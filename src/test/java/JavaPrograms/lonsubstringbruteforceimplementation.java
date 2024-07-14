package JavaPrograms;

public class lonsubstringbruteforceimplementation {

    public static int longstring(String name){

        int maxlength = 0;
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<name.length();i++){

            for(int j=i;j<name.length();j++){
               if(builder.indexOf(String.valueOf(name.charAt(j)))!= -1){
                break;
               }
               builder.append(name.charAt(j));
               maxlength=Math.max(maxlength,builder.length());
            }

        }
        return maxlength;
    }

    public static void main(String[] args) {
        String name = "abca";
        System.out.println(longstring(name));
    }
}

