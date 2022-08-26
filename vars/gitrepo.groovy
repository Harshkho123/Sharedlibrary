def call(){
 checkout([$class: 'GitSCM', branches: [[name: 'patch-1']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Harshkho123/mahalogin.git']]])
}
