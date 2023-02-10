//core module

// fs file system

const path = require("path");
const fs = require("fs");

// make a directory

// fs.mkdir(path.join(__dirname, "/test"), (err) => {
//   if (err) {
//     throw err;
//   } else {
//     console.log("folder created...");
//   }
// });

// fs.writeFile(path.join(__dirname, "/test", "test.txt"), "hi ", (err) => {
//   if (err) {
//     throw err;
//   } else {
//     console.log("file created...");
//     fs.appendFile(
//       path.join(__dirname, "/test", "test.txt"),
//       "\n hello ",
//       (err) => {
//         if (err) {
//           throw err;
//         } else {
//           console.log("data added...");
//         }
//       }
//     );
//   }
// });

// fs.readFile(path.join(__dirname, "/test", "test.txt"), "utf-8", (err, data) => {
//   // const content = Buffer.from(data).toString();
//   if (err) {
//     throw err;
//   } else {
//     console.log(data);
//   }
// });

// os module
const os = require("os");
// console.log(os.type()); // linux

// console.log(os.platform()); //linux

// console.log(os.arch()); //x64

// console.log(os.cpus()); /// cpu detail

// console.log(os.uptime()); // restart time
