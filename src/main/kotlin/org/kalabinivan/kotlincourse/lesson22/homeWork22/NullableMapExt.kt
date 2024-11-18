package org.kalabinivan.kotlincourse.lesson22.homeWork22

fun <K, V> Map<K, List<V>>?.filterBySize(size: Int): Map<String, List<V>>? {
    if (this == null || this.isEmpty()) return null

    return this.filterValues { it.size >= size }.mapKeys { (key, _) ->
        key.toString()
    }
}