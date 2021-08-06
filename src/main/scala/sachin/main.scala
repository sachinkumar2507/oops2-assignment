package sachin

object Main {

  def main(args: Array[String]): Unit =
  {

    val Person1=new Person("test",Age = 24)
    val Person2=new Person("test",Age = 23)


    if ((Person1.Name).equals(Person2.Name))
    { val comparison=Person1.compare(Person2)
        if(comparison<0)
          {
            println("False, Age are different")
          }
        else if(comparison>0)
        {
          println("False, Age are different")
        }
        else
          {
            println("True, both person having same Age")
          }

    }
    else
      {
        if ((Person2.Name.length()) < (Person1.Name.length()))
        {
          println("False, Name length of person1 is greater")
        }
        else if ((Person2.Name.length()) > (Person1.Name.length()))
        {
          println("False, Name length of person2 is greater")
        }
        else
        {
          println("True,Name length of person1 is greater")
        }
      }
  }
}