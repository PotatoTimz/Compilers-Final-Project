# Compilers-Final-Project

# Backend

This is a modification to assignment 3. Featuring the inclusion of **Lists** and aggregate functions that can be applied to the list.

## Data Types Added

* ListIntData
* ListStringData

Data types that store either a list of strings or a list of numbers. Note that both lists must contain values of a specific type (ie ListIntData must contain only integers)

### List Creation Expressions
* **ListStringLiteral**(lexeme: List\<String>)
* **ListIntLiteral**(lexeme: List\<String>)

### List Creation Expressions
* **ListStringLiteral**(lexeme: List\<String>)
* **ListIntLiteral**(lexeme: List\<String>)

### List Aggregation Expressions
* MaxList(list: Expr): Gets the largest number from a list of integers
* MinList(list: Expr): Gets the smallest number from a list of integers
* AverageList(list : Expr): Gets the average value from a list of integers
* SumList(list: Expr): Gets the sum from a list of integers
* CountList(list: expr): Gets the size from a list
* MapList(funcname: String, name: String, arguements: List\<Expr>): Applies a function to each item within a list. The function will run through each item using the itterated item as the last parameter of the function. The other parameters in the function must also be declared.

# Frontend

## Data Types Supported / Declarable Values

Integer type\
String type\
Boolean type\
List type (Integer and String)\
Functions type

## Variable Decleration

Done through defining the (1) **Variable_Name**, (2) **Variable_Value** (3) and spacing it out with " = "\
Lists can be declared the same way by using a square bracket

&nbsp; *Variable_name* = **Variable_Value**

**Note**: Spacing for some of the functions are sensitive

## Lists

Like other programming languages specific values stored inside of a list can be accessed. Where the index number goes from 0 -> n (number of items in the list)

### Editing an Existing List

You can update an already-declared list

&nbsp; *array_name*[**index_number**] = new_value

### Adding to Existing List

&nbsp; *array_name*[**index_number**]

You can also edit lists after they are declared by adding values at a specified index

&nbsp; *array_name*.add(**item_to_be_added**, **index_number**)

There are also shortcuts to add items to the front or back of a list

&nbsp; *array_name*.add(**item_to_be_added**, front)\
&nbsp; *array_name*.add(**item_to_be_added**, back)

### List Aggregate Functions

##### Max
Given a list of integers returns the largest number in the list

&nbsp; max(*array_name*);

##### Min
Given a list of integers returns the smallest number in the list

&nbsp; min(*array_name*);

##### Sum
Given a list of integers returns the sum of the list

&nbsp; sum(*array_name*);

##### Average
Given a list of integers returns the average of the values in the list

&nbsp; avg(*array_name*);

##### Size
Given any list returns the amount of items inside the list

&nbsp; size(*array_name*);

**Note:** that each of these functions returns a an Integer value

## Arithmetics

Arithmetics for both strings and integers are supported.

**Opperations**\
&nbsp; "+" -> Addition for integers | "++" -> Addition for strings\
&nbsp; "-" -> Subtraction\
&nbsp; "*" -> Multiplacation\
&nbsp; "/" -> Division


**Integers:** can be (1) added, (2) subtracted, (3) multiplied and (4) divided\
**Strings:** can be (1) added and (2) multiplied

&nbsp; *value_one* operation *value_two*

Performing arithmetics with an integer will return an integer and performing arithmetics with a string wil retturn a string 

The operations are performed from left to right. However **brackets** can be used to operations

## If Else Statements

Given a boolean statement perform one block or another

<strong>Comparitive Statements:</strong>\
&nbsp; "<" -> Lower than\
&nbsp; "==" -> Equal\
&nbsp; ">" -> Greater than

To declare an ifelse statement you must provide a (1) **comparative statement**, (2) **if_body**, and (3) **else_body**. Depending on the boolean value returned by the comparative statement the if or the else body will be outputted

&nbsp; if(**comparitive_statement**) {\
&nbsp;&nbsp;&nbsp; if_body   
&nbsp; }\
&nbsp; else {\
&nbsp;&nbsp;&nbsp; else_body\
&nbsp; }

## For Loops

Will loop the body of code given a specified amount of time-based on the range given.
The current iteration of the code will be stored within an integer variable and can be accessed within the body of code.\
To create a for loop you will need to declare a (1) **Itteration Name**, (2) **Loop Start Number**, (3) **Loop End Number**, (4) **Body of Code**

&nbsp; for(*Itteration_Name* in *Loop_Start_Number*..*Loop_End_Number*){\
&nbsp;&nbsp;&nbsp; **Body_Of_Code**\
&nbsp; }

## For Loops

Will loop the body of code given a specified amount of time-based on the range given.
The current iteration of the code will be stored within an integer variable and can be accessed within the body of code.\
To create a for loop you will need to declare a (1) **Itteration Name**, (2) **Loop Start Number**, (3) **Loop End Number**, (4) **Body of Code**

&nbsp; for(*Itteration_Name* in *Loop_Start_Number*..*Loop_End_Number*){\
&nbsp;&nbsp;&nbsp; **Body_Of_Code**\
&nbsp; }

#### Aggregate Function

**Map**: Given a list and a function (with parameters if needed) apply the function to each of the values in the list. The return type of the function must match the type of the list given.

&nbsp; *array_name*.map(*function_name*(*parameters*))

**Note**: that the items in the list will automatically be applied as the last parameter inside of the function
