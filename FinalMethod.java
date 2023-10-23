class FinalMethod
{
    public static void main(String arg[])
    {
            Base obj = new Derived(); //Upcasting
            obj.fun();
            FinalMethod.gun();
    }

    public static void gun()
    {
        final int no = 11;
        System.out.println("Static gun ");
        // no++; // NA
    }
}

class Base
{
    public void fun()
    {
        System.out.println("Base Fun");
    } 
    public final void gun()   //Method that we cant override
    {
        System.out.println("Base gun");
    }


}
class Derived extends Base
{
    public void fun()   //override
    {
        System.out.println("Derived Fun");
    } 
    // public void gun()  // not allow
    // {
    //     System.out.println("Derived gun");
    // }
}