'use strict';

let result = 0;

module.exports = {
  plus: function(value) {
    result += value
  },
  minus: function(value) {
    result -= value
  },
  multiple: function(value) {
    result *= value
  },
  divide: function(value) {
    result /= value
  },
  getResult: function() {
    return result
  }
}