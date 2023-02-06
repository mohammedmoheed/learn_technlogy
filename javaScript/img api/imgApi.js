const root = document.querySelector(".root");

function createItem(items) {
  // card
  const card = document.createElement("div");
  card.className = "card";

  // title
  const title = document.createElement("h4");
  title.innerHTML = items.title;

  //img
  const img = document.createElement("img");
  img.src = items.url;
  img.style.width = "200px";

  //apend
  card.appendChild(title);
  card.appendChild(img);
  root.appendChild(card);
}

function displayImage(items) {
  items.forEach((item) => {
    createItem(item);
  });
}

const btn = document.querySelector("#btn");
btn.addEventListener("click", function () {
  fetch("https://jsonplaceholder.typicode.com/albums/1/photos")
    .then((res) => res.json())
    .then((items) => {
      displayImage(items);
    });
});
