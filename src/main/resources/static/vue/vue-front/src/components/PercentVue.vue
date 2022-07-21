<template>
	<div id="app">
		<h4>統計リストが出力します！</h4>
		→ 画面出力<br> 
		<table border="1">
		<tr>
			<th>運勢名</th>
			<th>運勢数</th>
			<th>割合</th>
		</tr>
		<tr v-for="res in list">
			<td>{{ res.fortunename }}</td>
			<td>{{ res.fortunecount }}回</td>
			<td>{{ res.totalpercent }}%</td>
		</tr>
		</table>
	</div>
</template>
<script>
export default{
	name: "PercentVue",
	data: () => ({
		list: []
	}),
	mounted(){
		const el = this
		this.axios.get("/vue/percent")
			.then(response => {
				el.list = response.data
			})
	},
	methods: {
	}
}
</script>
<style scoped>
#app{
	text-align: center;
	background-color: purple;
}
</style>