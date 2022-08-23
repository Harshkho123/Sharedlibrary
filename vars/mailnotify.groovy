def call(){
   mail bcc: '', body: '''Hi All,
                Build is successful
                   Thank you''', cc: '', from: '', replyTo: '', subject: 'Jenkins Job Alerts', to: 'harshkhode786@gmail.com'
}
