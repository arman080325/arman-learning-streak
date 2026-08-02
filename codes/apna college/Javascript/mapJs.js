let num=[1,2,3,4,5];

let double=num.map((el)=>{
    return el*2;
});

console.log(double);

const students=[
    {
        name:"John",
        age:20,
        marks:85
    },
    {
        name:"Jane",
        age:22,
        marks:80

    },
    {
        name:"Jim",
        age:21,
        marks:90
    }
];

let gpa=students.map((student)=>{
    return student.marks/10;
});

console.log(gpa);