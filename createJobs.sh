#!/bin/bash

for file in /job-definitions
do

sudo jenkins-jobs --conf /etc/jenkins_jobs/jenkins_jobs.ini update "$file"

done


