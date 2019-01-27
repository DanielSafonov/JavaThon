<template>
<div>
  <nav class="navbar navbar-expand-sm navbar-dark bg-success" style="margin-top: -64px; margin-bottom: 5%">
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
  <v-layout>
    <v-flex xs12 sm6 offset-sm3>
      <div v-if="allHacks.length !== 0">
        <v-hover v-for="hack in allHacks" :key="hack.hackId">

          <v-card slot-scope="{ hover }"
                  :class="`elevation-${hover ? 12 : 2}`"
                  style="margin-bottom: 4%">
            <v-img
              :src=hack.imageUrl
              aspect-ratio="2.75"
            ></v-img>

            <v-card-title primary-title>
              <div>
                <h3 class="headline mb-0">{{hack.name}}</h3>
                <div>{{hack.description}}</div>
              </div>
            </v-card-title>

            <v-card-actions>
              <v-spacer></v-spacer>
              <!--<router-link :to="{ name: 'hackCard', params: { hackIdParam: 2 }}">Подробнее</router-link>-->
              <v-btn @click="navigateToHack(hack.id)" flat color="green">Подробнее</v-btn>
            </v-card-actions>
          </v-card>
        </v-hover>
      </div>
      <div v-else>
        There are no events yet
      </div>
      <!--v-for-->
    </v-flex>
  </v-layout>
</div>
</template>

<script>

export default {
  name: 'MainPageComponent',
  data () {
    return {
      selectedHack: 0,
      allHacks: []
    }
  },
  methods: {
    getAllHacks () {
      this.axios.get('http://localhost:8081/api/hackathons').then((response) => {
        console.log(response.data)
        this.allHacks = response.data
      })
    },
    navigateToHack (id) {
      this.$router.push({name: 'hackCard', params: { hackIdParam: id }})
    }
  },
  mounted () {
    console.log('requesting')
    this.getAllHacks()
  }
}
</script>

<style scoped>

</style>
