#include<iostream>
#include<cmath>

using namespace std;

void decimalBinary(int dec)
{
    int power=0;
    int bin=0;
    int org=dec;
    while(dec>0)
    {
        int rem=dec%2;
        bin=bin+(rem*(int)pow(10,power));
        dec=dec/2;
        power++;
    }
    cout<<org<<"-->"<<bin<<endl;

}

int main()
{
    int dec;
    cout<<"Enter the decimal number to convert to binary"<<endl;
    cin>>dec;
    decimalBinary(dec);
    return 0;
}