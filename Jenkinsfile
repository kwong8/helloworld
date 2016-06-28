
 node ('oel7_s1-26bdfa2e') {
  stage 'Build and Test!!'
  checkout scm
  sh 'mvn -f pom.xml \
      -s /opt/apache-maven-3.1.0/conf/settings.xml \
      -gs /opt/apache-maven-3.1.0/conf/settings_global_jenkins.xml \
      -DBUILD_NUMBER_PREFIX=3.5.0 -Dkarma.disabled=true \
      -Dgrunt.disabled=true clean install -Dmaven.test.skip=true -e -U'
 }
