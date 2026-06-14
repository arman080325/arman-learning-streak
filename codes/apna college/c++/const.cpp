#include<iostream>
#define age 90
#define ll long long

using namespace std;

int main(){
    const int armanAge=22;
    // But we cannot do like this
    // const int anuAge;
    // anuAge=22; // this will give error because we have to initialize a constant variable at the time of declaration
    cout<<"Arman age is :"<<armanAge;
    // armanAge=23; // this will give error because we cannot change the value of a constant variable
    ll a=1000000000000;
    cout<<"\nValue of a is :"<<a;
    //Difference between #define and const
    // #define is a preprocessor directive and it is used to define a constant value or a macro. It is replaced by the preprocessor before the compilation of the code. It does not have a type and it does not take up any memory. It is just a text replacement.
    // const is a keyword and it is used to define a constant variable. It has a type and it takes up memory. It is a part of the C++ language and it is checked by the compiler. It can be used to define constant variables of any type, including user-defined types.
    return 0;
}