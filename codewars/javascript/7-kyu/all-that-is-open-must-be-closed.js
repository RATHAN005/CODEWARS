function isBalanced(s, caps) {
  
  var i, stack = [];

  for (var c of s) {
    i = caps.indexOf(c);

    if (i === -1)
      continue;

    else if (stack.length && stack[0] === caps.lastIndexOf(c) - 1)
      stack.shift();
      
    else
      stack.unshift(i);
  }
  
  return !stack.length;
}
const { assert } = require('chai');

describe("Tests", () => {
  it("test", () => {
    assert.strictEqual(isBalanced("(Sensei says yes!)", "()"), true);
    assert.strictEqual(isBalanced("(Sensei says no!", "()"), false);

    assert.strictEqual(isBalanced("(Sensei [says] yes!)", "()[]"), true);
    assert.strictEqual(isBalanced("(Sensei [says) no!]", "()[]"), false);

    assert.strictEqual(isBalanced("Sensei says -yes-!", "--"), true);
    assert.strictEqual(isBalanced("Sensei -says no!", "--"), false);
  });
});
