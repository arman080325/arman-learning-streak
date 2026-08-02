function sum(a,b=3){
    return a+b;
};
function mul(a=4,b){
    return a*b;
};

console.log(sum(2,5));
console.log(sum(2));
console.log(mul(2,5));
console.log(mul(2));