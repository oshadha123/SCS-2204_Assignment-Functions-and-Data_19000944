//19000944
object Q3 extends App {

  val x = new Acc("nic1",1,1000.00)
  val y = new Acc("nic2",2,200.00)
  var bank:List[Acc]=List(x,y)
  println("Account balances before transferring money")
  println(x)
  println(y)
  println("Account balances after transferring money")
  x.transfer(y,100)
  println(x)
  println(y)


}

class Acc(id:String,n: Int, b: Double) {
  val nic:String=id
  val acnumber: Int = n
  var balance: Double = b

  def withdraw(a:Double) = this.balance=this.balance-a
  def deposit(a:Double) = this.balance=this.balance+a
  def transfer(a:Acc,b:Double)={
    a.balance=a.balance+b
    withdraw(b)

  }
  override def toString = "["+nic+":"+acnumber +":"+ balance+"]"
}
