let arr=[28,35,67,89,90,12];

let min=arr.reduce((min,ele)=>{
    if(ele<min){
        return ele;
    }else{
        return min;
    }
});
console.log(min);