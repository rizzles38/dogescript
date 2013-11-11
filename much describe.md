DOGEscript language description

import statements start with such and end with a filename to import
the import section must end with wow

all variables are of type integer, integer array, or function
variable declarations:
much (varname) ==> declare int with name (varname)
many (varname)s ==> declare int[] with name (varname)s
arrays must have an s on the end of their name
they can be filled using the is operator and simply numbers in a row, the last two separated by and
characters in single quotes and strings in double quotes also work
example:

    many numbers is 1 2 4 3 and 5
    many helloworlds is "Hello World"
    many swag is 's''w''a' and 'g'
to use an array index use get. a get can also be an lvalue

    much three is 3
    much four
    four is get numbers three
    get numbers four is 10

the functions give and take work like push and pop, poop is dequeue

    give numbers 6
    much one is poop numbers
    much six is take numbers

function declarations start with wow and end when the code is not indented as much
for example:

    wow much out multiply much one much two is
      out is one times two

the function name is multiply and its return value is an integer named out with two integer arguments named one and two
to call it simply have the all the return values followed by is followed by the function name followed by arguments
example:

    much three is 3
    much four is 4
    much twelve is multiply three four

functions can have multiple simultaneous return values

operators:
*  is ==> assignment
*  plus ==> add
*  minus ==> subtract
*  times ==> multiply
*  over ==> divide
*  speak ==> print a string by getting the ascii value of the least significant byte of each integer in an array
*  show ==> print out an integer's numerical value
*  hear ==> make an integer array assigning each byte from the current line to one of the integers in the array
*  listen ==> parse the next integer from input
  

loops:
the only loop is a for loop. this iterates through an array with name (varname)s and puts the sequential elements into a variable named (varname)
syntax: each (varname) is

    each number is
      show number
conditionals:
the keyword is when

    when number is 5
      say "NUMBER IS 5"
I will eventually add support for loading c functions and libraries to allow dogescript to be useful (hint: you will only be allowed to send integers between c and doge)

