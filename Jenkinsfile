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
        stage('MVN PACKAGE') {
       steps{
           echo "packing the project";
           withMaven(maven: 'm3'){
            sh 'mvn package';
           }
           
       }
       post{
           success {
            archiveArtifacts 'target/*.jar';
           }
       }
    }
    
     stage('NEXUS') {
       steps{
           echo "Deploying the project";
           withMaven(maven: 'm3'){
            sh 'mvn spring-boot:run';
           }
           
       }
    }
    }
}