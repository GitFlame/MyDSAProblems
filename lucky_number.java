import java .util.*;
class lucky_numbers 
{
    static boolean isLucky(int n)
    {
        boolean ar[]=new boolean[10];
        for(int i=0;i<10;i++)
            ar[i]=false;

        while(n>0){
            int digit=n%10;


            if (ar[digit])
            return false;

            ar[digit]=true;

            n=n/10;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[10];
       
        int n=arr.length;

        for(int i=0;i<n;i++)
            if(isLucky(arr[i])){
                System.out.println("Enter the array numbers");
			    arr[i]=sc.nextInt();
                System.out.println(arr[i]+"is Lucky Number \n");
            }
            else
            System.out.println("Enter the array numbers");
			arr[i]=sc.nextInt();
            System.out.println(arr[i]+"is not a lucky Number \n");


    }
}