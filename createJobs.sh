#!/bin/bash

for file in /job-definitions
do

/usr/local/Cellar/jenkins-job-builder/3.5.0/bin/jenkins-jobs --conf /etc/jenkins_jobs/jenkins_jobs.ini update "$file"

done


