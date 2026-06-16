#include<iostream>
#include<cmath>

using namespace std;

int main(){
    int num;
    cout<<"Enter a number to check if it is prime: "<<endl;
    cin>>num;
    bool isPrime=true;

    if(num==2){
        cout<<num<<" is a prime number."<<endl;
    }
    else{
        for(int i=2;i<=sqrt(num);i++){ //the loop will run from 2 to sqrt(num) instead of n-1 , it is better optimized
            if(num%i==0){//i is a factor of num;i completely divides n
                isPrime=false;
                break;
            }
        }
        if(isPrime)//equal to isPrime==true
        {
            cout<<num<<" is a prime number"<<endl;
        }
        else{
             cout<<num<<" is a composite number"<<endl;
        }
    }
    return 0;
}