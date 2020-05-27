import groovy.io.FileType

def list = []

def dir = new File("./shell-scripts")
dir.eachFileRecurse (FileType.FILES)
        {file -> list << file }

for (item in list )
{
    def command = 'sudo jenkins-jobs --conf /etc/jenkins_jobs/jenkins_jobs.ini update job-definitions/' + item
    def proc = command.execute()

    proc.consumeProcessOutput(sout, serr)
    proc.waitForOrKill(1000)
    println sout
}