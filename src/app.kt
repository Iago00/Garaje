fun main(){
    var apar1=Aparcamiento()
    println(apar1)
    //La variable apar1 cosnta de un objeto de tipo Aparcamiento con los datos que tiene por defecto para luego mostrarlos
    var coche1=coche()
    println(coche1)
    //Escribe en coche1 un objeto de tipo coche con los datos que tiene por defecto para luego mostrarlos
    var gar1=garaje(Aparcamiento(),coche())
    println(gar1)
    //Escribe en gar1 un objeto de tipo garaje con los datos que tiene por defecto para luego mostrarlos
    var gar2=garaje(Aparcamiento(),coche("B 435 AB",10.00F,15.30F))
    println(gar2)
    //Escribe en gar2 un objeto de tipor garaje con los datos de aparcamiento que tiene por defecto y otros de coche
}