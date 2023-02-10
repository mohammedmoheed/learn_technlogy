//local miodule
function register(name) {
  console.log(`user ${name} is registerd`);
}

const login = function (name) {
  console.log(`user ${name} is login`);
};

module.exports = {
  register,
  login,
};
