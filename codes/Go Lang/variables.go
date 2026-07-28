package main

import "fmt"

func variables() {
	fmt.Println("Welcome to Variables in Go Lang");
	var name string="Arman Khan"
	var secondName="Arif khan"  //it can infer the type of variable

	//Shorthand declaration
	thirdname:="Alim Khan"

	var fourthName string

	fourthName="Asik Khan"


	fmt.Println(name)
	fmt.Println(secondName)
	fmt.Println(thirdname)
	fmt.Println(fourthName)
}