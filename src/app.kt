fun main(){
    var aparcamiento1=Aparcamiento()
    println(aparcamiento1)
    //Pone en la variable aparcamiento1 un objeto de tipo Aparcamiento y te muestra los datos y lo visualiza
    var cochecito=Coches()
    println(cochecito)
    //Pone en la variable cochecito un objeto de tipo Coches y te muestra los datos y lo visualiza
    var garaje=Garaje(Aparcamiento(),Coches())
    println(garaje)
    //Pone en la variable garaje un objeto de tipo Garaje y te muestra los datos y lo visualiza
    var garajes=Garaje(Aparcamiento(),Coches("12948390J",10.00F,23.59F))
    println(garajes)
    //Pone en la variable garajes un objeto de tipo Garaje con los datos tanto de aparcamiento y de coches
}