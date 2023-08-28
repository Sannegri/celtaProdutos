<script>
export default {
  data() {
    return {
      produto: {
        nome: '',
        fornecedor: '',
        valor: 0
      }
    };
  },
  methods: {
    async cadastrarProduto() {
      try {
        const response = await this.$axios.post('/api/produtos', this.produto);
        if (response.data.success) {
          // Exibir mensagem de sucesso
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
/* Estilos para o formulário de cadastro */
form {
  display: flex;
  flex-direction: column;
}

label {
  margin-top: 0.5em;
}

input {
  padding: 0.5em;
  margin-top: 0.2em;
}

button {
  background-color: #333;
  color: #fff;
  padding: 0.5em;
  border: none;
  cursor: pointer;
}
</style>
