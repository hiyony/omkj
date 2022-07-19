import Vue from 'vue'
import App from './App.vue'
//import router from './routes'

Vue.config.productionTip = false

//routerを作って、どんなURLを使うか、それぞれのURLにどんなcomponentを呼び出すかを設定する
new Vue({
	//router
	render: h => h(App)
}).$mount('#app') //vue appがrouterを使うようにする
