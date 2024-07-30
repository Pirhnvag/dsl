pipelineJob('job-poc') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/Pirhnvag/dsl.git')
          }
          branches('*/master')
        }
      }
      scriptPath('Jenkinsfile')
    }
  }
  parameters {
    stringParam('SOME_PARAM', 'default_value', 'Descripción del parámetro')
  }
}
