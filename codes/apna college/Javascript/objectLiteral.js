let student = {
  name: "Arman",
  age: 22,
  addr: "Jajpur",
  isMarried: false,
};

console.log(student);
console.log(student.name);
console.log(student["name"]);

student.name = "Aman";
student.gender = "Male";
console.log(student);

delete student.gender;

console.log(student);

const classInfo = {
  arman: {
    class: 5,
    grade: "O",
  },
  sushma: {
    class: 6,
    grade: "A",
  },
  shipra: {
    class: 10,
    grade: "S",
  },
};
console.log(classInfo);
console.log(classInfo.arman.grade);
console.log(classInfo["arman"]["class"]);

const details = [
  {
    name: "X",
    age: 9,
    city: "BBSR",
  },
  {
    name: "XII",
    age: 19,
    city: "BBSR",
  },
  {
    name: "XI",
    age: 13,
    city: "CTC",
  },
];

console.log(details);
console.log(details[0]);
console.log(details[0]["name"]);

