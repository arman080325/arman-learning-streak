// const prompt = require("prompt-sync")();

// let max = parseInt(prompt("Enter the maximum number\n"));
// console.log(`You chose Maximum Number${max}`);

// let guessNum = Math.floor(Math.random()* max) + 1;
// console.log("Random number generated");

// let current = prompt("Enter a number or quit the game\n");

// while (true) {
//   if (current != "quit") {
//     if (current > guessNum) console.log("Enter a smaller number\n");
//     else if (current < guessNum) console.log("Enter a larger number\n");
//     else if(current==guessNum){
//       console.log("Congrats You guessed the right number = ", current);
//       break;
//     }
//   } else {
//     console.log("Thank you for playing\n");
//     break;
//   }
// }
const prompt = require("prompt-sync")();

let max = Number(prompt("Enter the maximum number: "));
console.log(`You chose Maximum Number: ${max}`);

let guessNum = Math.floor(Math.random() * max) + 1;
console.log("Random number generated");

let current = prompt("Enter a number or type 'quit' to exit: ");

while (true) {

    if (current === "quit") {
        console.log("Thank you for playing!");
        break;
    }

    current = Number(current);

    if (current > guessNum) {
        console.log("Enter a smaller number.");
    } else if (current < guessNum) {
        console.log("Enter a larger number.");
    } else {
        console.log(`Congrats! You guessed the right number = ${current}`);
        break;
    }

    current = prompt("Enter another number or type 'quit': ");
}