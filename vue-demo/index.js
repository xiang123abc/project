

var app = new Vue({
    el: '#app', // app3 error
    data: {
      message: 'Hello Vue.js!',
      seen: true,
      todos:[
          { text:"AAA"},
          { text:"BBB"},
          { text:"CCC"}
      ]
    },
    methods: {
      reverseMessage: function(){
        this.message = this.message.split('').reverse().join('')
      }
    }
})

Vue.component('todo-item',{
   // todo-item 组件现在接受一个
  // "prop"，类似于一个自定义 attribute。
  // 这个 prop 名为 todo。
  props:['todo'],
  template:'<li>{{todo.text}}</li>'
})

var app2 = new Vue({
     el:'#app-2',
     data:{
        groceryList: [
            { id: 0, text: '蔬菜' },
            { id: 1, text: '奶酪' },
            { id: 2, text: '随便其它什么人吃的东西' }
          ]
     }
})