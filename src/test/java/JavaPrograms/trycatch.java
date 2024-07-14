package JavaPrograms;

public class trycatch {

    public void tryblock(){

        try{
            int num =10;
            num=num/0;
        }
        finally {
            System.out.println("catch exception");
        }
    }

    public static void main(String[] args) {
        trycatch ca= new trycatch();
        ca.tryblock();
    }
}
