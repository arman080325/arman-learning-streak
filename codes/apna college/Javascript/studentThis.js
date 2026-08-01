const student={
    name:"Arman",
    eng:90,
    science:80,
    math:70,
    getAvg(){
        let avg=(this.eng+this.science+this.math)/3;
        console.log(this);
        console.log(avg);
        console.log(`${this.name}'s average marks is ${avg}`);
    }
}

student.getAvg();