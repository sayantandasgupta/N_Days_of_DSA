/*
Problem Statement: Given a sorted and rotated array, find the number of times the array has been rotated
        Input : 11 12 15 18 2 5 6 8
       Output : 4

*/

#include<bits/stdc++.h>
using namespace std;

int countRotations(vector<int> &arr, int low, int high){
    int mid;
    
    if(high<low)
        return 0;
    if(high==low)
        return low;
    mid = low + (high-low)/2;
    
    if(mid < high && arr[mid+1]<arr[mid])
        return mid+1;
    if(mid>low && arr[mid] < arr[mid-1])
        return mid;
    if(arr[high]>arr[mid])
        return countRotations(arr, low, mid-1);
    return countRotations(arr, mid+1, high);
}

int main(){
    vector<int> arr;
    int n,x;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>x;
        arr.push_back(x);
    }
    cout<<countRotations(arr,0,n-1);
    return 0;
}