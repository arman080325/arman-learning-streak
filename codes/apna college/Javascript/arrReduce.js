let nums=[1,2,3,4,5];

let finalVal=nums.reduce((res,ele)=>{
    console.log(res,ele);
    return res+ele;
});

console.log(finalVal);

//This is the basic structure of reduce function. It takes two parameters, first is the accumulator and second is the current element. The accumulator is the value that is returned from the previous iteration and the current element is the current value of the array that is being processed. The reduce function will return a single value which is the final result of the operation performed on all the elements of the array.