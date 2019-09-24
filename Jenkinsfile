node {
 
   stage('Build') {
        
      dir ('myproject') {
            sh 'mvn clean install test'
      } 
       
   }
   stage('Archive') {
           dir ('myproject/target') {
           archive '*.jar'
      } 
      
   }   
}
