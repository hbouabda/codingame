pipeline {
   agent any

   stages {
      stage('Compile') {
         steps {
            // Get some code from a GitHub repository
            echo "Compile Successfully"
            // To run Maven on a Windows agent, use
            // bat "mvn -Dmaven.test.failure.ignore=true clean package"
         }
      }
      
      stage('JUnit') {
         steps {
            // Get some code from a GitHub repository
            echo "JUnit Successfully"
            // To run Maven on a Windows agent, use
            // bat "mvn -Dmaven.test.failure.ignore=true clean package"
         }
      }
      
      stage('Quality-Gate') {
         steps {
            // Get some code from a GitHub repository
            echo "Quality-Gate Successfully"
            // To run Maven on a Windows agent, use
            // bat "mvn -Dmaven.test.failure.ignore=true clean package"
         }
      }
   }
}