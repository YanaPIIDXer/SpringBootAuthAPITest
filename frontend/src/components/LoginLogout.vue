<template>
    <div>
        <div v-if="!isLogin">
            <label>name:</label><input type="text" v-model="name" /><br />
            <label>password:</label><input type="password" v-model="password" /><br />
            <button @click="login">ログイン</button>
        </div>
        <div v-else>
            <button @click="logout">ログアウト</button>
        </div>
    </div>
</template>

<script>
import conn from '../modules/BasicConnection';

export default {
    name: "LoginLogout",
    data: function () {
        return {
            isLogin: false,
            name: "",
            password: ""
        };
    },
    methods: {
        login: async function () {
            let params = new URLSearchParams();
            params.append("name", this.name);
            params.append("password", this.password);
            const response = await conn.post("http://localhost:3000/auth/login", params);
            if (response.status != 200) {
                alert("ログインに失敗しました");
                return;
            }
            this.isLogin = true;
        },
        logout: async function () {
            const response = await conn.get("http://localhost:3000/auth/logout");
            if (response.status != 200) {
                alert("ログアウトに失敗しました");
                return;
            }
            this.isLogin = false;            
        }
    }
}
</script>
