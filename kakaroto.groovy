def job = pipelineJob('kakaroto') {
  definition {
    cps {
      script(readFileFromWorkspace('kakaroto.jenkinsfile'))
      sandbox()
  }
}
  parameters {
    stringParam('perfil_fuse', 'proceso-credito-venta', 'Favor ingresar perfil. (Campo obligatorio)')
    booleanParam('cargarproperties',false, 'Indicar si desea cargar archivo de propiedades.')
  }    
}
def jobDescription = "job nueva logica de despliegues qa jenkins onprem"
helpers.Build_Job_Helper.general_config_multisite_testing(job)
helpers.Build_Job_Helper.addGitParameter_branch_testing(job,'PT_BRANCH','DESCENDING_SMART','.*','branch')
helpers.Build_Job_Helper.general_config_qa(job, jobDescription)
