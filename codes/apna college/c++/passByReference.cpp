#include<iostream>

using namespace std;


void changeVal(int *ptr)
{
    *ptr=20;
    cout<<*ptr<<"\n";
}

int main()
{
    int a=10;
    changeVal(&a);
    cout<<a<<"\n";

//Using Reference variables , both are pointing to the same memory location despite having different names
    int &b=a;
    b=50;
    cout<<a<<"\n";
    cout<<b<<"\n";
    


}

//pass by value 
//parameter is a copy of actual argument variable in the memory