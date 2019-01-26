<template>
<div>
  <div v-if="hackCard !== null">
    HACK CARD HERE
  </div>
</div>
</template>

<script>
export default {
  name: 'HackCardComponent',
  props: {
    hackId: {
      type: Number
    }
  },
  data () {
    return {
      hackCard: Object
    }
  },
  methods: {
    getHackById () {
      this.axios.get('/getHackById', {
        selectedHackId: this.hackId
      }).then((response) => {
        console.log(response.data)
        this.hackCard = response.data
      })
    }
  },
  mounted () {
    this.getHackById()
  }
}
</script>

<style scoped>

</style>
