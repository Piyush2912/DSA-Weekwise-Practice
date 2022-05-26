#include <iostream>
using namespace std;

int main() {
	// your code goes here
	
	int t,n,a,b;
	cin>>t;
	while(t-- > 0){
	    cin>>n>>a>>b;
	    int ar[n];
	    for(int i=0;i<n;i++){
	        cin>>ar[i];
	    }
	    // count of getting a and b
	    int c_a=0,c_b=0;
	    for(int i=0;i<n;i++){
	        if(ar[i] == a){
	            c_a++;
	        }
	        if(ar[i] == b){
	            c_b++;
	        }
	    }
	    float p_a = (float)c_a/n;
	    float p_b = (float)c_b/n;
	    float ans = (float)(p_a * p_b);
	    printf("%.10f",ans);
	    cout<<endl;
	    
	}
	return 0;
}
