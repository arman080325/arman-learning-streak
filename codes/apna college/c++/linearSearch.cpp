#include<iostream>

using namespace std;

void linearSearch(int arr[],int n)
{
    int key;
    cout<<"Enter the element to find"<<endl;
    cin>>key;
    for(int i=0;i<n;i++)
    {
        if(arr[i]==key)
        {
            cout<<"Element found at Index["<<i<<"]";
        }
        else{
            cout<<"Element not found";
            break;
        }
    }
}


int main()
{
    int n;
    cout<<"Enter the size of the array"<<endl;
    cin>>n;
    int arr[n];
    cout<<"Enter the elements of the array"<<endl;
    n=sizeof(arr)/sizeof(int);
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    linearSearch(arr,n);
    
}