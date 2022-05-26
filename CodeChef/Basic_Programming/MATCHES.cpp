#include <iostream>
using namespace std;
int calc(int digit){
    if(digit == 0 || digit ==  6 || digit ==  9){
        return 6;
    }else if(digit == 1){
        return 2;
    }else if(digit == 2 || digit == 3 || digit == 5){
        return 5;
    }else if (digit == 4){
        return 4;
    }else if(digit == 7){
        return 3;
    }else{
        return 7;
    }
}
int findMatches(int n){
    int sum = 0;
    while(n > 0){ // 357
        int digit = n % 10; // 7
        sum += calc(digit);
        n = n/10;
    }
    return sum;
}
int main() {
	// your code goes here
	// 0 - 6 match
	// 1 - 2 match
	/* 2 - 5 match
	   3 - 5 match
	   4 - 4 match
	   5 - 5 match
	   6 - 6 match
	   7 - 3 match
	   8 - 7 match
	   9 - 6 match
	   
	   123 + 234 = 357
	   sum = 0;
	   if digit = 3 -> calc(3) -> return 5;
	   if digit = 5 -> calc(5) -> return 5;
	   if difit = 7 -> calc(7) -> return 3;
	    sum += calc(digit);
	*/
	int t,a,b;
	cin>>t;
	while(t-- > 0){
	    cin>>a>>b;
	    cout<<findMatches(a+b)<<"\n";
	}
	
	return 0;
}
