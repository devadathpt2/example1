#!/usr/bin/env bash

for file in ./job-definitions
do

sudo -n jenkins-jobs --conf /etc/jenkins_jobs/jenkins_jobs.ini update "$file"

done


