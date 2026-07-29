package main

import "fmt"

func ifelse() {
	age := 18

	if age >= 18 {
		fmt.Println("Welcome to Adulthood")
	} else{
		fmt.Println("Not an Adult")
	}

	role:="admin"
	hasPermissions:=true

	if role=="admin" && hasPermissions{
		fmt.Println("He is an admin")
	}
//we can declare a variable in the if block itself
	if color:="fair";color=="fair"{
		fmt.Println("He is a handsome boy",color)
	}

	//we dont have ternary operator in Go lang till now 
}