<template>
  <div class="container">
    <h1 class="well">Авторизация</h1>
    <div class="col-lg-12 well">
      <div class="row">
        <form @submit.prevent="onSubmit">
          <!--<input type="hidden" name="_csrf" value="{{_csrf.token}}" />-->
          <div class="col-sm-12" >
            <div class="row">
              <div class="col-sm-6 form-group">
                <label>Логин</label>
                <input type="text" v-model="username" placeholder="Введите логин"  class="form-control" name="username">
              </div>
            </div>
            <div class="form-group">
              <label>Пароль</label>
              <input type="password" v-model="password" placeholder="Введите пароль" class="form-control">
            </div>
            <button type="button" class="btn btn-lg btn-info">Submit</button>
          </div>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'SignInComponent',
  data () {
    return {
      phoneNumber: '',
      password: ''
    }
  },
  methods: {
    onSubmit () {
      this.axios.post('/login', {
        phoneNumber: this.phoneNumber,
        password: this.password
      }).then((response) => {
        console.log(response.data)
      })
    }
  }
}
</script>

<style scoped>

</style>
