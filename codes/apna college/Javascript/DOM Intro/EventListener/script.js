let btn=document.querySelector('button');

let pink=document.querySelector('.pink-box');

pink.addEventListener('mouseenter',function(){
    console.log("Mouse Entered");
});

btn.addEventListener('click',function(){
    let h3=document.querySelector('h3');
    let randomColor=generateRandomColor();
    h3.innerText=randomColor;
    h3.style.color=randomColor;
    btn.style.backgroundColor=randomColor;
    console.log("Color Changed");

    let div=document.querySelector('div');
    div.style.backgroundColor=randomColor;
});  

function generateRandomColor(){
    let red=Math.floor(Math.random()*255);
    let green=Math.floor(Math.random()*255);
    let blue=Math.floor(Math.random()*255);

    let color=`rgb(${red},${green},${blue})`;
    return color;

    let form=document.querySelector("form");
    form.addEventListener("submit",function(event){
        event.preventDefault();
        console.log("Form was submitted");
    });

    let input =document.querySelector("input");
    console.dir(input);
    console.log(input.value);

}
