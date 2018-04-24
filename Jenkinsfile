stage 'build_Project'
node{


  checkout scm
  if(isUnix()){
  sh 'gradle build --info'

  }
  else{
    bat 'gradle build --info'
  }
}