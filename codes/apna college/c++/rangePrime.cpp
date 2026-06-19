#include<iostream>
#include<cmath>

using namespace std;

bool isPrime(int n)
{
    bool isPrime=true;
    if(n==1)
    {
        return false;
    }
    else if(n==2)
    {
        return true;
    }
    else{
        for(int i=2;i<=sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}

void rangePrime(int r)
{
    for(int i=2;i<=r;i++)
    {
        if(isPrime(i)==true)
        {
            cout<<i<<" ";
        }
    }
    cout<<endl;
}

int main()
{
    int range;
    cout<<"Enter the range from 2 to __"<<endl;
    cin>>range;
    rangePrime(range);
}