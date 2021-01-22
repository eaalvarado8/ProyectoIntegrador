//deber resuelto.
val f = (x : Int) => Math.sqrt(1+x*x)
f(1)
((x : Int) => Math.sqrt(1+x*x))(1)

//RANGO INCLUSIVO
(0 to 20 ).foreach(k => println((1/math.pow(16,k))*4.0/(8*k+1)-2.0/(8*k+4)-1.0/(8*k+5)-1.0/(8*k+6)))
(0 to 20 ).foreach(k => println(k))

//con funcion sin nombre

val bbp = (k : Int) =>1/math.pow(16,k)*(4.0/(8*k+1)-2.0/(8*k+4)-1.0/(8*k+5)-1.0/(8*k+6))
(0 to 20 ).foreach(k => println(bbp(k)))

//sumatoria
val bbp2 = (k : Int) =>1/math.pow(16,k)*(4.0/(8*k+1)-2.0/(8*k+4)-1.0/(8*k+5)-1.0/(8*k+6))
(0 to 40 ).map(k => bbp2(k)).sum

//Taller Semana 2

val tall = (k : Int) => math.pow(-1,k)/math.pow(2,10*k) *
  (-math.pow(2,5)/(4*k+1)
  -1.0/(4*k+3)
  +math.pow(2,8)/(10*k+1)
  -math.pow(2,6)/(10*k+3)
  -math.pow(2,2)/(10*k+5)
  -math.pow(2,2)/(10*k+7)
  +1.0/(10*k+9))

//resultado 0 a 20

(0 to 10).foreach(k => println(tall(k)*1/math.pow(2,6)))

//resultado sumatoria 2 formas
val x2sum = (0 to 10 ).map(k => tall(k) * 1/math.pow(2,6)).sum

(0 to 10 ).map(k => tall(k)).sum * 1/math.pow(2,6)


