blackBox()
blackBox(0)
blackBox(1)
blackBox(-1)
blackBox(true)
blackBox(false)
blackBox(null)
blackBox(undefined)
blackBox("a")
blackBox("test")
blackBox([])
blackBox([1,2,3])
blackBox({})
blackBox({a:1})

const assert = require('chai').assert;

describe("Submission tests", function() {
  it("Did you open the box?", function() {
    assert(check(), "It's clamped shut!");
  });
});
