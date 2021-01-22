1+1
//version imperativa
def calculatescore ( word : String) : Int = {
  var score = 0
  for( c <-  word.toCharArray)
    score = score +1

  score

}


calculatescore(word = "hola")
// version declarativa
def score (word : String) : Int = word.length

score (word = "Hola")

//version imperativa
def calcular1( p : String) : Int ={
       var cont =0
       for(c <-p.toCharArray)
         cont = cont+1
     cont
}
calcular1(p = "hola")
val tall = (k : Int) => math.pow(-1,k)/math.pow(2,10*k) *
  (-math.pow(2,5)/(4*k+1)
    -1.0/(4*k+3)
    +math.pow(2,8)/(10*k+1)
    -math.pow(2,6)/(10*k+3)
    -math.pow(2,2)/(10*k+5)
    -math.pow(2,2)/(10*k+7)
    +1.0/(10*k+9))