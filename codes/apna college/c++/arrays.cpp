#include<iostream>

using namespace std;

int main()
{
    int marks[50];//By default the garbage values are stored
    int marks2[50]={1,2,3,4,5};//By default the 0 values are stored in unallocated space
    int marks3[]={1,2,3,4,5};

    cout<<sizeof(marks3)/sizeof(int);
}