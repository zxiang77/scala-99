package S99

class P05_ReverseList {
    // foldLeft similar to reduce() but given initial value from arg
    // reverseFunctional, this is a pure function
    def sol1[A](ls: List[A]): List[A] =
        ls.foldLeft(List[A]()) ( (r, h) => h :: r )
        
    def sol2[T](ls : List[T]) : List[T] = {
        def recurseTail(ls1 : List[T], ls2 : List[T]) : List[T] = {
            (ls1) match {
                case (Nil)  => ls2
                case (h :: tail) => recurseTail(tail, h :: ls2)
            }
        }
        recurseTail(ls, List[T]())
    }
}