# Java Object Oriented Programming (OOP)

## Data Types

- double
- Enum -> Special type that represents constants. When we declare Enum, nobody is able to input any new value when using the Enum variable. (much like Const in JS)

## Return Types



## Pillars of OOP

1. Abstraction
2. Inheritance 
3. Encapsulation
4. Polymorphism

## Classes

- Allows us to model physical objects in code.

- Nothing is created. We are just letting people know that if it were to exists, this is how it should be.

- a blueprint containing a set of attributes and behaviours that define an item

- Can either:

  - Be empty
  - Have attribute/s
  - Have  function/s (behaviour/s)
  - Have both attribute/s and function/s (behaviour/s)

- If you change the blueprint, it will affect any instances that is related to the class.

  ### Constructors

  - Is spelled with capital letter at the start
  - Is spelled using the same name as the Class Name
  - Does not need a return value as the name itself counts as the return type 
  - They are used to build instances

  ### To create classes

  - in another class - such as Main, we will need to use `new` before calling the class name. Example `new Tree( )`.
  - ![image-20240726221321713](C:\Users\20asr\AppData\Roaming\Typora\typora-user-images\image-20240726221321713.png)
  - The `Tree` before `myFavoriteOakTree` is the return type. 'Cos we made a class called `Tree`.
  - Also, that whole line of code is called an instance.

  ## Static and Non-Static Member

  - Non-Static Member: A part of a class that is accessible with an instance and belongs to that instance.
  - Also known as instance members because you have to create an instance in order to use or access them.
  - Static member: A part of a class that is accessible through the class and belongs to that class.
  - attribute or function/method not based on instance.
  - You call out the class directly without having to create an attribute.
  - If a method does not rely on instance members, it should be static. 
  - A function/method or attribute that has `static` prefix cannot contain instance members even if it's within the class. 