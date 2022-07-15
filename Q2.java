import java.util.Scanner;

public class aq1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ten no.");
        int arr[]=new int[10];
        int e=0,o=0,p=0,n=0;
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();

            if(arr[i]>=0)
            {
                p++;
            if(arr[i]%2==0)
                e++;
            else
                o++;
            }

            else
            {
                n++;
                if(arr[i]%2==0)
                e++;
            else
                o++;
            }

        }
        System.out.println("Even"+e);
        System.out.println("Odd"+o);
        System.out.println("Positive"+p);
        System.out.println("Negative"+n);
    }
}
