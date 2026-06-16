#include<iostream>

using namespace std;

int main(){
    int n;
    cout<<"Enter a number: "<<endl;
    cin>>n;
    int org=n;
    int sum=0;
    while(n>0){
        int lastDigit=n%10;
        sum+=lastDigit;
        n=n/10;
    }
    cout<<"Sum of digits of "<<org<<" is: "<<sum<<endl;
    return 0;
}