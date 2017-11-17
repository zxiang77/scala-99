package S99

class S_02Last_Second_Element {
  type Environment = String => Int
  def last_second[A](ls:List[A]): A =
    if (ls.isEmpty) throw new Throwable
    else
      ls.init.last
  
  
  def lastNth[Any](n : Int, ls: List[Any]): Any = {
      def lastNthR(count : Int, resultList: List[Any], curList: List[Any]): Any = 
        curList match {
        case Nil if count > 0 => throw new Exception
        case Nil              => resultList.head
        case _::tail          => 
          lastNthR(count - 1, if (count > 0) resultList else resultList.tail, tail)
      }
      if (n <= 0) throw new IllegalArgumentException
      else lastNthR(n, ls, ls)
  }
  
  def sec[T](ls : List[T], n : Int):T = {
    def secR(ls1: List[T], ls2: List[T], ctr : Int): T = 
      ls1 match {
        case Nil if ctr > 0 =>  throw new Exception
        case Nil            => ls2.head
        case _::tail        => secR(ls1.tail, if (n > 0) ls2 else ls2.tail, n - 1)
        case _              => throw new Throwable
    }
    secR(ls, ls, n)  
      
  }
    
}