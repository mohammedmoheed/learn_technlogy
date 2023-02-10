// ES ecma script

// 1) let const
// var has function scope
// let and const and block scope
// var support hoisting let const not

// var age = 18;
// if (age >= 18) {
//   var drive = "elegible for driving";
// }

// console.log(drive); // o/p elegible for driving

// var age1 = 18;
// if (age1 >= 18) {
//   let drive1 = "elegible for driving";
// }

// console.log(drive1); // o/p Uncaught ReferenceError: drive1 is not defined

// 2) arrow functions
// dont support hoisting
// dont have its own context

function greet() {
  console.log("hello everyone");
}
greet();

const greet1 = () => {
  console.log("greet 1");
};
greet1();

// for single line we can use directly like below
const add = (a, b) => a + b;
console.log(add(1, 3));

// context of arrow function

const shop = {
  price: 100,
  buy: function () {
    const btn = document.getElementById("arrow");
    btn.addEventListener("click", function () {
      console.log(this); // this has context of object which is this button <button id="arrow">click me</button>
      console.log("i spent " + this.price); // o/p  i spent undefined
    });
  },
};
shop.buy();

// so thats why we use arrow function because it use context of its parent

const shop1 = {
  price: 100,
  buy: function () {
    const btn = document.getElementById("arrow1");
    btn.addEventListener("click", () => {
      console.log(this); // this has context of object which is this button <button id="arrow">click me</button>
      console.log("i spent " + this.price); // o/p  i spent undefined
    });
  },
};
shop1.buy();

//3) template literals
const fName = "mohammed";
const lName = "moheed";
// console.log(fName + " " + lName);

console.log(`${fName} ${lName} ${2 + 4}`);
// we can perform js expression

//4) enhanced object literals

const key = "name1";
const accesToken = "hfjdhsfhsjk";
const refreshToken = "hsdfjkhsdjhfddfd";
const product = {
  //computed property keys
  //   name: "mobile",
  [key]: "mobile", //   name1: "mobile",
  price: 100,

  // method defination shorthand
  //   hi: function () {
  //     console.log("hi");
  //   },

  hi() {
    console.log("hi");
  },

  //property shorthand
  //   accesToken: accesToken,
  //   refreshToken: refreshToken,
  accesToken,
  refreshToken,
};
console.log(product);
product.hi();

// 5) destructuring
const destructuring = {
  name: "moheed",
  age: 23,
};

const { name: name1, age } = destructuring;
console.log(name1);

const destArray = [1, 5, 6, 8, 7];
const [value1, , value3] = destArray;
console.log(value1, value3);

//6) default parameter
const register = (username, password, dp = "test.png") => {
  //   const pic = dp || "test.png";    old way
  console.log(username, password, dp);
};
register("moheed", "abcc");

//7) spread
const lang = ["c", "cpp", "js"];
const lang1 = ["html", ...lang, "css"];
console.log(lang1);

const obj = {
  a: 1,
  b: 2,
};
const obj1 = { ...obj, a: 3, c: 5 };
console.log(obj1);

// rest
const rest = (...numbers) => {
  console.log(numbers);
};
rest(1, 2, 8, 6, 7);

// for of loop
