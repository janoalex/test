package com.akamon.belote.game

import com.akamon.belote.vo.Announce
import java.util.*

class AnnouncesPlayer {

    internal var announcesPlayer: MutableList<Announce> = ArrayList()

    fun add(announce: Announce) {
        announcesPlayer.add(announce)
    }

    val announces: List<Announce>
        get() = announcesPlayer
}