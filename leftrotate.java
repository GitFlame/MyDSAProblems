import java.util.*;
class LeftRotate{
    static void leftrotate(int arr[],int d)
    {
        if(d==0)
        return;
        int n=arr.length;
        d=d%n;
        reverseArrays(arr,0,d-1);
        reverseArrays(arr,d,n-1);
        reverseArrays(arr,0,n-1);

    }
    static void reverseArrays(int arr[],int start,int end)
    {
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }
    static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
           System.out.print(arr[i]+" ");
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int d=2;
        leftrotate(arr,d);
        printArray(arr);
    }
}