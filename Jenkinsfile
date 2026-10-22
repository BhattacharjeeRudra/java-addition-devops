pipeline {
    agent any

    triggers {
        pollSCM('H/5 * * * *')
    }

    tools {
        jdk 'JDK21'
        maven 'Maven310'
    }

    options {
        skipDefaultCheckout(true)
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }
}