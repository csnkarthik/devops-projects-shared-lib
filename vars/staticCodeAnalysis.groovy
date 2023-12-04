def call(credentialsId){    
    withSonarQubeEnv(credentialsId: credentialsId) {
        //sh 'mvn clear package sonar:sonar'
        sh 'mvn clear package org.sonarsource.scanner.maven:sonar-maven-plugin:RELEASE:sonar'
    }
}