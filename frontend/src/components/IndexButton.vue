<template>
  <div>
    <button @click="onClick">認証不要API</button>
  </div>
</template>

<script>
import { get } from '../modules/APIConnection';

export default {
  name: 'IndexButton',
  methods: {
    onClick: async function () {
      var result = await get("");
      alert(result.message);
    }
  }
}
</script>

<style scoped>
</style>
