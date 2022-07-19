<template>
	<div id="app">
		<AppHeader></AppHeader>
		<!-- router-viewタッグを使ったところにcomponentが出る -->
		<router-view></router-view>
		<AppFooter></AppFooter>
	</div>
</template>
<script>

import AppHeader from '@/layout/h';
import AppFooter from '@/layout/f';

export default{
	name: 'App',
	components: {
		AppHeader,
		AppFooter
	}
}
</script>