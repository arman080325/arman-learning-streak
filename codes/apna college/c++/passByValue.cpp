#include<iostream>

using namespace std;


void changeVal(int num)
{
    num=20;
    cout<<num<<"\n";
}

int main()
{
    int a=10;
    changeVal(a);
    cout<<a<<"\n";

}

//pass by value 
//parameter is a copy of actual argument variable in the memory