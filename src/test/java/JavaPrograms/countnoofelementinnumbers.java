package JavaPrograms;

public class countnoofelementinnumbers {

    public static void main(String[] args) {
        int num = 1234567;
        Integer count = 0;
        while(num!=0){
            num=num/10;
            ++count;
        }
        System.out.println(count);
    }
}
