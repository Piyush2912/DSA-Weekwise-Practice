#include <iostream>
#include<math.h>
using namespace std;

int main() {
	// your code goes here
	// x = unit of supply of food
	// y = unit of water supply
	// xr = unit of supply of food
	// yr = unit of water per day
	// D = days to build the boat
	/*  
	x y xr yr d
	4 2 1  1  1 
	
	4/1 2/1 1
	x/xr y/yr d
	min(x/xr,y/yr) <=d == YES
	ELSE                    NO
	
	*/
	
	int t,x,xr,y,yr,d;
	cin>>t;
	while(t-- > 0){
	   cin>>x>>y>>xr>>yr>>d;
	   if(min((float)(x/xr) , (float)(y/yr)) >= d){
	       cout<<"YES"<<"\n";
	   }else{
	       cout<<"NO"<<"\n";
	   }
	}
	return 0;
}
