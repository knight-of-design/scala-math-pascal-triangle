object Solution {

    def main(args: Array[String]) {
       val x :Int = readLine().toInt
       val m = scala.collection.mutable.HashMap((0,0)->0)
       for ( r <- 1 to x) {
           val pr = r - 1
           for (c <- 1 to r) {
               val pc = c -1
                if (c == 1 || c == r) {
                    m += ((r,c)->1)
                    print(1)
                }
                else if (c == 2 || c == pr) {
                    m += ((r,c)->pr)
                    print(pr)
                        
                }
                else {
                    val ptv = m((pr,pc))+m((pr,c))
                           m += ((r,c)->ptv)                
                    print(ptv)
                }
               print(" ")
           }
           print("\n")
          
       }
           
    }
}
