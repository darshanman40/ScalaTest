

object retunFunction {
  
  def add(A:Int, B:Int) : Int ={
    
    return A+B;
  }
  
  def printHello() : Unit ={
    println("Hello");
  }
  var factor =3;
  val multiplication = (i:Int) => i*factor;
  
  def main(args: Array[String]){
    println(add(2,5));
    printHello();
    println(multiplication(3));
  }
  
}