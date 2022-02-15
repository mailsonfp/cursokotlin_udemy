package fundamentals

fun main() {
    //tipos numéricos
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long =  9_223_372_036_854_775_807
    val num5: Long = Long.MAX_VALUE

    // Tipos Numéricos Reais
    val num6: Float = 3.14F
    val num7: Double = 3.14

    // Tipo caractere
    val char: Char = '?'

    // tipo booleano
    val boolean: Boolean = true

    println(listOf(num1,num2,num3,num4,num5,num6,num7,char,boolean))
}
