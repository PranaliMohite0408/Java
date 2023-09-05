import java.lang.*;

class Demo
{
    public int no1;
    public int no2;

    public Demo()  //Default Constructor
    {
        this.no1 = 0;
        this.no2 = 0;
    }

    public Demo(int x, int y)  //Paramaterised Constructor
    {
        this.no1 = x;
        this.no2 = y;
    }

    public int Addition()  //Behaviour OR  Method
    {
        int ans = 0;
        ans = this.no1 + this.no2;
        return ans;
    }

    public int Substraction()
    {
        int ans = 0;
        ans = this.no1 - this.no2;
        return ans;
    }
}

class Arithmetic
{
    public static void main(String arg[])
    {
        System.out.println("Inside main");

        Demo obj; //Reference
        obj = new Demo(); //Dynamic Memory Allocation

        Demo obj2 = new Demo(21,11);

        int ret = 0;

        ret = obj2.Addition();
        System.out.println("Addition is =>"+ret);

        ret = obj2.Substraction();
        System.out.println("Substraction is =>"+ret);
    }
}