#include <iostream>

using namespace std;

int main()
{
    int n;
    cout << "Enter a number: " << endl;
    cin >> n;
    int org=n;
    int rev=0;

    while (n > 0)
    {
        int lastDigit = n % 10;
        rev=(rev*10)+lastDigit;
        n = n / 10;
    }
    cout<<"Reverse of "<<org<<" is: "<<rev<<endl;
    return 0;
}