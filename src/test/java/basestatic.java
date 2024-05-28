public class basestatic {

    public static void display()
    {
        System.out.println(
                "Static or class method from Base");
    }

    // Non-static method which will be overridden in derived
    // class
    public void print()
    {
        System.out.println(
                "Non-static or Instance method from Base");
    }

    private void fun() {
        System.out.println("Base fun");
    }
}
