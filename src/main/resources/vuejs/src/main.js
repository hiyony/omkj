import Vue from 'vue'
import App from './App.vue'
//import router from './routes'
import { createRouter, createWebHistory } from 'vue-router'

import HomePage from './components/Home.vue'
import PercentResult from './components/Percent.vue'

Vue.config.productionTip = false

const routes = [
	{
		path: '/home',
		component: HomePage
	},
	{
		path: '/percent',
		component: PercentResult
	}
]

const router = createRouter({
	history: createWebHistory(),
	routes
})

//routerを作って、どんなURLを使うか、それぞれのURLにどんなcomponentを呼び出すかを設定する
new Vue({
	el: '#app',
	router,
	render: h => h(App)
}).$mount('#app') //vue appがrouterを使うようにする
