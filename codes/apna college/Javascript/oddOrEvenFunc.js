// let odd=function(n){
//     console.log(!(n%2==0));
// }
// let even=function(n){
//     console.log(n%2==0);
// }
const prompt=require("prompt-sync")();


function oddOrEvenFactory(request){
    if(request=="odd"){
        return function(n){
            console.log(!(n%2==0));
        }
    }
    else if(request=="even"){
        return function(n){
            console.log(n%2==0);
        }
    }
    else{
        console.log("Invalid Request");
    }
}

let request="odd";

let func=oddOrEvenFactory(request);

func(3);