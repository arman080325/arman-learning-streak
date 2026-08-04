package main

import (
	"fmt"
)

//For iterating over data structure, Range is used

func rangee() {
	maps := []int{6, 7, 8}
	//  for i:=0;i<len(maps);i++{
	// 	fmt.Println(maps[i])
	//  }

	for i, num := range maps {
		fmt.Println(num, i)
	}

	m := map[string]string{
		"name":    "Arman",
		"class":   "Btech",
		"Address": "India",
	}

	for k, v := range m {
		fmt.Println(k, v)
	}

	for i, c := range "Armankhan" {
		fmt.Println(i, c)
	}

	for i, c := range "Armankhan" {
		fmt.Println(i, string(c))
	}

	//Unicode point Rune
	//Starting byte of Rune

}
