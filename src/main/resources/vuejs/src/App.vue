<template>
	<div id="app">
		<AppHeader></AppHeader>
		<InputView></InputView>
		<!-- router-viewタッグを使ったところにcomponentが出る -->
		<router-view></router-view>
		<AppFooter></AppFooter>
	</div>
</template>
<script>

import AppHeader from '@/layout/ApplicationHeader';
import AppFooter from '@/layout/ApplicationFooter';
import InputView from '@/views/InputView';

export default{
	name: 'app',
	components: {
		AppHeader,
		InputView,
		AppFooter
	},
	data() {
		return{
		}
	}
}
</script>