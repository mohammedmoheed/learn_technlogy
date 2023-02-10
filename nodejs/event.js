// event module

const Emmitter = require("events");

class Auth extends Emmitter {
  register(user) {
    console.log(`${user} registered successfuly`);
    // supose we have to send email to user after registeraions
    // we can write logic of sending of email here but it is not a good practice
    this.emit("registered", user);
  }
}

const auth = new Auth();

// so here we can performe many functuion after registered event triggered
auth.on("registered", (data) => {
  console.log(`sendng mail to ${data}`);
});
auth.register("moheed");
