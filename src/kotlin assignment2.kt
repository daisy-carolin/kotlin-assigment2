
fun main(){
    name()
    modulus()
    var add=addition(4,7,9,6)
    println(add)
    interestingFacts()
}

fun name(){
    var name="Hello Daisi"
    println(name)
}
fun modulus (){
    var a=9
    var b=2
    var modulus=a%b
    println(modulus)
}
fun addition(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var add = num1 + num2 + num3 + num4
    return add
}
fun interestingFacts(){
    var interestingFacts=("eating")
    println(interestingFacts)
}