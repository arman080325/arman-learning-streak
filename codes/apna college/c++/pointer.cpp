#include<iostream>

using namespace std;

int main()
{
    int a=10;
    float b=10.0;
    cout<<&a<<endl;
    int *ptr=&a;
    cout<<"Address of a is : "<<ptr<<endl;
    float *ptr2=&b;
    cout<<"Address of b is : "<<ptr2<<endl;
    cout<<sizeof(ptr)<<endl;
    cout<<sizeof(ptr2)<<endl;

    int **pptr=&ptr;
    cout<<pptr<<" = "<<&ptr<<endl;
    cout<<*(&a)<<endl;
    cout<<*(ptr)<<endl;

    *(ptr)=50;
    cout<<a<<"\n";
    *(&a)=80;
    cout<<a<<"\n";




    int *ptr3=NULL;
    cout<<ptr3<<endl;
    cout<<*(ptr3)<<endl;
}