// 객체 생성 및 객체에 프로퍼티(변수 및 함수) 추가 
// 방법 1: 
var obj = new Object();
obj.v1 = 100;
obj.f1 = function() {
    console.log('hello')
};

console.log(obj.v1);
obj.f1();
console.log('----------------------------');

// 방법 2:
var obj2 = {
    v1 : 200,
    f1 : function() {
        console.log('hello2');
    }
};

console.log(obj2.v1);
obj2.f1();
console.log('----------------------------');

// 방법 3:
var obj3 = {
    v1 : 300,
    f1 : () => {
        console.log('hello3');
    }
};

console.log(obj3.v1);
obj3.f1();
console.log('----------------------------');

// 방법 4:
var obj4 = {
    v1 : 400,
    f1() {
        console.log('hello4...1');
    },
    f2() {
        console.log('hell4...2')
    }
};

console.log(obj4.v1);
obj4.f1();
obj4.f2();
console.log('----------------------------');

// 방법 5:
function f1() {
    console.log('hello5...1');
}
function f2() {
    console.log('hell5...2')
}
var obj5 = {
    v1 : 500,
    f1,
    f2,
};

console.log(obj5.v1);
obj5.f1();
obj5.f2();
console.log('----------------------------');

// 방법 6:
const m1 = function() {
    console.log('hello6...1');
};
const m2 = function() {
    console.log('hell6...2')
};
var obj6 = {
    v1 : 600,
    m1,
    m2,
};

console.log(obj6.v1);
obj6.m1();
obj6.m2();
console.log('----------------------------');

// 방법 7:
const x1 = () => {
    console.log('hello7...1');
};
const x2 = () => {
    console.log('hell7...2')
};
var obj7 = {
    v1 : 700,
    x1,
    x2,
};

console.log(obj7.v1);
obj7.x1();
obj7.x2();
console.log('----------------------------');