
 node ('oel7_s1-26bdfa2e') {
  stage 'Build and Test!!'
  env.PATH = "${tool 'Maven 3'}/bin:${env.PATH}"
  checkout scm
  sh 'mvn clean package'
 }
