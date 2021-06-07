package com.williamfiset.algorithms.datastructures.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import static org.junit.jupiter.
import static org.junit.jupiter.params.provider.MethodSource;


/*
==== Modifier ====
clear
// add == addLast
addLast
addFirst
addAt
removeFirst
removeLast
remove
removeAt

==== Observer ====
size
isEmpty
peekFirst
peekLast
indexOf
contains

==== Modifier + Observer ====
clear + size + isEmpty: after clear, size == 0, isEmpty == True
add + size + isEmpty + contains: after add, size == oldSize+1, isEmpty == False, contains(x) == True
add + peek: after addLast(First) (x), peekLast(First) == x
add + indexOf: after addLast(First) (x), indexOf(x) == size-1 / 0
addAt + indexOf: if contains(x) == False, after addAt(x, p), indexOf(x) == p

 */

public class DoublyLinkedListTheoryPropertyFirst {
    private DoublyLinkedList<Integer> list;

    @BeforeEach
    public void Initialize(){
        list = new DoublyLinkedList<>();
    }


}
