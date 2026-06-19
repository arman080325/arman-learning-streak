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

int binomialCoeff(int n,int r)
{
    int binomial=factorial(n)/(factorial(r)*factorial(n-r));
    return binomial;

}

int main()
{
    int n,r;
    cout<<"Enter the n and r to for nCr"<<endl;
    cin>>n;
    cin>>r;
    int coeff=binomialCoeff(n,r);
    cout<<n<<"C"<<r<<" = "<<coeff;
}

// n=total choices
// r=number of choices we have to pick