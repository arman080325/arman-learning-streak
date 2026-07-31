package main

import "fmt"
import "slices"

func slicess() {
	//Dynamic Array
	var slice []int
	//uninitialized slices are nil
	fmt.Println(slice)
	fmt.Println(slice==nil)
	fmt.Println(len(slice))
	
	var slice2=make([]int,2,5)
	//var slice2=make([]int,0,5)
	//initial size = 2 is passed as parameter and initial capacity =5
	slice2[0]=9
	slice2[1]=6
	fmt.Println(slice2)
	fmt.Println(cap(slice2))
	//capacity of the slice which is not fixed
	//fmt.Println(slice2==nil)
	//add elements through append function
	slice2=append(slice2,3)
	slice2=append(slice2,4)
	slice2=append(slice2,5)
	slice2=append(slice2,6)
	fmt.Println(slice2)
	fmt.Println(cap(slice2))
	//the algorithm doubles the capacity if the array size is increased beyond the initial capacity
	
	slice3:=[]int{}
	slice3=append(slice3,5)
	slice3=append(slice3,6)
	slice3=append(slice3,8)
	fmt.Println(cap(slice3))
	fmt.Println(len(slice3))
	fmt.Println(slice3)

	var slice4=make([]int,len(slice3))
	copy(slice4,slice3)
	fmt.Println(slice4)

	var slice5=[]int{1,2,3,4,5}
	var slice6=[]int{1,2,3,4,5}
	fmt.Println(slice5[0:3])
	fmt.Println(slice5[:3])
	fmt.Println(slice5[1:])
	// : is the slice operator and the last index is excluded

	//Slices package to compare two slices
	fmt.Println(slices.Equal(slice5,slice6))	

	//2D slices also possible
	var slice7=[][]int{{1,2},{5,6}}
	fmt.Println(slice7)


}