DOGEscript language description

all variables are of type integer, integer array, or function
variable declarations:
much (varname) ==> declare int with name (varname)
many (varname)s ==> declare int[] with name (varname)s
arrays must have an s on the end of their name
they can be filled using the is operator and simply numbers in a row, the last two separated by and
example:

    many numbers is 1 2 4 3 and 5
to use an array index use get. a get can also be an lvalue

    much three 3
    much four
    four is get numbers three
    get numbers four is 10

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
*  say ==> print a string by getting the ascii value of the least significant byte of each integer in an array
*  show ==> print out an integer's numerical value
*  hear ==> make an integer array assigning each byte from the current line to one of the integers in the array
*  listen ==> parse the next integer from input
  

loops:
the only loop is a for loop. this iterates through an array with name (varname)s and puts the sequential elements into a variable named (varname)
syntax: each (varname) is

    each number is
      show number

