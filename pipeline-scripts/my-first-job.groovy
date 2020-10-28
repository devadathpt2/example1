library 'my-shared-library'



node('master')
stage ('Example') {
    steps {
        // log.info 'Starting'
        script {
            helloWorld()
        }
    }
}
