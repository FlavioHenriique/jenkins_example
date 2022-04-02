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
            sh 'mvn  deploy:deploy-file -DgroupId=io.github -DartifactId=jenkinstest -Dversion=1.0 -DgeneratePom=true -Dpackaging=jar -DrepositoryId=deploymentRepo -Durl=http://localhost:8080/ -Dfile=target/jenkinstest-1.0.jar ';
           }
           
       }
    }
    }
}