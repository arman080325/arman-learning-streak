const calculator ={
    add:function(a,b){
        return a+b;
    },
    sub:function(a,b){
        return a-b;
    },
    mul:function(a,b){
        return a*b;
    },
    div:function(a,b){
        return a/b;
    }
};
// const calculator ={
//     add(a,b){
//         return a+b;
//     },
//     sub(a,b){
//         return a-b;
//     },
//     mul(a,b){
//         return a*b;
//     },
//     div(a,b){
//         return a/b;
//     }
// };
//This type is also accepted in Javascript

console.log(calculator);
console.log(calculator.add(2,9));
