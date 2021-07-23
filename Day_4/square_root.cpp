/*
LeetCode Problem 
Problem Statement: Given a non-negative integer x, compute and return the square root of x.

                   Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

                   Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
            Input: x = 8
           Output: 2 
*/

#include<bits/stdc++.h>
using namespace std;

int squareRoot(int x){
    if(x==0)
        return 0;
    int start = 1, end = x,res;
    while(true){
        int mid = start + (end-start)/2;
        if(mid > x/mid){
            end = mid-1;
        }
        else{
            if(mid+1>x/(mid+1)){
                res = mid;
                break;
            }
            else
                start = mid+1;
        }
    }
    return res;
}

int main(){
    int x;
    cin>>x;

    cout<<squareRoot(x);
}