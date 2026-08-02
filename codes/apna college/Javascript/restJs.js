//Opposite of spread operator is rest operator. It is used to collect the remaining elements of an array or object into a new array or object. It is represented by three dots (...). It can be used in function parameters to collect all the remaining arguments into an array. It can also be used in destructuring assignment to collect the remaining properties of an object into a new object.

function sum(...args){
    console.log(arguments);//arguments is an array like object(collections) which contains all the arguments passed to the function. It is not an array but it can be converted to an array using Array.from() method. It does not have array methods like forEach, map, filter etc. It has length property which returns the number of arguments passed to the function. It can be used in non-arrow functions only. It is not available in arrow functions.
    return args.reduce((acc,ele)=>{
        return acc+ele;
    });
};

console.log(sum(1,2,3,4,5));
console.log(sum(10,20,30));
console.log(sum(100,200));