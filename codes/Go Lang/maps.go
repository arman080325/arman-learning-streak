package main

import (
	"fmt"
	"maps"
)

func mapss(){
	//creating a map
	m:=make(map[string]string)
	//(Key,Value) pair

	//setting elements in map
	m["name"]="Arman"
	m["address"]="Kolkata"
	fmt.Println(m["name"],m["address"])
	//If key does not exist, it will return the zero value of the value type. In this case, it will return an empty string.
	fmt.Println(m["phone"]) // Output: ""

	m2:=make(map[string]int)
	m2["phone"]=123456
	fmt.Println(m2["phone"]) // Output: 123456
	

	//Length of map
	fmt.Println(len(m)) // Output: 2

	// Deleting an element from map
	delete(m,"address")
	fmt.Println(m) // Output: map[name:Arman]
	//clearing a map
	clear(m)
	fmt.Println(m) // Output: map[]

	//Without using make() function
	m3:=map[string]string{
		"name":"Arman",
		"address":"Kolkata",
	}
	fmt.Println(m3) // Output: map[address:Kolkata name:Arman]

	//Checking if a key exists in a map
	v,ok:=m3["address"]
	if ok{
		fmt.Println("Key exists with value:",v)
	}else{
		fmt.Println("Key does not exist")
	}

	//Comparing two maps
	fmt.Println(maps.Equal(m,m3)) // Output: false
}
