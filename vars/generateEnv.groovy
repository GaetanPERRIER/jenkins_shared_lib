def call() {

    withCredentials([
        string(credentialsId: "APP_ENV", variable: 'APP_ENV'),
        string(credentialsId: "APP_NAME", variable: 'APP_NAME'),
        string(credentialsId: "APP_PORT", variable: 'PORT')
    ]) {

        sh """
            cat > .env <<EOF
            APP_NAME=${APP_NAME}
            APP_ENV=${APP_ENV}
            PORT=${PORT}
            EOF
        """
    }
}