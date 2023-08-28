<template>
    <div>
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
            // Exibir mensagem de erro
          }
        } catch (error) {
          // Lidar com erros de requisição
        }
      }
    }
  };
  </script>
  
  <style scoped>
  /* Estilos para o botão de logout */
  button {
    background-color: #333;
    color: #fff;
    padding: 0.5em;
    border: none;
    cursor: pointer;
  }
  </style>
  