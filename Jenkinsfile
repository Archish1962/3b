pipeline{
    agent any

    stages{
        stage('Checkout Code'){
            steps{
                git branch:'main', url:'https://github.com/Archish1962/3b.git'
            }
        }
        stage('Build and Test'){
            steps{
                bat 'mvn clean test'
            }
        }
    }
}