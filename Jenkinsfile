pipeline {
    agent any
    stages {
        stage('compile') {
            steps {
                withMaven(maven: 'm3'){
                    sh 'mvn clean install'
                }
                
            }
        }
    }
}