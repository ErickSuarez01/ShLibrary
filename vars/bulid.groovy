def build(){
 echo "Building java project"
  sh '''
  mvn clean install
  '''
}
