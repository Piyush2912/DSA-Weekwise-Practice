#include <iostream>
using namespace std;
char calc(int a, int b){
    int win;
    if (a < b){
            win = 1;
        }else{
            win =2;
        }
        return win;
}
int main() {
	// your code goes here
	int t,a,b,c,d,win;
	cin>>t;
	while(t-- > 0){
	    cin>>a>>b>>c>>d;
	    // nitin a coin
	    //sou b coin
        // ritik -> not winning wale ko c coin
        // some -> not winning wale ko d coin
        win=calc(a,b);
        if (win == 1){
            a += c;
        }else if (win == 2){
            b += c;
        }
        win = calc(a,b);
        if (win == 1){
            a += d;
        }else if (win == 2){
            b += d;
        }
        win = calc(a,b);
        if(win == 1){
            cout<<"S"<<"\n";
        }else{
        cout<<"N"<<"\n";
        }
	}
	return 0;
}
