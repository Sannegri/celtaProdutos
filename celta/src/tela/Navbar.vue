<template>
    <div>
      <router-link to="/cadastro">Cadastro de Produto</router-link>
      <router-link to="/listagem">Listagem de Produtos</router-link>
      <button @click="logout">Logout</button>
    </div>
  </template>
  
  <script>
  export default {
    methods: {
      async logout() {
        try {
          const response = await this.$axios.post('/api/logout');
          if (response.data.success) {
            this.$router.push('/login');
          } else {
          }
        } catch (error) {
        }
      }
    }
  };
  </script>
  