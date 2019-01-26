<template>
  <div class="container">
    <div class="col-lg-12 well">
      <h1 class="well">Регистрация</h1>
      <div class="row">
        <form @submit.prevent="onSubmit">
          <!--<input type="hidden" name="_csrf" value="{{_csrf.token}}" />-->

          <div class="col-sm-12" >
            <div class="row">
              <div class="col-sm-6 form-group">
                <label>Имя</label>
                <input type="text" v-model="firstName" placeholder="Введите имя" class="form-control" name="firstname">
              </div>
              <div class="col-sm-6 form-group">
                <label>Фамилия</label>
                <input type="text" v-model="lastName" placeholder="Введите фамилию" class="form-control" name="lasthame">
              </div>
            </div>

            <div class="form-group">
              <label>Номер телефона</label>
              <input type="tel" v-model="phoneNumber" placeholder="Введите номер телефона" class="form-control" name="username">
            </div>
            <div class="form-group">
              <label>Email</label>
              <input type="text" v-model="email" placeholder="Введите email" class="form-control" name="email">
            </div>
            <div class="form-group">
              <label>Пароль</label>
              <input type="password" v-model="password" placeholder="Введите пароль" class="form-control" name="password">
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
      firstName: '',
      lastName: '',
      email: '',
      password: ''
    }
  },
  methods: {
    onSubmit () {
      this.axios.post('/registration', {
        phoneNumber: this.phoneNumber,
        firstName: this.firstName,
        lastName: this.lastName,
        email: this.email,
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
