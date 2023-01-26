pipeline{

agent any

 triggers{
    scmPoll * * * * *
 }
 stages{
 
  stage ("build"){
    sh './gradle assemble'
  }
  stage("Test"){
    echo 'Testing in Progress'
  }
 
 }
}