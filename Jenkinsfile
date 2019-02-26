pipeline{
  agent any

  stages {
  stage(Tasks){
    steps{
        bat 'gradlew tasks'
        }
  }
  stage('Build'){
    steps{
        echo 'Build in progress'
        script {
            node {
                git 'https://github.com/kumarp777804/AndroidJenkins.git'
                bat 'gradlew clean'
                archive '**/*app-debug.apk'
                }
            }
        }
  }
  }


}