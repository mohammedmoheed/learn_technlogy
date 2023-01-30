// const lang = ["html", "css", "js"];

// lang.push("java"); // insert from last
// lang.pop(); // remove from last

// lang.unshift("go"); // insert from start
// lang.shift(); // remove from start

// console.log(lang);

const student = [
  {
    name: "moheed",
    rno: 1,
    marks: 60,
  },
  {
    name: "sameed",
    rno: 2,
    marks: 90,
  },
  {
    name: "saud",
    rno: 3,
    marks: 30,
  },
];

// for (let i = 0; i < student.length; i++) {
//   student[i].rno *= 10;
// }

// foreach loop
// student.forEach((i) => {
//   console.log(i.name);
// });

//for of loop
// for (let i of student) {
//   console.log(i);
// }

//filter to filter any condition
//it returns a new array
// const res = student.filter((i) => i.marks > 45);

// console.log(res);

//map
// we can combine two values and return as a new array
// const result = student.map((i) => {
//   return {
//     detail: `${i.rno} : ${i.name}`,
//   };
// });
// console.log(result);

//reduce
// we can accumulate value from array
// const result = student.reduce((acc, i) => {
//   acc += i.marks;
//   return acc;
// }, 0);
// console.log(result);
// console.log(student);

const admin = [5, 4, 9, 2];
const user = {
  name: "moheed",
  id: 1,
};

// index of return the index number which is present in arrray
// console.log(admin.indexOf(user.id));

// const isAdmin = admin.indexOf(user.id) > -1;

// include return true or false according element presrnt in aray or not

// const isAdmin = admin.includes(user.id);
// console.log(isAdmin);

const employee = [
  {
    name: "moheed",
    id: 1,
  },
  {
    name: "sameed",
    id: 2,
  },
  {
    name: "saud",
    id: 3,
  },
];

// // find is used to find element with certain conditions
// const res = employee.find((i) => {
//   return i.id === 1;
// });
// console.log(res);

// sort is used to sort element it sort string also
// const num = [4, 5, 9, 7, 2, 1];
// const res = num.sort();
// console.log(res);
// console.log(num);

// splice cut the element from index to how many element
// it modifies original array
const names = ["moheed", "saud", "sameed", "kashif"];
const res = names.splice(1, 1);
console.log(res);
console.log(names);
