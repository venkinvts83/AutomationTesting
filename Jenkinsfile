pipeline
{
    agent any

    stages {
        stage('Checkout Code')
        {
            steps {
                git branch: 'master',
                    url: 'https://github.com/venkinvts83/AutomationTesting.git'  // 🔥 Replace with your repo
            }
        }


        stage('Build')
        {
            steps {
                bat "mvn clean compile"
            }
        }

        stage('Run Tests')
        {
            steps {
                bat "mvn test"
               }
        }
    }
    post {
        always {
            // Publish JUnit results (Surefire/Testrunner XMLs)


            // Publish Cucumber HTML report
            publishHTML(target: [
                reportDir: 'target/cucumber-reports',
                reportFiles: 'cucumber.html',
                reportName: 'Cucumber HTML Report'
            ])

            // Archive JSON report so you can download it

        }
    }
}