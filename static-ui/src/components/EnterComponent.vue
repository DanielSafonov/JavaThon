<template>
  <div>
    <a :href="createLinkByName('userMainPage')">Я участник</a>
    <br><a href="#">Я организтор</a>
  </div>
</template>

<script>
export default {
  name: 'EnterComponent',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  methods: {
    createLinkByName (name) {
      return 'http://localhost:8080/#/' + name
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
  margin-top: 10px;
}
</style>
