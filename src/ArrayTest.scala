import Array._

object ArrayTest {
  
  def main(args:Array[String]){
    var z: Array[String] = new Array[String](3);
    z(0)="Zara";
    z(1)="Nuah";
    z(2)="Ayan";
    var y = Array("Zara","Nuah","Ayan");
    
    var myList = Array(1.9,3.0,2.9,3.4);
    
    var multiArray = ofDim[Int](3,3)
    
    for(x <- myList){
        println(x)
    }
    
    var total=0.0
    
    for( i <- 0 to (myList.length-1)){
      total += myList(i)
    }
    
    println("Total= "+total)
    
    var max = myList(0)
    for(i<-0 to myList.length-1){
      if (myList(i)>max) max=myList(i);
    }
    
    println("Max="+max)
    
    
    //build a matirix
    for(i<-0 to 2){
      for(j<-0 to 2){
        multiArray(i)(j) = j;
      }
    }
    
    //print matrix
    println("matrix");
    for(i<-0 to 2){
      for(j<-0 to 2){
        print(multiArray(i)(j)+",");
      }
      println("");
    }
  
  }
}