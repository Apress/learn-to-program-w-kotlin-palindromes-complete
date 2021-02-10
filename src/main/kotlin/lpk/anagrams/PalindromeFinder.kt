package lpk.anagrams

import java.nio.file.Paths

/**
 * Finds and prints out English palindromes.
 */
fun main() {
    //Create a dictionary from "english.txt" in resources/books
    val path = Paths.get("src/main/resources/books/english.txt")
    val dictionary = Dictionary(path)
    //For each string in the dictionary...
    for (str in dictionary.words) {
        //...create a Term from the string
        val word = Term(str)
        //...test to see if the word is a palindrome...
        if (word.isPalindrome()) {
            //...if it is, print it.
            println(word)
        }
    }
}
