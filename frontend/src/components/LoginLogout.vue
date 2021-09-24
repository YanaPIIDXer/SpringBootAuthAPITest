<template>
    <div>
        <div v-if="!isLogin">
            <label>name:</label><input type="text" v-model="name" /><br />
            <label>password:</label><input type="password" v-model="password" /><br />
            <button>ログイン</button>
        </div>
        <div v-else>
            <button>ログアウト</button>
        </div>
    </div>
</template>

<script>
export default {
    name: "LoginLogout",
    data: function () {
        return {
            isLogin: false,
            name: "",
            password: ""
        };
    }
}
</script>
