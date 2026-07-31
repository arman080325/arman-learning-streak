const prompt=require("prompt-sync")();

let num=prompt("Enter the number to print the multiplication table\n");
multTable(num);


function multTable(num)
{
    for(let i=1;i<=10;i++)
    {
        console.log(`${num} * ${i} = ${num*i}`);
    }
}