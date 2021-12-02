#include<iostream>
#include<cstdlib>
using namespace std;

int n;
int *temp = (int*)malloc(n*sizeof(int));

void Merge(int a[],int low,int mid,int high){
    int flag=1;
    int i = low,j = mid+1;
    int k = low;
    while(i<=mid&&j<=high){
        if(a[i]<=a[j]){
            temp[k]=a[i];
            i++;
            k++;
        }
        else{
            temp[k]=a[j];
            j++;
            k++;
        }

    }
    if(i==mid+1&&flag==1){
        while(j<=high)
        {
            temp[k]=a[j];
            k++;
            j++;
        }
        flag=0;
    }
    if(j==high+1&&flag==1){
        while(i<=mid){
            temp[k]=a[i];
            k++;
            i++;
        }
        flag=0;
    }
    for(int r=low;r<=high;r++){
        a[r]=temp[r];
    }
}

void MergeSort(int a[],int low,int high){
    if(low<high){
        int mid = (low+high)/2;
        MergeSort(a,low,mid);
        MergeSort(a,mid+1,high);
        Merge(a,low,mid,high);
    }
}

int main(){
    cin>>n;
    int *a = (int*)malloc(n*sizeof(int));
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    MergeSort(a,0,n-1);
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