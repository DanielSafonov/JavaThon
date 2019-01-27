<template>
<div>
  <nav class="navbar navbar-expand-sm navbar-dark bg-success" style="margin-top: -64px;">
    <a class="navbar-brand" href="#">SberHack</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample03" aria-controls="navbarsExample03" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExample03">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link" href="#">Главная</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Профиль</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Выход</a>
        </li>
      </ul>
      <form class="form-inline my-2 my-md-0">
        <input class="form-control" type="text" placeholder="Поиск">
      </form>
    </div>
  </nav>
  <main role="main">
    <div class="album py-4 bg-light">
      <div class="container">

        <div class="row">
          <div class="col-md-12">
            <div class="card shadow-sm">
              <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: Thumbnail"><title>Placeholder</title><rect fill="#55595c" width="100%" height="100%"/><text fill="#eceeef" dy=".3em" x="50%" y="50%">JavaThon</text></svg>
              <div class="card-body">
                <p class="card-text">Сбербанк — это не просто банк, а IT-компания, которая создает десятки полезных сервисов, упрощающих жизнь клиентов. Нам нужны новые идеи. Разработай веб-приложение, которое будет адаптировано под мобильную версию и решит одну из повседневных потребностей окружающих, а также принесет доход компании. Используй любое средство для верстки HTML и реализуй сервер с использованием spring. Ждем твою заявку до 25 января включительно.</p>
                <center>
                  <button type="button" class="btn btn-secondary btn-success mt-1">Принять участие</button>
                </center>
              </div>
            </div>
          </div>
        </div>

        <div class="row my-4">
          <div class="col-md-12">
            <div class="card shadow-sm">
              <div class="card-body">
                <h4>До конца хакатона</h4>
                <h1>09:10:12</h1>
              </div>
            </div>
          </div>
        </div>

        <div class="row my-4">
          <div class="col-md-12">
            <div class="card shadow-sm">
              <div class="card-body">
                <h4>Расписание</h4>
                <ul class="list-group list-group-flush my-4">
                  <li class="list-group-item"><b>14:00</b> - сбор участников</li>
                  <li class="list-group-item active"><b>14:30-15:00</b> - регистрация</li>
                  <li class="list-group-item"><b>15:00-16:00</b> - разбор задач</li>
                  <li class="list-group-item"><b>16:00-17:00</b> - перекус</li>
                </ul>
              </div>
            </div>
          </div>
        </div>

        <div class="row my-4">
          <div class="col-md-12">
            <div class="card shadow-sm">
              <div class="card-body">
                <h4>Материалы</h4>
                <ul my-4>
                  <li><a class="card-text" href="#">Задание</a></li>
                  <li><a class="card-text" href="#">Шаблон презентации</a></li>
                </ul>
              </div>
            </div>
          </div>
        </div>

        <div class="row my-4">
          <div class="col-md-12">
            <div class="card shadow-sm">
              <div class="card-body">
                <h4>Документы</h4>
                <ul py-4>
                  <li><a class="card-text" href="#">Регламент</a></li>
                  <li><a class="card-text" href="#">Договор о неразглашении</a></li>
                </ul>
              </div>
            </div>
          </div>
        </div>

        <div class="row my-4">
          <div class="col-md-12">
            <div class="card shadow-sm">
              <div class="card-body">
                <h4>Карта мероприятия</h4>
              </div>
              <svg class="bd-placeholder-img card-img-top mt-n2" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: Thumbnail"><title>Placeholder</title><rect fill="#55595c" width="100%" height="100%"/><text fill="#eceeef" dy=".3em" x="50%" y="50%">Карта</text></svg>
            </div>
          </div>
        </div>
      </div>
    </div>
  </main>
</div>
</template>

<script>

export default {
  name: 'HackCardComponent',
  data () {
    return {
      hackId: 0,
      userId: 1,
      hackCard: Object
    }
  },
  methods: {
    getHackById () {
      this.axios.get('http://localhost:8081/api/hackathons/' + this.hackId, {
      }).then((response) => {
        console.log(response.data)
        this.hackCard = response.data
      })
    },
    joinToHack (hackId, userId) {
      this.axios.get('http://localhost:8081/api//' + this.hackId, {
      }).then((response) => {
        console.log(response.data)
        this.hackCard = response.data
      })
    }
  },
  created () {
    this.hackId = this.$route.params.hackIdParam
    this.getHackById()
    // get request here
    let hackInfo = {
      name: 'JavaThon',
      place: 'Москва, Кутузовский проспект 32к1',
      time: '14.00',
      fullDescription: 'Сбербанк — это не просто банк, а IT-компания, которая создает десятки полезных сервисов, упрощающих жизнь клиентов. Нам нужны новые идеи. Разработай веб-приложение, которое будет адаптировано под мобильную версию и решит одну из повседневных потребностей окружающих, а также принесет доход компании. Используй любое средство для верстки HTML и реализуй сервер с использованием spring. Ждем твою заявку до 25 января включительно.',
      prizePool: 300000
    }
    this.hackCard = hackInfo
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
</style>
