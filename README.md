
# SI2 — Kotlin Problems

This repository contains solutions to 5 LeetCode problems written in Kotlin.

## 1. Two Sum
**Topic:** Arrays, HashMap

I use a HashMap to store numbers and their indices.
For each number, I check whether its complement exists in the map.
If it does, I return the two indices.

## 2. Valid Parentheses
**Topic:** Strings, Stack

I use a stack to track opening brackets.
For each closing bracket, I check whether it matches the most recent opening bracket.
The string is valid if all brackets match and the stack is empty at the end.

## 3. Binary Search
**Topic:** Binary Search

I use two pointers, left and right, to search a sorted array.
At each step, I check the middle element and discard half of the search range.
If the target is not found, I return -1.

## 4. Best Time to Buy and Sell Stock
**Topic:** Arrays

I track the minimum price seen so far.
For each price, I calculate the possible profit and update the maximum profit.
The result is the highest possible profit from one buy and one sell.

## 5. Fizz Buzz
**Topic:** Math, Strings

I use the map function to generate a list of strings from 1 to n.
Numbers divisible by 3 become "Fizz", numbers divisible by 5 become "Buzz", and numbers divisible by both become "FizzBuzz".
All other numbers are converted to strings.
