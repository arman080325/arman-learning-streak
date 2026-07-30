package main

import "fmt"

func arrays(){
	var intArr[10]int
	var boolArr[4]bool
	var stringArr[4]string

	intArr[0]=1
	intArr[1]=2
	fmt.Println(intArr)
	fmt.Println(len(intArr))


	boolArr[0]=true
	boolArr[1]=true
	fmt.Println(boolArr)
	fmt.Println(len(boolArr))


	stringArr[0]="Arman"
	stringArr[1]="Anu"
	fmt.Println(stringArr)
	fmt.Println(len(stringArr))

	nums := [4]int{1,2,3,4}
	fmt.Println(nums)

	nums2d := [2][2]int{{1,2},{3,4}}
	fmt.Println(nums2d)

	//fixed size,that is predictable
	// -Memory optimization
	// Constant time access
}