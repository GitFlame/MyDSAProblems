/*Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.

Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.*/
class BinarySearch {
    int binarysearch(int arr[], int n, int k) {
            int f1=0;
        int l1=n-1;
        while(f1<=l1)
        {
            int mid=(f1+l1)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                f1=mid+1;
        }
        else{
            l1=mid-1;
        }
        
    }
    return -1;
}
}