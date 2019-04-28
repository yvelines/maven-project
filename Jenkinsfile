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
        }

        stage('FakeBuild') {
            steps {
                echo 'Building..'
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