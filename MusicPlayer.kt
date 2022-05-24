/*
The challenge: You are building a Music Player app.
You need to implement the MusicPlayer class, which should hold the track names as Strings in an array. 
The array is already defined in the given code.

The player should support the following functions:
add: add the given argument track to the tracks array.
show: output all track names in the player on separate lines.
play: start playing the first track by outputting "Playing name" where name is the first track name.

You can add a new item to an array using +=, for example: tracks += track
*/

class MusicPlayer {
    private var songs: Array<String> = arrayOf()
    
    //add the given argument track to the tracks array
    fun add(track : String){
    songs += track
    } 

    // output all track names in the player on separate lines.
    fun show() {
        var song : String;
        for (song in songs)
            println(song)
    }
    
    // start playing the first track by outputting "Playing name" where name is the first track name.
    fun play() {
        println("Playing "+songs[0]);
    }

}

// start the program
fun main(args: Array<String>) {
    val m = MusicPlayer()
    
    // program loop to read input and call functions
    while(true) {
        var input = readLine()!!
        if(input == "stop") {
            break
        }
        m.add(input)
    }
    m.show()
    m.play()
}
