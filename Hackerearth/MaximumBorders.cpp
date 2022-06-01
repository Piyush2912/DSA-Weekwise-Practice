#include <iostream>
#include<bits/stdc++.h>
using namespace std;
int main() {
		// Writing output to STDOUT
	// n rows
	// m columns
	// max border of shapes? = max no if consecutive black cells in any row or column without any white cell in b/w
	// '#' represents a black cell 
	// '.' represents a white cell. 
	int t,n,m;
	cin>>t;
	while(t-- > 0){
		cin>>n>>m;
		string ar[n];
		for(int j=0;j<n;j++){
			cin>>ar[j];
		}
		
		int max = 0;
		for(int j=0;j<n;j++){

		int count = 0;
		for(int i=0;i<m-1;i++){
			if(ar[j][i]=='#' && ar[j][i+1]=='#'){
				count++;
			}
			}
			if (max < count+1){
				max = count+1;
			}
		}
		cout<<max<<"\n";
	}
	return 0;
}