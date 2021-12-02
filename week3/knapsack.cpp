#include<iostream>
#include<algorithm>
#define max 1000
using namespace std;

struct loot{
	double weight;
	double value;
	double unit_price;
}stuff[max];

bool cmp(loot a,loot b){
	return a.unit_price>b.unit_price;
}

double get_optimal_value(struct loot* a,int n,int W){
	double value = 0.0;
	double temp;
	for(int i=0;i<n;i++){
		if(W==0)
			return value;
		temp=min((double)W,a[i].weight);
		value+=temp*a[i].unit_price;
		a[i].weight-=temp;
		W-=temp;
	}
	return value;
}

int main(){
	int n,W;
	cin>>n>>W;
	for(int i=0;i<n;i++){
		cin>>stuff[i].value>>stuff[i].weight;
		stuff[i].unit_price=stuff[i].value/stuff[i].weight;
	}
	sort(stuff,stuff+n,cmp);
	double optimal_value = get_optimal_value(stuff,n,W);
    cout.precision(10);
    cout << optimal_value << endl;
    return 0;
}