<template>
  <div class="hello">
    <button v-on:click="greet">Hello!</button>
    <p> {{ message }} </p>

    <ul v-if="errors && errors.length">
      <li v-for="error of errors">
        {{error.message}}
      </li>
    </ul>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'HelloWorld',
  data() {
    return {
      message: "",
      errors: []
    }
  },
  methods: {
    greet: function () {
      axios.get(`http://localhost:9000/`)
      .then(response => {
        this.message = response.data
      })
      .catch(e => {
        this.errors.push(e)
      })
    } 
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
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
}
</style>
