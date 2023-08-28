<template>
    <div class="home">
      <h2>Cadastro de Produto</h2>
      <form @submit.prevent="cadastrarProduto" class="form">
        <div class="form-group">
          <label for="productName">Nome do Produto:</label>
          <input type="text" id="productName" v-model="produto.nome" required>
        </div>
        <div class="form-group">
          <label for="supplier">Fornecedor:</label>
          <input type="text" id="supplier" v-model="produto.fornecedor" required>
        </div>
        <div class="form-group">
          <label for="productValue">Valor do Produto:</label>
          <input type="number" id="productValue" v-model="produto.valor" step="0.01" required>
        </div>
        <button type="submit">Cadastrar</button>
      </form>
  
      <h2>Listagem de Produtos</h2>
      <table class="table">
        <thead>
          <tr>
            <th>Nome do Produto</th>
            <th>Fornecedor</th>
            <th>Valor do Produto</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="(produto, index) in produtosCadastrados" :key="index">
            <td>{{ produto.nome }}</td>
            <td>{{ produto.fornecedor }}</td>
            <td>{{ produto.valor }}</td>
            <td>
              <button @click="editarProduto(index)">Editar</button>
              <button @click="removerProduto(index)">Remover</button>
            </td>
          </tr>
        </tbody>
      </table>
  
      <div class="logout">
        <button @click="logout">Logout</button>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        produto: {
          nome: '',
          fornecedor: '',
          valor: 0
        },
        produtosCadastrados: [] // Aqui serão armazenados os produtos cadastrados
      };
    },
    methods: {
      cadastrarProduto() {
        this.produtosCadastrados.push({ ...this.produto });
        this.limparFormulario();
      },
      editarProduto(index) {
        // Simular edição do produto (substitua por sua lógica real)
        this.produto = { ...this.produtosCadastrados[index] };
        this.produtosCadastrados.splice(index, 1);
      },
      removerProduto(index) {
        this.produtosCadastrados.splice(index, 1);
      },
      limparFormulario() {
        this.produto.nome = '';
        this.produto.fornecedor = '';
        this.produto.valor = 0;
      },
      logout() {
        // Implemente a lógica para realizar o logout
      }
    }
  };
  </script>
  
  <style scoped>
  /* Estilos para o componente HomePage */
  .home {
    max-width: 800px;
    margin: 0 auto;
    padding: 20px;
    text-align: center;
  }
  
  .form {
    display: inline-block;
    margin-right: 20px;
  }
  
  .form-group {
    margin-bottom: 10px;
  }
  
  .table {
    width: 100%;
    margin-top: 20px;
    border-collapse: collapse;
  }
  
  .table th, .table td {
    padding: 10px;
    border: 1px solid #ccc;
  }
  
  .logout {
    margin-top: 20px;
  }
  
  button {
    padding: 5px 10px;
    margin: 5px;
    border: none;
    cursor: pointer;
    background-color: #333;
    color: white;
  }
  </style>
  