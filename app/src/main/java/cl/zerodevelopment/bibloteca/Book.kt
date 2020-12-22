package cl.zerodevelopment.bibloteca

data class Book(val title:String,val isbn:String,val yearPub:Int,val publisher:String,val numPages:Int, val price:Int,val author:String,val bookType:BookType)

sealed class BookType
class Printed:BookType(){
    override fun toString(): String {
        return "I"
    }

}
class Digital:BookType(){
    override fun toString(): String {
        return "D"
    }
}