import Vue from 'vue'
import Router from 'vue-router'
import EnterComponent from '@/components/EnterComponent'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: '',
      component: EnterComponent
    }
  ]
})
