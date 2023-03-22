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
