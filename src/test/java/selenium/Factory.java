package selenium;

public class Factory {

    @org.testng.annotations.Factory
    public Object[] fact(){
        Object[] res = {new Parallelexecution(),
        new Parallelexecution()};
                return res;
    }
}
