import java.lang.*;

class ArrayDemo
{
    public static void main(String arg[])
    {
        int arr[] = new int[5]; //First way
        arr[0] = 11;
        arr[1] = 21;
        arr[2] = 51;
        arr[3] = 101;
        arr[3] = 111;

        System.out.println("Length of array is :"+arr.length);
    
        int brr[] = {11,21,51,101,111};  //second way

        int crr[] = new int[] {11,21,51,101,111};   //third way


        System.out.println("Display Array Element Using For loop");

        for(int i=0; i<arr.length-1; i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Display Array Element Using while loop");
        int j=0;
        while(j<arr.length-1)
        {
            System.out.println(arr[j]);
            j++;
        }
       
       System.out.println("Display Array Element Using do while loop");
       int k=0;
        do{
            System.out.println(arr[k]);
            k++;
        }while(j<arr[k]-1);

        System.out.println("Display Array Element Using For Each loop");

        for(int no : arr)
        {
            System.out.println(no);
        }
    }
}
