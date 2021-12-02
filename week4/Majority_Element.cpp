#include<iostream>
#include<cstdlib>
#include<algorithm>
using namespace std;


int main(){
	int n; 
    cin>>n;
    int *a = (int*)malloc(n*sizeof(int));
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    sort(a,a+n);
    int times=1;
    int ans = 0;
    for(int i=0;i<n;i++){
        if(a[i+1]==a[i]){
            times++;
            if(times>n/2){
                ans = 1;
                break;
            }
        }
        else{
            times=1;
        }
    }
    cout<<ans<<endl;
}
