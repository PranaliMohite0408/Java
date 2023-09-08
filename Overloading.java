class Overloading
{
    public static void main(String arg[])
    {
        Demo obj = new Demo();

        int iret = 0;
        float fret = 0.0f;
        int data = 0;

        iret = obj.Add(10,20);
        System.out.println("Addition of Two Integers is "+iret);

        fret = obj.Add(10.5f, 10.3f);
        System.out.println("Addition of Two float is "+fret);

        data = obj.Add(10,20,30);
        System.out.println("Addition of Three Integers is "+data);

        obj.fun(10, 10.5f);
        obj.fun(11.5f, 20);
    }
}
class Demo
{
    //overloading by changing the datatype
    public int Add(int no1, int no2)
    {
        return no1+no2;
    }
    public float Add(float no1, float no2)
    {
        return no1+no2;
    }

    //overloading by changing number of arguments
    public int Add(int no1, int no2, int no3)
    {
        return no1+no2+no3;
    }

    //Overloading by changing the sequence of Arguments 
    public void fun(int i, float j)
    {
        System.out.println("Inside First fun");
    }
    public void fun(float j, int i)
    {
        System.out.println("Inside Second Fun");
    }
}