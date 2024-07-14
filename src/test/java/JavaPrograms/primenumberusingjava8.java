package JavaPrograms;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class primenumberusingjava8 {

    public static boolean prime(int num){

        return num>1&& IntStream.range(2,num).noneMatch(n->num%n==0);
    }

    public static void allprime(int num2){
        Stream.iterate(1,i->i+1).filter(primenumberusingjava8::prime).limit(num2).forEach(System.out::println);
    }

    public static void main(String[] args) {
        int num = 6;
        boolean resu=prime(num);
        allprime(7);
        System.out.println(resu);

    }
}
