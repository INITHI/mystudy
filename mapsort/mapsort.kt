package com.study

import java.util.*


public class mapsort {
    fun main() {
        val map = LinkedHashMap<Int, Int>()
        map[0] = 10
        map[1] = 20
        map[2] = 70

        val list: List<Map.Entry<Int, Int>> = LinkedList<Map.Entry<Int, Int>>(map.entries)

        Collections.sort(list) { o1, o2 -> if (o1.value < o2.value) 1 else -1 }

        map.clear()

        val iter = list.iterator()
        while (iter.hasNext()) {
            val entry = iter.next()
            map[entry.key] = entry.value
        }

        println("ggggg")
    }
}