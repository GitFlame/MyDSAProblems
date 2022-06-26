/*Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

Example 1:

Input: 
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.*/

import java.util.*;
class valueIndex {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        
           ArrayList<Integer> ans = new ArrayList<>();
       int idx = 1;
       for(int i = 0 ; i < n ; i++)
       {
           if(idx == arr[i])
           {
               ans.add(arr[i]);
           }
           
           idx++;
       }
       
       return ans;
   } 
}