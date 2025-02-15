package com.example.myapplication.CS101.aflevering3

import java.util.Calendar


class RedditPost constructor(
    val author: String,
    val title: String
) : Comparable<RedditPost> //gør så man kan sammenligne go bruge .sort() senere //chatGPT
{
    var postDate = Calendar.getInstance().time
    private var voteBalance: Int = 1 //man kan ikke direkte ændre voteBalance, kun gennem følgende funk

    fun upVote() {
        voteBalance++
    }
    fun downVote(){
        voteBalance--
    }

//ide fra chatGPT
    override fun compareTo(other: RedditPost): Int {
        return Integer.compare(
            other.voteBalance,
            this.voteBalance
        ) // Sorterer i faldende rækkefølge
    }

    //stringyfy så man kan se hvad der foregår i console
    override fun toString(): String {
        return "RedditPost(author='$author', title='$title', postDate=$postDate, voteBalance=$voteBalance)"
    }

}





//ny klass til opgave 3
class RedditFrontPage() {
    val posts: MutableList<RedditPost> = mutableListOf() //en liste der indehoder Redditposts fra før

    //funktion der tager indekstal og sletter det post fra posts listen der evt er på det indeks
    fun deletePost(index: Int)  {
        if (index >= posts.size  || index < 0) {
            println("The list does not have a index $index")
        }
        else {
            println("removeing $index from list")
            posts.removeAt(index)
        }
    }
}