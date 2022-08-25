def call(){
 checkout([$class: 'GitSCM', branches: [[name: 'dev']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Harshkho123/hello-world.git']]])
}
