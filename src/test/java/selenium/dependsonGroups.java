package selenium;

import org.testng.annotations.Test;

public class dependsonGroups {

    @Test(dependsOnGroups = {"login"})
    public void dependsongroupsmethod(){
        System.out.println("After login this groups should executed");
    }

    @Test(groups = "login",priority = -1)
    public void login1(){
        System.out.println("Login successful");
    }

    @Test(groups="login")
    public void logout(){
        System.out.println("Logout Successful");
    }
}
