import Vue from 'vue'
import Router from 'vue-router'
import EnterComponent from '@/components/EnterComponent'
import MainPageComponent from '@/components/MainPageComponent'
import HackCardComponent from '@/components/HackCardComponent'
import SignInComponent from '@/components/registration/SignInComponent'
import SignUpComponent from '@/components/registration/SignUpComponent'
import UserProfileComponent from '@/components/UserProfileComponent'
import 'vuetify/dist/vuetify.min.css'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: '',
      component: EnterComponent
    },
    {
      path: '/signin',
      name: 'Sign in',
      component: SignInComponent
    },
    {
      path: '/signup',
      name: 'Sign up',
      component: SignUpComponent
    },
    {
      path: '/userMainPage',
      name: 'Main Page',
      component: MainPageComponent
    },
    {
      path: '/hackCard',
      name: 'hackCard',
      component: HackCardComponent
    },
    {
      path: '/userProfile',
      name: 'userProfile',
      component: UserProfileComponent
    }
  ]
})
