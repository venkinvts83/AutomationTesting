pipeline
{
    agent any
    {
        stages {
        stage('Checkout Code') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/venkinvts83/AutomationTesting.git'  // 🔥 Replace with your repo
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                sh "mvn test"
            }
    }
}