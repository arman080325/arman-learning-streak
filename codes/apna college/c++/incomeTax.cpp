#include<iostream>

using namespace std;

int main(){
    int income,totIncome;
    int tax;
    cout<<"Enter your income: ";
    cin>>income;
    if(income < 500000){
        tax=0;
        totIncome=income-tax;
        cout<<"Your tax is : "<<tax<<endl;
        cout<<"Your total income is : "<<totIncome<<endl;
    }
    if(income >= 500000 && income < 1000000){
        tax=income*0.2;
        totIncome=income-tax;
        cout<<"Your tax is : "<<tax<<endl;
        cout<<"Your total income is : "<<totIncome<<endl;
    }
    else if(income >= 1000000){
        tax=income*0.3;
        totIncome=income-tax;
        cout<<"Your tax is : "<<tax<<endl;
        cout<<"Your total income is : "<<totIncome<<endl;
    }
    else{tax=income*0.3;
        totIncome=income-tax;
        cout<<"Your tax is : "<<tax<<endl;
        cout<<"Your total income is : "<<totIncome<<endl;
    }

}