//EVALUACION PARCIAL CARLOS SARMIENTO 
//ARCO TANGENTE 1/N
val form= (n : Int, k: Int) => math.pow(-1,k)/(2*k+1) * math.pow(n,-2*k-1)
val tan = ( n : Int ) => ( 0 to 1000000 ).map ( k => form(n,k) ).sum
//Formula Implementada para calcular pi
val pi = (4 * tan(5) - tan(239))*4


val tabla: List[(Int , Int )] = List((2, 2), (3, 2), (5, 1),(6, 3))

val N = tabla.map(_._2).sum.toDouble
val xMediaFun = (tabla: List[(Int, Int)]) => tabla.map(t => t._1 * t._2).sum / N
val xMedia = xMediaFun(tabla)
val s2 = (tabla: List[(Int, Int)]) => tabla.map(t => (t._1 * t._1)*t._2).sum/N - Math.pow(xMedia,2)
val CV = Math.sqrt( s2 ( tabla ))/xMedia