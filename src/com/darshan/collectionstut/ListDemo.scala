package com.darshan.collectionstut

object ListDemo {
  def main(args: Array[String]){
  
      var fruitList : List[String] = List("apple","mango","pears");
    
      //empty list
      var empty: List[Nothing] = List()
    
      //two dimensional list
      val multi: List[List[Int]] = List(List(1,2,3),List(2,3,4),List(3,4,5))
    
      var fruits = "apple" :: ("mango" ::("pear"::Nil))
      
      val nums = Nil
      
      println("List head: "+fruits.head)
      println("List tail: "+fruits.tail)
      println("Check if fruit is empty: "+fruits.isEmpty)
      println("Check if nums is empty: "+nums.isEmpty)
      for(fruit:String <- fruits){
          println(fruit)
      }
  }
}