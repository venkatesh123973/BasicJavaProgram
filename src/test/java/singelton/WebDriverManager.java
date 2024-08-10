package singelton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {

    private static WebDriverManager instance;
    private static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();
    private WebDriverManager(){

    }

    public void initwebDriver(String browser){
        switch(browser){
            case "chrome" :
                tdriver.set(new ChromeDriver());
                break;
            case "firefox" :
                tdriver.set(new FirefoxDriver());
                break;
            case "edge" :
                tdriver.set(new EdgeDriver());
                break;

            default:
                throw new IllegalArgumentException("Unupported Browser" +browser);
        }
    }

    public static WebDriverManager getInstance(String browser){
        if(instance==null){
            synchronized (WebDriverManager.class){
                if(instance==null){
                    instance=new WebDriverManager();
                }
            }

            if(tdriver.get()==null){
                instance.initwebDriver(browser);
            }

        }

        return instance;
    }

    public WebDriver getDriver(){
        return tdriver.get();
    }

    public static void quitWebdriver(){
        if(tdriver.get()!=null){
         tdriver.get().quit();
         tdriver.remove();
        }
    }
    }
