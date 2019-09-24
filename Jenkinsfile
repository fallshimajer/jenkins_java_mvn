node {
 
   stage('SCM Checkout') {
        
      git 'https://github.com/fallshimajer/jenkins_java_mvn'
       
   }
   stage('Compile-Package') {
           sh 'mvn package'
   }
 stage('deploy'){
  deploy adapters: [tomcat9(credentialsId: '17e38e55-45e4-49fc-8144-6c0d901e9f12', path: '', url: 'http://165.227.193.242:8080/manager/html')], contextPath: 'appweb', war: '**./*.war'
}
