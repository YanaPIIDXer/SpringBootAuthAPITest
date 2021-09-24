<template>
  <div>
    <button @click="onClick">要認証API</button>
  </div>
</template>

<script>
import { get } from '../modules/APIConnection';

export default {
  name: 'AuthIndexButton',
  methods: {
    onClick: async function () {
      var result = await get("auth/index");
      if (result == null) { return; }
      alert(result.message);
    }
  }
}
</script>

<style scoped>
</style>
