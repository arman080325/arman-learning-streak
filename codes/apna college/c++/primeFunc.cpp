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
    // else{
    //     for(int i=2;i*i<=n;i++)//same as i to sqrt(n) --> i^2 to n
    //     {
    //         if(n%i==0)
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

}

int main()
{
    int num;
    cout<<"Enter the number to check for number"<<endl;
    cin>>num;
    if(isPrime(num)==true)
    {
        cout<<num<<" is a prime number";
    }
    else{
        cout<<num<<" is not a prime number";
    }
}