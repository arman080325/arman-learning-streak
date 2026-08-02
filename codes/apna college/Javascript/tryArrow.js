const student={
    name:"Arman",
    age:20,
    eng:90,
    science:80,
    math:70,
    getAvg:function(){
        console.log(this);
    },
    getInfo1:function(){
        setTimeout(()=>{
            console.log(this);
        },2000);
    },
    getInfo2:function(){
        setTimeout(function(){
            console.log(this);
        },2000);
    },
};

console.log(student.getAvg());
console.log(student.getInfo1());
console.log(student.getInfo2());