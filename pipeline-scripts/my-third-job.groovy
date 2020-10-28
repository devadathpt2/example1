#!/usr/bin/env groovy
library 'Global-Common-libs'


node()
{

        stage('runGroovy') {

            // log.info 'Starting'

            script {
                helloSwaroopa()
            }

    }
}