# Scala preparation :

---
## Expressions :
In scala, expressions are something that have a value and a type
Example : 
- 2+3
- 1 == x
---
## Operations :

- ### Mathematical Operations
  - \+ \- * /  ^ << >> >>>
    - \>>> is right shift with zero extension
- ### Relational Operations 
  - == != < > <= >=
- ### Logical Operations 
  - ! || && 
- ### Other operations
  - += -=
---
## Instructions vs Expressions

Instructions tell the computer what is to be done \
Expressions are something that have a value and a type \

In scala, IF is an expression 

``` val conditionedValue : Int = if(bool == true) 234 ; else 334 ```

---
## AVOID USING LOOPS 
Scala is not meant for such imperative code.
You will be haunted by people especially if you use while loops.

---
## Tail recursion : 
Function is the last and only expression of the code path of itself. \
This ensures you preserve the same stack frame and not use another stack frame like in normal recursion.

---

## Call by name v/s call by value

Call by name delays the evaluation of the expression passed as a parameter until it is used. \
where as \
Call by value passes the evaluated value to the expression. 



