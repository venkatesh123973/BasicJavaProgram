package dataprovider;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class basedataprovider {

    @DataProvider(name = "logindetails",parallel = true)
    public Object[][] getdata(Method method) {
        Object[][] twodata = {
                {"admin", "admin123"},
                {"Admin", "admin123"}
        };

        Object[][] nexttwodata = {
                {"admin", "admin123"},
                {"Admin", "admin123"}
        };
        String methodname = method.getName();
        if (methodname.equalsIgnoreCase("loginorangehrm")) {
            return twodata;
        } else if (methodname.equalsIgnoreCase("printloginorangehrmnameandpassword")) {
            return nexttwodata;
        }

        else {
            return new Object[][] {{"No data","No data"}};
        }
    }
}
