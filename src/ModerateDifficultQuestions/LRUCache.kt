package ModerateDifficultQuestions

import java.time.Instant
import java.util.*

/**
 * Created by Jason on 7/16/17.
 */

// Design and build a "least recently used" cache, which evicts the least recently used item. The cache should map
// from keys to values (allowing you to insert and retrieve a value associated with a particular key) and be
// initialized with a max size. When it is full, it should evict the least recently used item.

class LRUCache(private val minHeap: PriorityQueue<Pair<String, Date>>) {

    init {
        if (minHeap.size > 100) throw ExceptionInInitializerError("Heap is too large")
    }

    fun evictStale(): PriorityQueue<Pair<String, Date>> {
        println("Removing oldest cached value: ${minHeap.poll()}")
        return minHeap
    }
}


fun main(args: Array<String>) {

    val minHeap = PriorityQueue<Pair<String, Date>>(100, kotlin.Comparator { x, y ->
        x.second.compareTo(y.second)
    })

    val oldestTime = Date.from(Instant.now())
    Thread.sleep(1000)
    val newerTime = Date.from(Instant.now())
    minHeap.add(Pair("Old Value", oldestTime))
    minHeap.add(Pair("Newest Value", newerTime))

    println("Should print Newest Value (with 'Old Value removed from heap'): Actual: ${LRUCache(minHeap).evictStale()}")
}