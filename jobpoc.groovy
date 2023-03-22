job('example-job') {
    description 'This is an example job'
    scm {
        git('https://github.com/example/repo.git')
    }
    triggers {
        cron('* * * * *')
    }
    steps {
        shell('echo "Hello, world!"')
    }
    postBuild {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if the job succeeds'
        }
        failure {
            echo 'This will run only if the job fails'
        }
    }
}
