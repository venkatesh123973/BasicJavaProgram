package JavaPrograms;

import java.util.Calendar;
import java.util.function.Supplier;

public class supplier {

    public static void usingannonymousclassforsupplier(){
        Supplier<Object> sup = new Supplier<Object>(){

            @Override
            public Object get() {
                Calendar cal = Calendar.getInstance();
                return cal.getTime();
            }
        };
        System.out.println(sup.get());
    }
    public static void main(String[] args) {
    usingannonymousclassforsupplier();
    }
}
