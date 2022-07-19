/**
 * 
 */
 
 const path = require('path')
 const VueLoaderPlugin = require('vue-loader/lib/plugin')
 
 module.exports = {
	//パスの基本パッケージを使って__dirname(現在ファイルのパス)を受け取る
	//[name]はentryでセットしたニックネームが何でも受け取る可変的な役割
	entry: {
		app: path.join(__dirname, 'main.js') //ニックネーム
	},
	//結果の設定
	output: {
		filename: '[name].js',
		path: path.join(__dirname, 'dist')
	},
	module: {
		rules: [
			{
				test: /\.vue$/,
				loader: 'vue-loader'
			}
		]
	},
	plugins: [
		new VueLoaderPlugin()
	]
}