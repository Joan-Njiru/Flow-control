fun main(){
    ageClassifier(3)
    ageClassifier(13)
    ageClassifier(23)
    humanAges(18)
    humanAges(5)
    classWay(2)
    classWay(1)
    classWay(7)
    classWay(80)
    countryPeople("Rwanda")
    countryPeople("Wales")
    val languages = arrayOf("Swahili","English","Kinyarwanda","Luganda","Kiembu")
    for (l in languages){
        println("I speak $l")
    }
    val numbers = arrayOf(4,2,3,7,9,11)
    var results = arrayOf("Mangoes","Ada",57,32.5,"Nairobi",62.5F,3.142,"Karen",false)

}
fun ageClassifier(age:Int) {
    if (age in 12..19) {
        println("You are a teenager")
    }
    else{
        println("you are not a teenager")
    }
}
//baby,toddler2..5,child 5..17,adult
fun humanAges(age:Int) {
    if (age in 0..1) {
        println("You are a baby")
    }
    else if (age in 2..5){
        println("you are a toddler")
    }
    else if (age in 6..17){
        println("you are a child")
    }
    else{
        println("Welcome to adulthood")
    }
}
fun classWay(age: Int){
    when(age){
       in 0..1 -> println("baby")
        in 2..5 -> println("toddler")
        in 6..17 -> println("child")
        else-> println("adult")

    }
}
//Write a function that takes in a country name
// and prints out the corresponding nationality
// for the following countries Rwanda, Ghana, Portugal.Wales

fun countryPeople(peeps:String){
    when(peeps){
         "Rwanda" -> println("Rwandese")
        "Ghana" -> println("Ghanaian")
        "Portugal" -> println("Portuguese")
         "Wales" -> println("Welsh")
        else -> println("world citizen")
    }
}
//For loop - used to iterate over collections like lists,

//Write a function that takes in an array of random integers
//and prints out whether each is odd or even

fun evenOdd(nums:Array<Int>) {
    for (num in nums) {
        if (num%2 == 0) {
            println("even")
        } else {
            println("odd")
        }
    }
}

//Write a function that takes in an array of
//mixed types and returns the sum of the decimal
//elements only
fun sumDecimals(numerals: Array<Any>){
   var sum=0
    for (numers in numerals){
        if (numers is Double)
    sum+=numerals
}
    
}