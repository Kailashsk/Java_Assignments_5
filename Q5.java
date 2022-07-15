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
        int mx=arr[0],mx2=0;
         for(int i=0;i<10;i++)
         {

            if(arr[i]>mx)
            {
             mx2=mx;
            mx=arr[i];
            }
            else if(arr[i]>mx2)
            {
                mx2=arr[i];
            }
            
         }

         System.out.println("The Second Highest "+mx2);

    }
}
