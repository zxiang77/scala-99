package S99

class P06_isPalindrome {
    // 1. can just reverse and compare the list 
    def sol1[Int](ls : List[Int]) : Boolean = {
        return ls == ls.reverse
    }
    
    // with pattern matching
    def sol2[Int](ls : List[Int]) : Boolean = {
        ls match {
            case Nil => true
            
        }
    }
}