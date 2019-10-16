#!groovy

node {
   stage 'Compilar'
   
   echo 'Configurando variables'
   def mvnHome = tool 'M3'
   env.PATH = "${mvnHome}/bin:${env.PATH}"
   echo "var mvnHome='${mvnHome}'"
   echo "var env.PATH='${env.PATH}'"
   
   echo 'Descargando código de SCM'
   bat 'del -rf * /Q'
   checkout scm
  
   echo 'Compilando aplicacion...'
   bat 'mvn clean compile'

   stage 'Instalar'
   echo 'Instala el paquete generado en el repositorio maven'
   bat 'mvn install -Dmaven.test.skip=true'
   
  stage 'Test'
   echo 'Ejecutando tests'
   try{
      bat 'mvn verify -Psurefire'
   }catch(err) {
      if (currentBuild.result == 'UNSTABLE')
         currentBuild.result = 'FAILURE'
      throw err
   }
   
   stage 'Metricas'
   echo 'Corriendo métricas'
   bat 'mvn sonar:sonar'

   stage 'Archivar'
   echo 'Archiva el paquete el paquete generado en Jenkins'
   step([$class: 'ArtifactArchiver', artifacts: '**/target/*.jar, **/target/*.war', fingerprint: true])
}
