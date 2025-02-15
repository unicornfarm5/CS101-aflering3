package com.example.myapplication.CS101.aflevering3

fun main() {
    //opgave 1
    println("opgave 1")
    var book1 = Article("Molly Osteranx", "The girl from the sea")
    var book2 = Article("ND Stevenson", "Nimona")
    var book3 = Article("Mina Rome", "The vegan cookbook")
    var book4 = Article("Lærke Bagger", "Strik-amok")
    var book5 = Article("Jules Bates", "She is the poem")

    val listOfBooks = mutableListOf(book1, book2, book3, book4, book5)
    println(listOfBooks);

    //eller mere fedt:
    for (article in listOfBooks) {
        println(article)
    }

    //opgave 2
    println("")
    println("opgave 2")

    //Laver posts
    val redditPosts = mutableListOf(
        RedditPost("Alice", "Kotlin er fedt!"),
        RedditPost("farmor", "HVORDANFÅRMANBOGSTAVERNETILIKKEATSTÅSÅTLTPÅHINANDEN")
    )

    //der votes på opslagene
    redditPosts[1].upVote()
    redditPosts[1].upVote()
    redditPosts[1].upVote()

    //posts sorteres efter største voteBalance
    redditPosts.sort()
    redditPosts.forEach{println(it)} //de kommmer nu ud i rækkefølge efter mest upvotede først


    //opgave 3
    println("")
    println("opagve 3")

    //tilføjer posts til klassen
    val frontPage = RedditFrontPage() //opretter en instants

    //opretter posts - de tilføjes til frontPage

         frontPage.posts.add(RedditPost("Linea", "Det her mit første post gutter!"))
         frontPage.posts.add(RedditPost("Bo", "Er der nogen der har set min sko?"))
         frontPage.posts.add(RedditPost("Mor", "Se mine dejlige børn"))
         frontPage.posts.add(RedditPost("user121342", "How to kill a child in js"))

    //først printer jeg listen posts fra frontPage ud - før sletning af noget
    println("Before delete:")
    frontPage.posts.forEachIndexed { index, post -> println("$index: ${post.title}") } //smart print - fra chatGPT

    //jeg kalder deletepost funktionen
    frontPage.deletePost(0)
    println("After delete:")
    frontPage.posts.forEachIndexed { index, post -> println("$index: ${post.title}") } //smart print - fra chatGPT


    //opgave 4
    println("")
    println("opgave 4")
    val words = listOf("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana", "apple","banana", "apple", "orange", "banana","banana", "apple", "orange", "apple", "orange", "banana")

    //kode ændret til at håndtere strings istedet - men fra https://www.baeldung.com/kotlin/frequency-map hvor det er til int
        fun getFrequencyMap(words: List<String>): MutableMap<String, Int> {
            val map = mutableMapOf<String, Int>()
            for (word in words) {
                val count = map.getOrDefault(word, 0)
                map[word] = count + 1
            }
            return map
        }

    println(getFrequencyMap(words))


    //opgave 5
    println("")
    println("opgave 5")

    //laver først et par produkter
    val apple = Product("green able", 20)
    val pineapple = Product("pineapple", 7)
    val cherry = Product("cherry", 30)
    val plasticBag = Product("plastic bag", 100)


    //tilføjer 50 plastikposer til lager
    plasticBag.addToAmountInStock(50)

    println(plasticBag.disPlayIncventory())

}