fun main(){
    println(even(20))
    println(even(21))
    var centralMarket=products("onions",16.1,250.00,"gloceries")
    var shop=products("liquid sorp",2.01,300.60,"hygine")
    centralMarket.goods()
    shop.goods()
    println(word("banana"))
    println(person(arrayOf("Judith","Nandase","Bakulimya","Kutesa","Blessing")))
}

fun even(num:Int):Boolean{
    if(num%2==0){
        return true
    }
    else{
        (num%2!=0)
        return false
    }
}

data class products(var name:String,var Weight:Double,var price:Double,var category:String){
    fun goods(){
        var gloceries = mutableListOf<String>()
        var hygine = mutableListOf<String>()

        when (category) {
            "gloceries" -> println(mutableListOf("$name","category"))
            "hygine" ->println (mutableListOf("$name","category"))
            else ->println("Other category")
        }
    }
}

fun word(word:String):String{
    var name = ""
    for (letter in word){
        if (word.indexOf(letter)%2==0){
            name += letter
        }
    }
    return name
}

fun person(names:Array<String>):MutableList<String>{
    var listOfLongName = mutableListOf<String>()
    for(name in names){
        if(name.length%2==0){
            listOfLongName.add(name)
        }
    }
    return listOfLongName
}