#include<iostream>

using namespace std;

int main()
{
    int n;
    cout<<"Enter the size of the array"<<endl;
    cin>>n;
    int marks[n];
    n=sizeof(marks)/sizeof(int);
    cout<<"Enter the elements of the array"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>marks[i];
    }
    for(int i=0;i<n;i++)
    {
        cout<<marks[i]<<" ";
    }
    cout<<endl;
}