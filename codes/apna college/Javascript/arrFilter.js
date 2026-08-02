let nums=[24,35,67,89,90,12];

let even=nums.filter((el)=>{
    return el%2==0;
});
let odd=nums.filter((el)=>{
    return el%2!=0;
});

console.log(even);
console.log(odd);