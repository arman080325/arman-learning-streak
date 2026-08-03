let div = document.querySelector("div");
let ul = document.querySelector("ul");
let list = document.querySelector("li");

div.addEventListener("click", function () {
  console.log("Div was clicked");
});

for (li of list) {
  list.addEventListener("click", function () {
    event.stopPropagation();
    console.log("List was clicked");
  });
}

ul.addEventListener("click", function (event) {
  event.stopPropagation();
  console.log("ul was clicked");
});
//Event Bubbling means when we have nested elements and every element has different event listeners then if the innermost element's event listener has been triggered then automatically the parent's or outer elements event listeners are also triggered leading to undesirable changes in the code.
//To prevent it ,we have a method in the event object  stopPropagation()
