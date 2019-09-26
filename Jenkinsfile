node {
    
 
   stage('SCM Checkout') {
        
      git 'https://github.com/fallshimajer/jenkins_java_mvn'
       
   }
   stage('Compile-Package') {
       def MAVEN3 = tool name: 'maven-3', type: 'maven'
       sh "${MAVEN3}/bin/mvn package"
   }
 stage('deploy'){
  deploy adapters: [tomcat8(credentialsId: '77ff813b-142a-4ca5-93d1-5b2417567212', path: '', url: 'http://165.227.193.242:8080/')], contextPath: '/', war: 'target/*.war'
   }
 }
 
