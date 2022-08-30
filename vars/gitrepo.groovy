def call(){
 checkout([$class: 'GitSCM', branches: [[name: '${git_branch}']], extensions: [], userRemoteConfigs: [[url: '${Git_url}']]])
}
