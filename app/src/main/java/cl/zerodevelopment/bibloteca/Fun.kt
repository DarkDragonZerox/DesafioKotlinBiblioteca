package cl.zerodevelopment.bibloteca

fun formatPrice(pPrice:Int):String{
    return "$$pPrice"
}
fun Book.printBook(){
    println(
        "Titulo: $title \n ISBN: $isbn \n Año: $yearPub \n Editorial: $publisher \n Paginas: $numPages \n Precio: ${
            
            formatPrice(price)} \n Autor: $author \n Formato: $bookType"

    )
    println("")
    println("")
    println("")

}