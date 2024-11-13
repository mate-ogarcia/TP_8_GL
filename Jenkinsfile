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
        stage('Test') {
                    steps {
                        sh 'mvn test'
                    }
                }
    }
    post {
        success {
            echo 'Build and tests successful!'
            junit 'target/surefire-reports/*.xml' // Chemin par défaut où Maven enregistre les résultats des tests
        }
        failure {
            echo 'Build or tests failed.'
            junit 'target/surefire-reports/*.xml' // Même si le build échoue, publier les rapports
        }
    }
}
