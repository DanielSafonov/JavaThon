<template>
<div>
  <v-layout>
    <v-flex xs12 sm6 offset-sm3>
      <div v-if="allHacks.length !== 0">
        <v-card v-for="(hack, index) in allHacks"
                :key="hack.hackId">
          <v-img
            src="http://mipt.ru/upload/iblock/794/1_02.png"
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
            <v-btn @click="openHackById(index)" flat color="green">Подробнее</v-btn>
          </v-card-actions>
        </v-card>
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
      this.axios.get('/getAllHack').then((response) => {
        console.log(response.data)
        this.allHacks = response.data
      })
    },
    openHackById (selectedHackId) {
      this.router.push({
        name: '',
        params: {
          hackId: selectedHackId
        }
      })
    },
    mounted () {
      this.getAllHacks()
    }
  }
}
</script>

<style scoped>

</style>
