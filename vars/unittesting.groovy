def call() {
    echo "Testing the application..."
   junit healthScaleFactor: 10.0, testResults: 'server/target/surefire-reports/TEST-com.example.TestGreeter.xml'
} 
