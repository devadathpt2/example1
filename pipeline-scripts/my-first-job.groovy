#!/usr/bin/env groovy
library 'Global-Common-libs'


node()
{

    stages {
        stage('runGroovy') {

            // log.info 'Starting'

            helloWorld()

        }
    }
}