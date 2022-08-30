def call() {
  sh 'docker build -t ${Image_name} .'
  sh 'docker run --name ${Container_name} -d -p ${port}:8080 ${Image_name}'
} 
