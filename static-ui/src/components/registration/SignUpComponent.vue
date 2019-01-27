<template>
  <form class="form-signin" @submit.prevent="signUp">
    <img class="logo mb-4" src="logo.png" alt="">
    <h1 class="h2 mb-3 font-weight-normal">Регистрация</h1>

    <input type="tel" name="phoneNumber" v-model="phoneNumber" class="form-control" placeholder="Номер телефона" required autofocus>
    <input type="text" name="firstName" v-model="firstName" class="form-control" placeholder="Имя" required autofocus>
    <input type="text" name="lastName" v-model="lastName" class="form-control" placeholder="Фамилия" required autofocus>
    <input type="text" name="email" v-model="email" class="form-control" placeholder="Email" required autofocus>
    <input type="password" name="password" v-model="password" class="form-control" placeholder="Пароль" required>
    <button class="btn btn-lg btn-secondary btn-block mb-4" type="submit">Регистрация</button>
    <p class="mt-5 mb-3 text-muted">&copy; 2019</p>
  </form>
</template>

<script>
export default {
  name: 'SignUpComponent',
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
    signUp () {
      console.log('requesting')
      this.axios.post('http://localhost:8081/registration', {
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
  .bd-placeholder-img {
    font-size: 1.125rem;
    text-anchor: middle;
  }
  @media (min-width: 768px) {
    .bd-placeholder-img-lg {
      font-size: 3.5rem;
    }
  }
  html,
  body {
    height: 100%;
  }
  body {
    display: -ms-flexbox;
    display: flex;
    -ms-flex-align: center;
    align-items: center;
    padding-top: 40px;
    padding-bottom: 40px;
    background-color: #f5f5f5;
  }
  .form-signin {
    width: 100%;
    max-width: 330px;
    padding: 15px;
    margin: auto;
  }
  .form-signin .checkbox {
    font-weight: 400;
  }
  .form-signin .form-control {
    position: relative;
    box-sizing: border-box;
    height: auto;
    padding: 10px;
    font-size: 16px;
  }
  .form-signin .form-control:focus {
    z-index: 2;
  }
  .form-signin input[type="email"] {
    margin-bottom: -1px;
    border-bottom-right-radius: 0;
    border-bottom-left-radius: 0;
  }
  .form-signin input[type="password"] {
    margin-bottom: 10px;
    border-top-left-radius: 0;
    border-top-right-radius: 0;
  }
  .logo{
    max-width: 200px;
    height: auto;
  }
</style>
