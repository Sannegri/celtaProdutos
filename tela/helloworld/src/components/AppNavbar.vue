<template>
  <div>

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
