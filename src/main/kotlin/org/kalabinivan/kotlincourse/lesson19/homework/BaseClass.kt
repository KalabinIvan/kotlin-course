package org.kalabinivan.kotlincourse.lesson19.homework

abstract class BaseClass(
    // объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    // в ChildrenClass совершенно другая переменная, тут просто дублируется имя
    private val privateVal: String,
    // объясни, почему это поле недоступно в main()
    // protected доступны только классам наследникам
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "измени меня из функции main() через сеттер в наследнике"
    private var privateField = "добавь сеттер чтобы изменить меня из main()"

    fun setPrivateField(value: String) {
        privateField = value
    }

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // объясни, почему эта функция не может быть публичной
    // объект защищенного класса будет доступен извне
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // объясни, почему эта функция не может быть публичной или protected
    // потому что она не должна быть доступна наследникам или в мейне
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass

    private class PrivateClass

}
class ChildrenClass(
    private val privateVal: String,
    protectedVal: String,
    // объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // унаследован из base
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {

    override fun verifyPublicField(value: String): Boolean {
        return true
    }

    fun setProtectedField1(value: String) {
        protectedField = value
    }

    // объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // функция является публичной, поэтому доступна

    // проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
}

fun main() {

    val childrenClass = ChildrenClass(
        "PrivateVal1",
        "ProtectedVal2",
        "ProtectedVal3"
    )

    childrenClass.publicField = "Антонио Бандерас"
    println(childrenClass.publicField)

    childrenClass.setProtectedField1("New Protected Field")
    childrenClass.setPrivateField("new Private Field")
    childrenClass.printText()

    println(childrenClass.getAll())

}
