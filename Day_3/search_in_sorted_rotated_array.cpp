/*
Problem Statement: Given a sorted and rotated array nums, find the index of a value val in the array

            Input: nums = [11, 12, 15, 18, 2, 5, 6, 8]
                    val = 15
           Output: 2 
*/

#include<bits/stdc++.h>
using namespace std;

int findPeak(vector<int> &nums, int low, int high){
	int mid;
	if(high<low)
		return -1;
	if(high==low)
		return low;
	mid = low + (high-low)/2;

	if(mid<high && nums[mid]>nums[mid+1])
		return mid;
	if(low<mid && nums[mid-1]>nums[mid])
		return mid-1;
	if(nums[low]>=nums[mid])
		return findPeak(nums,low,mid-1);
	return findPeak(nums,mid+1,high);
}

int binarySearch(vector<int> &nums, int start, int end,int val){
	int mid;
	if(end<start)
		return -1;
	mid = start + (end-start)/2;
	if(nums[mid]==val)
		return mid;
	else if(nums[mid]>val)
		return binarySearch(nums,start,mid-1,val);
	else
		return binarySearch(nums,mid+1,end,val);
}

int searchSortedRotated(vector<int> &nums, int n, int val){
    int peak = findPeak(nums, 0, n-1);
    if(peak==-1){
	    return binarySearch(nums,0,n-1,val);
    }
    if(nums[peak]==val)
	    return peak;
    if(nums[0]<=val)
	    return binarySearch(nums, 0, peak-1,val);
    return binarySearch(nums,peak,n-1,val);

}


int main(){
	int n,x,val;
	vector<int> arr;

	cin>>n;
	for(int i=0;i<n;i++){
		cin>>x;
		arr.push_back(x);
	}
	cin>>val;

	int res = searchSortedRotated(arr,n,val);
	cout<<res;
}
