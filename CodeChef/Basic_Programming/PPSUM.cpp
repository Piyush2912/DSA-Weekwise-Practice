#include <iostream>
using namespace std;

int sum1(int n){
    return n*(n+1)/2;
}
int sum(int d,int n){
    int res = 0;
    for(int i=1;i<=d;i++){
        res = sum1(n);
        n = res;
    }
     return res;
}
int main() {
	// your code goes here
	int t,d,n;
	cin>>t;
	while(t-- > 0){
	    cin>>d>>n;
	    cout<<sum(d,n)<<"\n";
	}
	return 0;
}
