pipeline{

agent any
 
 stages{

 stage("SCM Check Out"){
     steps{
        git branch: 'main', credentialsId: 'githubpseshagiri', url: 'https://github.com/pseshagiri/microservice-devops.git'
     }    
 }
 stage("Gradle build"){
      steps{
         './gradlew clean package'
      }
     }
  
  stage("Test"){
       steps{
        echo 'Testing in Progress'
       }
  }
 }
 
}