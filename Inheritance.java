class Inheritance
{
    public static void main(String args[])
    {
        Base bobj = new Base ();
        bobj.fun();

        Derived dobj = new Derived();
        dobj.fun();
        dobj.gun();
    }
}
class Base
{
    public int x, y;

    public Base()
    {
        System.out.println("Inside Base Default Constructor");
        this.x = 0;
        this.y = 0;
    }
    public Base(int a, int b)
    {
        System.out.println("Inside Base Parameterised Constructor");
        this.x = a;
        this.y = b;
    }
    public void fun()
    {
        System.out.println("Inside Base Fun");
    }
}
class Derived extends Base
{
    int a,b;
    public Derived()
    {
        System.out.println("Inside Derived Default Constructor");
        this.a = 0;
        this.b = 0;
    }

    public Derived(int no1, int no2)
    {
        System.out.println("Inside Derived Parametrised Constructor");
        this.a = no1;
        this.b = no2;
    }
    public void gun()
    {
        System.out.println("Inside Derived gun");
    }
}   