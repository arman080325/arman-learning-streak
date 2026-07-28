package main

import "fmt"

const age int = 90

func constants() {
	const name = "Go Lang"
	// name="Python"
	//it will give error because we can't change the value of constant
	fmt.Println(name)
	fmt.Println(age)

	const( //multiple constant declaration(grouping)
		port=5000
		host="localhost"
	)
	fmt.Println(port)
	fmt.Println(host)
}
