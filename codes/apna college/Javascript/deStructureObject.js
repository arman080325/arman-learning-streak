const student={
    name:"John",
    age:20,
    marks:85,
    class:"10th",
    username:"john123",
    password:"john@123"
};

let{username,password}=student;
let{username:user,password:pass}=student;
console.log(username,password);
console.log(user,pass);