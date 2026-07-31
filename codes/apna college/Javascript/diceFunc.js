const prompt=require("prompt-sync")();

function dice()
{
    console.log("Generating a random number between 1 - 6\n");
    let choice=prompt("Roll the dice or quit\n");
    while(true)
    {
        if(choice!="quit")
        {
            let randNum=Math.floor(Math.random()*6)+1;
            console.log(randNum);
            break;
        }
        else{
            break;
        }
    }
}

dice();