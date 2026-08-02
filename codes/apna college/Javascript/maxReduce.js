let arr=[109,23,45,67,89];

let max=arr.reduce((max,ele)=>{
    if(ele>max){
        return ele;
    }else{
        return max;
    }
});

console.log(max);

//Here we are using reduce function to find the maximum value in the array. The reduce function takes two parameters, first is the accumulator and second is the current element. The accumulator is the value that is returned from the previous iteration and the current element is the current value of the array that is being processed. The reduce function will return a single value which is the final result of the operation performed on all the elements of the array. In this case, we are comparing each element with the current maximum value and returning the maximum value at each iteration. Finally, we get the maximum value in the array.