//19000944
object Q4 extends App{

  val acc1=new Account("nic1",1,1000.00)
  val acc2=new Account("nic2",2,800.00)
  val acc3=new Account("nic3",3,-100.00)
  val acc4=new Account("nic4",4,-50.00)
  var bank:List[Account]=List(acc1,acc2,acc3,acc4)

  val overdraft=(bank:List[Account])=>bank.filter((x)=>(x.balance<0))

  val totalBalance=(bank:List[Account])=>bank.reduce((x,y)=>x+y)

  val list1=bank.filter((b)=>(b.balance<0))
  val list2=list1.map(x=>(x-(x*0.1)))
  val list3=bank.filter((b)=>(b.balance>0))
  val list4=list3.map(x=>(x+(x*0.05)))


  val list5=List.concat(list2,list4)
  println("All accounts")
  println(bank)
  println("List of accounts with negative balances")
  println(overdraft(bank))
  println("Sum of all account balances")
  println(totalBalance(bank))
  println("Final balances of all accounts")
  println(list5)
}



class Account(id:String,n: Int, b: Double){
  val nic:String=id
  val acnumber: Int = n
  var balance:Double=b


  def +(a:Account)=new Account(this.nic,this.acnumber,this.balance+a.balance)
  def -(a:Account)=new Account(this.nic,this.acnumber,this.balance-a.balance)

  def *(d:Double):Account=new Account(this.nic,this.acnumber,this.balance*d)

  override def toString = "["+nic+":"+acnumber +":"+ balance+"]"

}
