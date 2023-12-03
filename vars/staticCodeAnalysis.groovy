def call(){
    sh 'mvn clear package sonar: sonar'
}