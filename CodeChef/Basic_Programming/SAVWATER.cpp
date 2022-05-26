#include <iostream>
#include<math.h>
using namespace std;

int main() {
	// your code goes here
    /*
    y = liters of water every week per household
    reduce to floor(y/2)
    x = liters of water consumed per week household
    C = liters of total water available
    H = No of house holds for week
    
    3 1 1 3
    H x y C
    
    1 + floor(1/2) = 1 + 0 = 1
    3 * 1 = 3
    
    1 1 1 2 
    H x y C
    
    1 + 1/2 = 1 + 0 = 1
    
    2 1 1 1
    1 + floor(1/2) = 1
    2 * 1 = 2
    
    x + floor(y/2) = something
    H * something <= C
    
    */
    int t,H,x,y,C,res;
    cin>>t;
    while(t-- > 0){
        cin>>H>>x>>y>>C;
        res = x + floor(y/2);
        if(H*res <= C){
            cout<<"YES"<<"\n";
        }else{
            cout<<"NO"<<"\n";
        }
    }
	return 0;
}
