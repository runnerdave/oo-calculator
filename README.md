# OO design of calculator

OO design practice of a calculator for arithmetic and trigonometric functions.

# Problem statement

"Our pretended company" manufactures calculators. A new calculator is being developed and below is the image of the prototype.
The development team is agile team and adopts XP development methodology. The application will be written in Java. 
The final product will be able to support more complex operations such as trigonometric functions 
(sine, co- sine, tangent and their reciprocals), calculus (integrals and derivatives) as well as logarithmic functions. 

## Iteration 1 Story 
In this iteration (the first iteration), you are going to implement some basic arithmetic operations in the calculator firmware. 
To allow QA team to test the calculator, you need to write a command line Java program to take the inputs as arguments. 

## Acceptance Criteria: 
1. Application user enters Operand Operation Operand as the java program arguments and then will get a result as output 

## Details: 
1. The acceptable Operation: +, -, * or / 
2. The acceptable Operands: [0-9]+[.]?[0-9]* 
3. No thousand separator (,) is required in outputs 
4. Print the result to the console 

## Development Notes: 
1. The assessment will focus on object oriented design and whether the implementation is extensible. 
If all implementations are in one or two class, the assessment would be failed straightway. 
2. All work must be done using a TDD approach.
3. Stories to build sine and cosine functions are scheduled in the next iteration.

# Solution

In this solution an OO approach has been used including Strategies for validation and operations, as well as a Controller
to coordinate the actions.

Iteration 2 has also been implemented, allowing the design to implement Binary (+,-,*,/) and Unary (cos, sin) operations 
to demonstrate extensibility of the design, in doing so, operations for addition, subtraction, multiplication and division
are permitted to run with one operand as well.

Extensibility would then require changes to the controller and the validation rules only.

# Build
``$mvn clean package``

# Run

``java -jar target\calculator-2.0-SNAPSHOT-jar-with-dependencies.jar OPERAND OPERATION OPERAND``

Examples:

``java -jar target\calculator-2.0-SNAPSHOT-jar-with-dependencies.jar 1 - 2``

  ``-1.0``


``java -jar target\calculator-2.0-SNAPSHOT-jar-with-dependencies.jar sin 3``

``  0.1411200080598672``


``java -jar target\calculator-2.0-SNAPSHOT-jar-with-dependencies.jar 3 3 4``

``  operation is not valid!``


``java -jar target\calculator-2.0-SNAPSHOT-jar-with-dependencies.jar + 2``
  ``4.0``
