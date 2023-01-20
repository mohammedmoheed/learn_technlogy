// js is loosely typed language

/* 
JavaScript has 8 Datatypes
1. String
2. Number
3. Bigint
4. Boolean
5. Undefined
6. Null
7. Symbol
8. Object

The Object Datatype
The object data type can contain:

1. An object
2. An array
3. A date
 */

// Numbers:
let length = 16;
let weight = 7.5;

// Strings:
let color = "Yellow";
let lastName = "Johnson";

// Booleans
let x = true;
let y = false;

//undefined
let example = undefined;

//bigint
// if the value goes above max safe integer then calculation will be wrong so bigint introduced
// limit is 2 ** 53 - 1  == Number.MAX_SAFE_INTEGER

// Object:
const person = { firstName: "John", lastName: "Doe" };

// Array object:
// in js array we can store different type also
// in js array is also an object
const cars = ["Saab", "Volvo", "BMW", 1, 2, { key: "value" }];

// Date object:
const date = new Date("2022-03-25");
