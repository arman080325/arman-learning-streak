#include<iostream>

using namespace std;

int main(){
    int num;
    cout<<"Enter a number: ";
    cin>>num;
    if(num%2==0){
        cout<<"The number : "<<num<<" is even."<<endl;
    }
    else{
        cout<<"The number : "<<num<<" is odd."<<endl;
    }

    return 0;//return 0 means that the program ended successfully
}