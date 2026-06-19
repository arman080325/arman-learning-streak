#include <iostream>

using namespace std;

int factorial(int n)
{
    int fact=1;
    for(int i=1;i<=n;i++)
    {
        fact=fact*i;
    }
    return fact;
}

int main()
{
    int num;
    cout<<"Enter a number to find the factorial"<<endl;
    cin>>num;
    int f=factorial(num);
    cout<<num<<"! ="<<f;
}