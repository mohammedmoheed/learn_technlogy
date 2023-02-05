// dom document object model

// 1) getElementById
const idtest = document.getElementById("try");
console.log(idtest);

//2) getElemntsByTagName
const h1 = document.getElementsByTagName("h1");
console.log(h1);

//3) getElemntsByClassName
const classtry = document.getElementsByClassName("classtry");
console.log(classtry);

//4) querySelector
const query = document.querySelector("#try");
console.log(query);

//4) querySelectorAll
const queryAll = document.querySelectorAll(".classtry");
console.log(queryAll);

// traverse dom

// childNode
const parent = document.querySelector("body");
console.log(parent.childNodes);

// parentNode
const child = document.querySelector("#try");
console.log(child.parentNode);

// nextElementSibling
const nextsibling = document.querySelector("#try");
console.log(nextsibling.nextElementSibling);

//previousElementSibling
const previousSibling = document.querySelector("#try");
console.log(previousSibling.previousElementSibling);

//manipulation
const id = document.querySelector("#try");
id.innerHTML = "hi i am modified id";
id.style.color = "red";
id.style.fontSize = "50px";
id.classList.add("idClass");
id.classList.add("idClass1");
id.classList.remove("idClass");

// creating new element

const listItems = document.createElement("li");
listItems.innerHTML = "list item 1";

const list = document.querySelector(".list");
list.append(listItems);

for (let i = 0; i < 5; i++) {
  const listItems1 = document.createElement("li");
  listItems1.innerHTML = `list ${i}`;

  const list1 = document.querySelector(".list");
  list1.appendChild(listItems1);
}

const subHeading = document.createElement("h5");
subHeading.innerHTML = "sub heading";
list.insertAdjacentElement("afterbegin", subHeading);
