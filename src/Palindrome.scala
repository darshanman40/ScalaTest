
object Palindrome {

  def main(args: Array[String]){
    var paliString : String="lOL";
    println(isPalindrome(paliString.toLowerCase(java.util.Locale.ENGLISH).toList))
    
  }
  
  def isPalindrome[A](l:List[A]):Boolean = {
    l==l.reverse
  }
  
  
}