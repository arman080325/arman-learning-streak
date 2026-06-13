// Question2:Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandaneraser.Youhavetooutputthetotalcostoftheitemsbacktotheuserastheirbill.(Addon:Youcanalsotryadding18%GSTtaxtotheitemsinthebillasanadvancedproblem)

#include<iostream>

using namespace std;

int main(){
    float penCost,pencilCost,eraserCost;
    cin>>penCost;
    cin>>pencilCost;
    cin>>eraserCost;
    float totCost=penCost+pencilCost+eraserCost;
    cout<<"total="<<totCost<<endl;
    cout<<"totalwithGST="<<(totCost+(0.18*totCost))<<endl;
    return 0;
}