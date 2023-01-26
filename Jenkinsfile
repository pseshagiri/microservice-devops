pipeline{

agent any
 

 triggers{
    scmPoll * * * * *
 }
 stages{
 
  stage ("build"){
     git branch: 'main', credentialsId: 'githubpseshagiri', url: 'https://github.com/pseshagiri/microservice-devops.git'
    sh './gradle assemble'
  }
  stage("Test"){
    echo 'Testing in Progress'
  }
 
 }
}