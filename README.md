POSSIBLE EQUAL MAXIMAUM SUM ASSIGNMENT
Name: Ajay Kumar
Sec: A
Roll No: 33
Branch: CSE-A
Subject: DAA
PROBLEM STATEMENT
You are given 3 stacks. Find the maximum sum possible such that sum of elements of each stack are equal and maximum. You can only remove elements from top of the stack
Algorithm
1.	We have to find the sum of all elements of the in individual stacks.
2.	If the sum of all three stacks is the same, then this is maximum sum.
3.	Else remove the top elements of the stack having the maximum sum among three of stacks. Repeat step 1 and step 2.
Example
Given three filled stacks namely ‘stack1’ ‘stack2’ and ‘stack3’ of positive numbers, the task is to find the possible equal maximum sum of the stacks with the removal of top elements allowed.
 
 
 
 
 
 
We can see that currently,
the sum of stack 1 is: 8+5+3 = 16
the sum of stack 2 is: 2+2+4+9+6 = 23
the sum of stack 3 is: 2+1+2+3 = 8
So they are not equal.
However, if we pop {8} from stack 1, {6,9} from stack 2 and nothing from stack 3,
We get the sum as :
Stack 1: 16-8=8
Stack 2: 23-15=8
Stack 3: 8-0=8
We can see that now the sum of all three stacks are equal which is 8 and it is the highest possible, hence we return 8.
