'use strict';

let getmap = {}
let postmap = {}

module.exports = {
    get: function(path, f) {
        if (arguments.length == 2) {
            getmap[path] = f
        } else if (arguments.length == 1) {
            return getmap[path]
        }
    },
    post: function(path, f) {
        if (arguments.length == 2) {
            postmap[path] = f
        } else if (arguments.length == 1) {
            return postmap[path]
        }
    }
}