<template>
  <div>
    <index-button />
    <login-logout />
    <auth-index-button />
  </div>
</template>

<script>
import IndexButton from './components/IndexButton';
import LoginLogout from './components/LoginLogout';
import AuthIndexButton from './components/AuthIndexButton';

export default {
  name: 'App',
  components: {
    IndexButton,
    LoginLogout,
    AuthIndexButton
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
