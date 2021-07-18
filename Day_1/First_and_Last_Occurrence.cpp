/*

Problem Statement: Given a sorted array arr containing n number of elements,
                   write a function which finds and returns the first and last occurrence of a value val
        Input : n = 9, val = 5
                arr = [1, 3, 5, 5, 5, 5, 67, 123, 125]

        Output: 2 5

Algorithm Used: Binary Search
Time Complexity: O(log n)
*/

#include<bits/stdc++.h>
using namespace std;

vector<int> firstAndLastOccurrence(vector<int> &arr, int n, int val){
    int l = 0, r = n-1, mid;
    int first= -1, last = -1;
    vector<int> res;
    while(l<=r){
        mid = l + (r-l)/2;
        if(arr[mid]==val){
            first = mid;
            r = mid-1;
        }
        else if(arr[mid] > val)
            r = mid-1;
        else
            l = mid+1;
    }

    l = 0, r = n-1;
    while(l<=r){
        mid = l + (r-l)/2;
        if(arr[mid]==val){
            last = mid;
            l = mid+1;
        }
        else if(arr[mid] > val)
            r = mid-1;
        else
            l = mid+1;
    }

    res.push_back(first);
    res.push_back(last);
    return res;
}

int main(){
    vector<int> arr;
    int n, val,x;

    cin>>n>>val;

    for(int i=0;i<n;i++){
        cin>>x;
        arr.push_back(x);
    }

    vector<int> res = firstAndLastOccurrence(arr, n, val);

    for(int i=0;i<2;i++)
        cout<<res[i]<<" ";
} 