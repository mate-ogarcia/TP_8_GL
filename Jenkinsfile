pipeline {
    agent any
    stages {
        stage('Check Java Version') {
            steps {
                // Vérifier la version de Java
                bat 'java -version'
            }
        }
        stage('Clone Repository') {
            steps {
                // Cloner le dépôt GitHub
                git url: 'https://github.com/mate-ogarcia/TP_8_GL.git'
            }
        }
        stage('Build with Maven') {
            steps {
                // Exécuter Maven pour compiler le projet
                bat 'mvn clean package'
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
