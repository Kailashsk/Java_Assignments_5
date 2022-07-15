import java.util.Scanner;

public class aq1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the 10 number");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of search");
        int x=sc.nextInt();
        int count=0;
      for(int j=0;j<10;j++)
      {
          if(arr[j]==x)
          count++;
      }
      System.out.println("Number of apper in array"+ count);
    }
}
