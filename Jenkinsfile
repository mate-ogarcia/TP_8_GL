pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                // Cloner le dépôt GitHub
                git url: 'https://github.com/mate-ogarcia/TP_8_GL.git'
            }
        }
        stage('Build with Maven') {
            steps {
                // Exécuter Maven pour compiler le projet
                sh 'mvn clean package'
            }
        }
    }
    post {
        success {
            echo 'Build successful!'
        }
        failure {
            echo 'Build failed.'
        }
    }
}
