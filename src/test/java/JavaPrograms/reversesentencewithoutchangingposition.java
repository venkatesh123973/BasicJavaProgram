package JavaPrograms;

public class reversesentencewithoutchangingposition {
    public static void main(String args[]) {
        String str = "I am a Engineer";
        String[] arr = str.split(" ");
        String RevString = "";

        for (int i = 0; i < arr.length;i++){
            String word = arr[i];
            String revword = " ";

            for (int j=word.length()-1;j>=0;j--){
                revword=revword+word.charAt(j);
            }

            RevString = RevString +revword;
        }

        System.out.println(RevString);
    }

}
