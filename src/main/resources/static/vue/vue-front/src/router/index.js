import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import PercentVue from '@/components/PercentVue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
	  path: '/vue/percent/view',
	  name: 'PercentVue',
	  component: PercentVue,
	  props: true
	}
  ]
})
