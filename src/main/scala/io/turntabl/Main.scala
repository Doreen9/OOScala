package io.turntabl

import io.turntabl.manager.TLCManager

case class Book (val authorSurname: String, val title: String, val year: Int, val category: String)

object Main extends App{

  val books = List(
    Book("Artwood", "The Handmaid's tale", 2019, "Fiction"),
    Book("Wilde", "The picture of Dorian Gray", 1856, "Fiction"),
    Book("Woods", "Stranger Things", 2015, "Sci-Fi"),
    Book("Eastwood", "Gone with the wind", 1996, "Romance"),
    Book("Robin", "The slave trade", 1890, "History"),
    Book("Dey", "With you", 2010, "Romance"),
    Book("Stine", "Monster Blood", 2009, "Sci-Fi"),
    Book("Johnson", "The art of war", 1932, "History"),
    Book("Poppins", "Friends", 1997, "comedy"),
    Book("Bliton", "Robin Hood", 2010, "comedy")
  )

books foreach (b => if (b.category == "History") b match {
   case Book(a, t, y, c) => println(a)
 })

  val employees: List[TurnTablEmployee] = List(
    TLCStudent("Christiana", "Asare", 2019),
    TLCStudent("Franklin", "Luther", 2017),
    TLCStudent("Yaa", "Nuamah", 2019),
    TLCStudent("Samuel", "Kwakye", 2018),
    TLCManager("Mary", "Goodwill"),
    TLCManager("George", "Pay"),
    TLCManager("Isaac", "Okine"),
    TLCManager("Jessica", "Opare")
  )

  employees foreach (b => (b) match {
    case TLCManager(f, l) => println(s"${b.fname} ${b.lname}")
    case TLCStudent(f, l) => println(s"${b.fname} ${b.lname}")
  })

  }

