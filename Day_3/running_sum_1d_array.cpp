/*
Problem Statement: Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

                   Return the running sum of nums.
            Input: nums = [1,2,3,4]
           Output: [1,3,6,10] 
*/

#include<bits/stdc++.h>
using namespace std;

vector<int> runningSum1D(vector<int> &nums){
    int sum = nums[0];        //Initialise sum to first element of nums
    for(int i =1;i<nums.size();i++){
        sum += nums[i];          // Add current element to sum
        nums[i] = sum;          // Update current element to be equal to sum
    }

    return nums;

}

int main(){
    int n,x;
    vector<int> arr;

    cin>>n;
    for(int i=0;i<n;i++){
        cin>>x;
        arr.push_back(x);
    }

    vector<int> res = runningSum1D(arr);

    for(int i=0;i<n;i++)
        cout<<res[i]<<" ";
}