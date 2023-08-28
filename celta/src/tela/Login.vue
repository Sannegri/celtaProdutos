<template>
    <div>
      <input v-model="user" placeholder="User">
      <input v-model="password" type="password" placeholder="Password">
      <button @click="login">Login</button>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        user: '',
        password: ''
      };
    },
    methods: {
      async login() {
        try {
          const response = await this.$axios.post('/api/login', {
            user: this.user,
            password: this.password
          });
  
          if (response.data.success) {
            this.$router.push('/cadastro');
          } else {
          }
        } catch (error) {
        }
      }
    }
  };
  </script>
  