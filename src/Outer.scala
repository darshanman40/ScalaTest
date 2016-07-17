

package p{
  
  class Super{
    protected def f() { println("f")}
  }
  
  class Sub extends Super{
    f()
  }
  
  class Other{
    //(new Super).f(); 
  }
  
}


package society{
  package professional{
    class Executive{
      private[professional] var workDetails = null;
      private[society] var friends = null;
      private[this] var secrets = null;
      
      def help(another: Executive){
        secrets
        println(another.workDetails);
        println(another.friends)
        //println(another.secrets)
        println(secrets)
      }
      
      
    }
    
    
  }
}

import society.professional._
object demo2{
    def main(args: Array [String]){
        var exec : Executive = new Executive();
        exec.help(new Executive);
      }
    }

class Outer {
  class Inner{
     private def f(){ printf("hello")}
    class InnerMost(){
      f();
    }
    f();
  }
  //f();
}