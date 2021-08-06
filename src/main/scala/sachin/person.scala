package sachin

case class Person (Name:String,Age:Int) extends Ordered[Person]{
  override def compare(that: Person): Int = {
    this.Age-that.Age;
  }
}