#include <iostream>
using namespace std;
int main() {
	int x=0,y=0;
	string str;
	cin>>str;
	for(int i=0;i<str.length();i++){
		if(str[i] =='Z'|| str[i] == 'z'){
			x++;
		}else{
			y++;
		}
	}
	if(x*2 == y){
		cout<<"Yes"<<"\n";
	}else{
		cout<<"No"<<"\n";
	}
	return 0;
}