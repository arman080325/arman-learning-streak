#include<iostream>
#include<cmath>

using namespace std;

void binaryDecimal(int bin)
{
    int power=0;
    int decimal=0;
    int org=bin;
    while(bin>0)
    {
        int lastDigit=bin%10;
        decimal=decimal+(lastDigit*(int)pow(2,power));
        bin=bin/10;
        power++;
    }
    cout<<org<<"-->"<<decimal<<endl;

}

int main()
{
    int bin;
    cout<<"Enter the binary number to convert to decimal"<<endl;
    cin>>bin;
    binaryDecimal(bin);
    return 0;
}