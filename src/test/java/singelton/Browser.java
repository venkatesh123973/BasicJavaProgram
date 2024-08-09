package singelton;

public class Browser {

    private static Browser browser;

    private Browser(){

    }

    public static Browser getInstance(){
        if(browser==null){
            synchronized (Browser.class){
                if(browser==null){
                    browser=new Browser();
                }
            }

        }

        return browser;
    }

    public void info(){
        System.out.println("Browser info");
    }

    public static void main(String[] args) {

        Runnable task = ()-> Browser.getInstance().info();
        Thread th1= new Thread(task);
        Thread th2= new Thread(task);
        Thread th3= new Thread(task);

        th1.start();
        th2.start();
        th3.start();

        try{
            th1.join();
            th2.join();
            th3.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
