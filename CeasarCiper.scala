

object CeasarCiper {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  
  val Encorder=(character:Char,key:Int,alpha:String)=>alpha((alpha.indexOf(character.toUpper)+key)%(alpha.size))
  val Decorder=(character:Char,key:Int,alpha:String)=>if((alpha.indexOf(character.toUpper)-key)>=0) alpha((alpha.indexOf(character.toUpper)-key)) else alpha((alpha.indexOf(character.toUpper)-key+26)) 
  
  val cipher=(algorithm:(Char,Int,String)=>Char,string:String,key:Int,alpha:String)=>string.map(algorithm(_,key,alpha))
  
  def main(args:Array[String]){
      var s="wxyz"
     
      val ct=cipher(Encorder,s,4,alphabet)
      val pt=cipher(Decorder,ct,4,alphabet)
      println("After Encoding:"+ct)
      println("After Decoding:"+pt)
  }
  



}