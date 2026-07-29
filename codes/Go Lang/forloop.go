package main

import "fmt"

func forloop() {
	//There is only for loop in Go, but it can be used in different ways.
	//while
	i:=1
	for i<=10{
		fmt.Println("Hi Arman")
		i=i+1
	}
	//Infinite loop
	//for {
	//	fmt.Println("Infinite loop")
	//}

	//Classic for loop
	for j:=1;j<=10;j++{
		fmt.Println("Hi Bro")
	}
	//break and continue
	for k:=1;k<=10;k++{
		if k==5{
			break
		}
		if k==3{
			continue
		}
		fmt.Println(k)
	}

	//new feature : Range
	for l:= range 10{
		fmt.Println(l)
	}

}