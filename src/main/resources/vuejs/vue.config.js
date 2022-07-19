//const { defineConfig } = require('@vue/cli-service')

const path = require("path");

module.exports = {
	devServer: {
		proxy: 'http://localhost:8765'
	},
	indexPath: '../../templates/vue/input.html',
	publicPath: '/vue',
	outputDir: path.resolve(__dirname, "../src/main/resources/static/vue")
}
//defineConfig({
	
	//ビルドターゲットのディレクトリ
	//outputDir: "../src/main/resources/static",
	//devServer: {
	//	proxy: {
			//'/api'に入ったらスプリングのサーバーに送する
	//		'/api': {
	//			target: 'http://localhost:8765',
	//			changeOrigin: true, //cross origin 許可
	//			exposedHeaders: ['Content-Disposition']
	//		}
	//	}
	//},
	//transpileDependencies: true
//});
