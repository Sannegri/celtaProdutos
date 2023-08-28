<template>
    <div>
      <table>
        <thead>
          <tr>
            <th>Nome do Produto</th>
            <th>Fornecedor</th>
            <th>Valor do Produto</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="product in products" :key="product.id">
            <td>{{ product.productName }}</td>
            <td>{{ product.supplier }}</td>
            <td>{{ product.productValue }}</td>
            <td>
              <button @click="editProduct(product.id)">Editar</button>
              <button @click="deleteProduct(product.id)">Remover</button>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        products: [] 
      };
    },
    methods: {
      editProduct(produtosId) {},
      deleteProduct(produtosId) {
      }
    }
  };
  </script>
  