const prompt=require("prompt-sync")();

let num=prompt("Enter the number for multiplication table\n");



for(let i=1;i<=10;i++)
{
    console.log(`${num} * ${i} = ${num*i}`);
}