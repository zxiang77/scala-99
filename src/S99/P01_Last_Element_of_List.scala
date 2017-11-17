package S99

/**
 *  Return the last element of an array in Scala
 */
class P01_Last_Element_of_List {
  def main(args : Array[String]) {
    var arr : List[Int] = List(1,4,6,2,7)
    
    println (lastBuiltin(arr))
  }
  
  def lastBuiltin[A](ls: List[A]): A = ls.last

  def recursive_sol[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
    
  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
    
}
