pipeline {
    agent any
      tools {
        jdk 'Java 21'  // Utilisez ici le nom de l'installation Java 21 dans Jenkins
        maven 'Maven'  // Utilisez ici le nom de l'installation Maven dans Jenkins
    }
    stages {
        bat 'java -version'
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
