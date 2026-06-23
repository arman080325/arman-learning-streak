#include<iostream>

using namespace std;


void changeVal(int &refvar)
{
    refvar=20;
    cout<<refvar<<"\n";
}

int main()
{
    int a=10;
    changeVal(a);
    cout<<a<<"\n";
}