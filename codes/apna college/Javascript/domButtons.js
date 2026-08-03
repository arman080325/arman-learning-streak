let btns=document.querySelectorAll('button');

for(let btn of btns){
    btn.onclick=sayHello;
    btn.onmouseenter=function(){
        console.log("Mouse Entered");
    }
}

btn.addEventListener('click',function(){
    console.log("Button Clicked");
});



function sayHello(){
    console.log("Hello");
}
