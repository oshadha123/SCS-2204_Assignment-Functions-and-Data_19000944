//19000944
object Q1 extends App {
  val x = new Neg(3,4)

  println(x)
  println(x.neg)

}

class Neg(n:Int,d:Int){
  require(d>0,"d must be greater than 0")
  def numer:Int=n
  def denom:Int=d

  def neg=new Neg(-this.numer,this.denom)

  override def toString:String= numer+"/"+denom
}
