<template>
    <div>
      <input v-model="productName" placeholder="Nome do Produto">
      <input v-model="supplier" placeholder="Fornecedor">
      <input v-model="productValue" placeholder="Valor do Produto">
      <button @click="registerProduct">Cadastrar</button>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        productName: '',
        supplier: '',
        productValue: ''
      };
    },
    methods: {
      async registerProduct() {
        if (this.productName && this.supplier && this.productValue) {
          try {
            const response = await this.$axios.post('/api/products', {
              productName: this.productName,
              supplier: this.supplier,
              productValue: this.productValue
            });
  
            if (response.data.success) {
            } else {
            }
          } catch (error) {
          }
        } else {
        }
      }
    }
  };
  </script>
  