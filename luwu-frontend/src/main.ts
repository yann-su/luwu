import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import 'ant-design-vue/dist/antd.css';
import Antd from 'ant-design-vue';
import axios from 'axios';
import * as Icons from '@ant-design/icons-vue';


axios.defaults.baseURL = process.env.VUE_APP_SERVER;

const app = createApp(App)
app.use(store).use(router).use(Antd).mount('#app')


//使用拦截器进行返回的日志输出。token验证信息
axios.interceptors.request.use(function (config){
    console.log('请求参数：',config);
    return config;
}, error => {
    return Promise.reject(error);
});
axios.interceptors.response.use(function (response){
    console.log('返回结果：',response);
    return  response;
},error => {
    return Promise.reject(error);
});

//使用全局图标
const icons : any = Icons
for (const i in icons){
    app.component(i, icons[i]);
}


console.log("环境：",process.env.NODE_ENV);
console.log("服务端：",process.env.VUE_APP_SERVER);