// Hero class definition
class Hero {
  constructor(name = 'Hero') {
    this.name = name;       // Hero's name, default 'Hero'
    this.position = '00';   // Starting position
    this.health = 100;      // Health points
    this.damage = 5;        // Damage points
    this.experience = 0;    // Experience points
  }
}

// Example usage:
const defaultHero = new Hero();          // Hero with default name
const customHero = new Hero('Arthur');  // Hero with custom name

console.log(defaultHero);
// Output: Hero { name: 'Hero', position: '00', health: 100, damage: 5, experience: 0 }

console.log(customHero);
// Output: Hero { name: 'Arthur', position: '00', health: 100, damage: 5, experience: 0 }

const { assert } = require('chai');
describe('hero class', () => {
  it('should create a hero', () => {
    let myHero = new Hero();
    assert.instanceOf(myHero, Hero);
    assert.strictEqual(myHero.name, 'Hero', "Hero should have a 'name' attribute with value \"Hero\"");
    assert.strictEqual(myHero.experience, 0, "Hero should have an 'experience' attribute with value 0");
    assert.strictEqual(myHero.health, 100, "Hero should have a 'health' attribute with value 100");
    assert.strictEqual(myHero.position, '00', "Hero should have a 'position' attribute with value \"00\"");
    assert.strictEqual(myHero.damage, 5, "Hero should have a 'damage' attribute with value 5");
  });
  it('should use name argument', () => {
    assert.strictEqual(new Hero('Greg').name, 'Greg', "Hero Greg should have a 'name' attribute with value \"Greg\"");
  })
});