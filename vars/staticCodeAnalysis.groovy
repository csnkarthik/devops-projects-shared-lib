def call(credentialsId){    
    withSonarQubeEnv(credentialsId: credentialsId) {
        sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:RELEASE:sonar'
    }
}