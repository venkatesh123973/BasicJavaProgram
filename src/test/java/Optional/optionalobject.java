package Optional;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Optional;

public class optionalobject {

    @Test
    public void option(){
        Optional<String> empty = Optional.empty();
        Assert.assertTrue(empty.isEmpty());
//        Assert.assertTrue(empty.isPresent());
    }
    @Test
    public void usingOf(){
        String name ="ven";
        name=null;
        Optional<String> nonnullable=Optional.of(name);
        Assert.assertTrue(nonnullable.isPresent());
    }
    @Test
    public void usingofNullable(){
//        String name ="ven";
       String name=null;
        Optional<String> nonnullable=Optional.ofNullable(name);
        Assert.assertTrue(nonnullable.isPresent());
    }
}
