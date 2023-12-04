def call(credentialsId){
    
    withSonarQubeEnv(credentialsId: credentialsId) {
        sh 'mvn clear package sonar: sonar'
    }
    
}