/*
Problem Statement: Given a sorted and rotated array nums, find the index of a value val in the array

            Input: nums = [11, 12, 15, 18, 2, 5, 6, 8]
                    val = 15
           Output: 2 
*/

#include<bits/stdc++.h>
using namespace std;

int searchSortedRotated(vector<int> &nums, int n, int val){
    int low = 0, high = n-1,mid, res = -1;

	while(low<=high){
		mid = low + (high-low)/2;
		if(nums[mid]==val)
			res = mid;
		if(nums[mid]>nums[high]){
			if(val<nums[mid] && val>=nums[low])
				high = mid-1;
			else
				low = mid+1;
		}
		else if(nums[low]>nums[mid]){
			if(val>nums[mid] && val<=nums[high])
				low = mid+1;
			else
				high = mid-1;
		}
		else{
			if(nums[mid]>val)
				high = mid-1;
			else
				low = mid+1;
		}
	}
	return res;
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
