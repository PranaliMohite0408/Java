class Demo
{
    public int i;
    public final int j; 

    public Demo() //Demo() : j(11) in C++
    {
        i = 20; 
        j = 11;
    } 
}

class FinalChar
{
    public static void main(String arg[])
    {
        Demo obj = new Demo();
        System.out.println("Value of j :"+obj.j);
        //obj.j++; //Not Allow
    }
}

//j++ => j = j + 1;