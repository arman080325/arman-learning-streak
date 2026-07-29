package main

import (
	"fmt"
	"time"
)

// import "time"

func switchcase(){
	// var i=10

	// switch i {
	// case 1:
	// 	fmt.Println("One")
	// case 2:
	// 	fmt.Println("Two")
	// case 10:
	//     fmt.Println("This is a ten")
	// default:
	// 	fmt.Println("Error")	
//No need of break statement after each case; Go handles it internally

    switch time.Now().Weekday(){
	case time.Sunday,time.Saturday:
		fmt.Println(time.Now().Weekday())
		fmt.Println("It is Weekend")
	default:
		fmt.Println(time.Now().Weekday())
		fmt.Println("It is a working day")	
	}

	//Powerful switch
	whoAmI:=func(i interface{}){
		switch i.(type){
		case int:
			fmt.Println("Intger type")
		case float32:
			fmt.Println("Float type")	
		case string:
			fmt.Println("String type")	
		case bool:
			fmt.Println("Boolean type")
		default:
			fmt.Println("Others")		
		}
	}

	whoAmI("Arman")
	whoAmI(45)
}