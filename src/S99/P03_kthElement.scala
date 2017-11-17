package S99

class kthElement {
  def kthElement[T](k : Int, arr : List[T]) : T = {
    
    def recurse(ct : Int, arr : List[T]) : T =
      (ct) match {
      case (0)        => arr.head
      case positive => recurse(ct - 1, arr.tail) // ???
      
    }
    
    recurse(k, arr)
  }
  
  def sol2[T](k : Int, arr : List[T]) : T = {
      def recurse(ct : Int, arr : List[T]) : T = 
          (ct, arr) match {
          case (0,  h :: tail)  => h
          case (ct, _ :: tail)  => recurse(ct - 1, tail)
          case (_, Nil       )=> throw new Exception
      }
      recurse(k ,arr)
  }
  
    def sol3[T](k : Int, arr : List[T]) : T = arr(k)
  
}