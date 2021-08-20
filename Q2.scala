//19000944
object Q2 extends App {
  val x = new Rational(3,4)
  val y=new Rational(5,8)
  val z=new Rational(2,7)
  val answer=x.sub(y).sub(z)
  println(x)
  println(y)
  println(z)
  println(answer)


}

class Rational(n:Int,d:Int){
  require(d>0,"d must be greater than 0")
  def numer:Int=n/gcd(Math.abs(n),d)
  def denom:Int=d/gcd(Math.abs(n),d)
  def this(n:Int)=this(n,1)

  private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)
  def +(r:Rational)=new Rational(this.numer*r.denom+this.denom*r.numer,this.denom*r.denom)
  def neg=new Rational(-this.numer,this.denom)
  def sub(r:Rational)=this+r.neg

  override def toString:String= numer+"/"+denom
}
