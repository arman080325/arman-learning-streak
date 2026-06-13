#include<iostream>
#include<iomanip>

using namespace std;

int main(){
    int a=10;
    float b=10.9;
    double c=10.9999;
    char d='A';
    bool e=true;
    cout<<"Integer: "<<a<<endl;
    cout<<"Float: "<<b<<endl;
    cout<<"Double: "<<c<<endl;
    cout<<"Character: "<<d<<endl;
    cout<<"Boolean: "<<e<<endl;

    float PI=3.14292827;
    double PI2=3.14292827;
    cout<<setprecision(12)<<"Value of PI using float: "<<PI<<endl;
    cout<<setprecision(12)<<"Value of PI using double: "<<PI2<<endl;
}