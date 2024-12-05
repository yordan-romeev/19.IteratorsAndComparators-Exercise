# Iterators and Comparators in Java

## Overview
This project focuses on the implementation of **Iterators** and **Comparators** in Java, highlighting their usage within collection frameworks and custom classes. 

## Objectives
1. **Implement Iterable and Iterator**:
    - Create a `Library` class that implements the `Iterable<Book>` interface.
    - Add a nested `LibIterator` class within `Library`, which implements `Iterator<Book>`.

2. **Implement Comparable and Comparator**:
    - Extend the `Book` class to implement the `Comparable<Book>` interface for default sorting by title, and by year when titles match.
    - Develop a `BookComparator` class to enable custom sorting logic for `Book` objects.
