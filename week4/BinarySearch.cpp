#include<iostream>
#include<cstdlib>
using namespace std;

int BinarySearch(int a[],int key,int low,int high){
	int mid = (low+high)/2;
	if(low<=high){
	if(a[mid]==key)
		return mid;
	if(a[mid]<key)
		return BinarySearch(a,key,mid+1,high);
	if(a[mid]>key)
		return BinarySearch(a,key,low,mid-1);
	}
	return -1;
}

int main(){
	int n,k;
	int b;
	cin>>n;
	int *a = (int*)malloc(n*sizeof(int));
	for(int i=0;i<n;i++){
		cin>>a[i];
	}
	cin>>k;
	while(k--){
		cin>>b;
		int j = BinarySearch(a,b,0,n-1); 
		cout<<j<<endl;

	}
}


