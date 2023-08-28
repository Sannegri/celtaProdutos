import { createApp } from 'vue';
import { createRouter, createWebHistory } from 'vue-router';
import App from './App.vue';
import HomePage from './components/HomePage.vue'; // Um exemplo de componente

const routes = [
  { path: '/', component: HomePage },
  // ... outras rotas
];

const router = createRouter({
  history: createWebHistory(),
  routes
});

createApp(App).use(router).mount('#app');