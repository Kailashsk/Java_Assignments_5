import java.util.Scanner;

public class aq1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int cn=0,cn2=0,in1,in2;
        System.out.println("Enter ten no.");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        int mx=arr[0],mn=arr[0];
        int p=0,p2=0;
        for(int i=0;i<10;i++)
        {
            if(arr[i]>mx)
            {
                mx=arr[i];
                p=i;
            }
            else if(arr[i]==mx)
            {
                cn++;
            }
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]<mn)
            {
                mn=arr[i];
                p2=i;
            }
            else if(arr[i]==mn)
            {
                cn2++;
            }
        }

        System.out.println("The maximum no is "+mx +" "+cn +" "+ p);
        System.out.println("The maximum no is "+mn +" "+cn2 +" "+ p2);

    }
}
