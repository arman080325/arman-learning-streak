let nums=[1,2,3,4,5];

let isEven=nums.every((el)=>{
    return el%2==0;
});

console.log(isEven);

let notEven=nums.some((el)=>{
    return el%2==0;
});

console.log(notEven);