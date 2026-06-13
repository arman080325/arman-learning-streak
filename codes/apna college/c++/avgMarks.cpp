#include<iostream>

using namespace std;

int main(){
    int english, math, science;
    float avg;
    cout<<"Enter marks of English, Math and Science: ";
    cin>>english>>math>>science;
    avg=(english+math+science)/3.0;
    cout<<"Your average marks is : "<<avg<<endl;
}

