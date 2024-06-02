package JavaPrograms;

interface Iadd {
    public void add (int num1,int num2);
}

public class methodreference {
    public  void refer(int num1,int num2){
        System.out.println(num1+num2);
    }
    public static void main (String[] args) {
        Iadd Iadd = (num1, num2) -> System.out.println(num1 + num2);
        Iadd.add(3,5);
        methodreference re=new methodreference();
        Iadd Iadd1=re::refer;

        Iadd.add(3,6);
    }
}
