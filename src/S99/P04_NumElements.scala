package S99

class P04_NumElements {
    def sol1(ls : List[Int]) : Int = {
        def recurse(k : Int, ls : List[Int]) : Int = 
            ls match {
            case Nil       => 0
            case _ :: Nil  => k
            case h :: tail => recurse(k + 1, tail) 
        }
        recurse(1, ls)
    }
    
    def sol2[T](ls : List[T]) : Int = {
        def recurse(ls : List[T]) : Int = 
            ls match {
            case Nil       => 0
            case h :: tail => 1 + recurse(tail) 
        }
        recurse(ls)
    }
}