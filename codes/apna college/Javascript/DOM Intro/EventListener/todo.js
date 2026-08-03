let btn=document.querySelector("button");
let ul=document.querySelector("ul");
let inp=document.querySelector("input");

btn.addEventListener("click",function(){
    let item=document.querySelector("li");
    item.innerText=inp.value;
    ul.appendChild(item);

    let delBtn=document.createElement("button");
    delBtn.innerText="Delete";
    delBtn.classList.add("Delete");

    item.appendChild(delBtn); 
    //console.log("input.value");
    //reset to empty string
    inp.value="";
});

let delBtns=document.querySelectorAll("delete");
for(delBtn of delBtns)
{
    delBtn.addEventListener('click',function(){
        let par=this.parentElement;
        console.log(par);
        par.remove();
        console.log("Element deleted successfully");
    });
};

//This delete button wont work for new elements that will be added
//So for that we will use Event Delegation by using Event Bubbling in the parent elements

ul.addEventListener("click",function(event){
    console.log("Clicked");
    console.log(event.target);
    console.log(event.target.nodeName);
    if(event.target.nodeName=="BUTTON"){
        let listItem=event.target.parentElement;
        listItem.remove();
        console.log(listItem);
        console.log("deleted"
        );
    }
})
