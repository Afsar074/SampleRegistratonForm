job('sample-dsl-script'){
    description("job is to create a job automatically when ever run seed jobs ${new Date()}")
    scm{
        git("https://github.com/Afsar074/SampleRegistratonForm.git",master)
    }
    triggers{
        scm('* * * * *')
    }
    steps{
        maven('clean package','pom.xml')
    }
    publishers{
        archiveArtifacts '**/*.war'
    }
}
