package JavaPrograms;

public class pairofarraythatsumpuptotarget {

    public static void sumuptotarget(int arr[],int target){

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]+arr[j]==target){
                    System.out.println( "First number" +arr[i]+ "second number" +arr[j]);
                }
            }
        }

    }

    public static void main(String[] args) {

        int[] arr = {1,2,5,7,4};
        int target = 3;
        sumuptotarget(arr,target);
    }
}
