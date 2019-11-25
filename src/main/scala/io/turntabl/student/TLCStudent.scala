package io.turntabl.student
import io.turntabl.grades.Grade

class TLCStudent(val fname: String,
                 val lname: String,
                 yearStarted: Int,
                 val IDnumber: String = "12234",
                 val role_description: String = "developer",
                 val Github_url: String = "https://github.com/turntabl")
{

  override def toString: String = s"Name: $fname $lname \n ID: $IDnumber \n Role_description: $role_description"



  def yearsServed = {
    2019 - yearStarted
  }

  def sameService(student1: TLCStudent) = student1.yearsServed equals yearsServed

  def TopGrade = {
    Grade("Programming_Fundamentals", "A")
  }
}

object TLCStudent{

  def apply(fname: String, lname:String, year: Int) = new TLCStudent(fname, lname, year)

}

object MyApp extends App{

  val Student1 = TLCStudent("Christiana", "Asare", 2017)

  val Student2 = TLCStudent("Franklin", "Luther", 2020)

  print(Student1 sameService Student2)

  print(Student1.TopGrade)


}



