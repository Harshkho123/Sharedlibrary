def call(){
  junit healthScaleFactor: 10.0, testResults: 'server/target/surefire-reports/*.xml'
}
