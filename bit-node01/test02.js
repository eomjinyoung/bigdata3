'use strict';

var f = require('./calc')

var result = f(10, 20)
console.log(result)

result = require('./calc')(100, 200)
console.log(result)