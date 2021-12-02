#include<iostream>
#include<cstdlib>
#include<cstring>
using namespace std;

int duplicate[30000];

int BinarySearch(int a[],int key,int low,int high){
	int mid = (low+high)/2;
	if(low<=high){
	if(a[mid]==key){
		if(duplicate[mid]!=-1)
			return duplicate[mid];
		else
			return mid;
	}
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
	int flag=0;
	int firstindex;
	memset(duplicate,-1,n*sizeof(int));
	for(int i=0;i<n;i++){
		cin>>a[i];
		if(i>=1){
			if(a[i]==a[i-1]){
				flag++;
				if(flag==1){
					firstindex=i-1;
				}
				duplicate[i]=firstindex;				
			}
			else
			{
			  flag=0;
			  firstindex=-1;
		    }
		}
	}
	cin>>k;
	while(k--){
		cin>>b;
		int j = BinarySearch(a,b,0,n-1); 
		cout<<j<<endl;

	}
}


