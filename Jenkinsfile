pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests=false clean package'
            }
            post {
                success {
                    echo 'Now Archiving...'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }

        stage('Deploy to staging') {
            steps {
                build job: 'deploy-to-staging'
            }
        }

        stage('FakeTest') {
            steps {
                echo 'Testing..'
            }
        }
        stage('FakeDeploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}