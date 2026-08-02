let arr=[1,2,3,4,5];

function print(el){
    console.log(el);
}

arr.forEach(print);

//or

arr.forEach(function(el){
    console.log(el);
});

arr.forEach((el) => {
    console.log(el);
});