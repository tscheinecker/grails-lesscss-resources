grails.release.scm.enabled = false
grails.project.work.dir = "target"
grails.project.dependency.resolution = {
    inherits("global")
    log "warn"
    repositories {
        grailsCentral()
    }
    dependencies {
        runtime 'org.lesscss:lesscss:1.3.3'

        test ("org.codehaus.geb:geb-spock:0.7.0") {
            export = false
        }
	    test "org.spockframework:spock-grails-support:0.7-groovy-2.0"
        test ('org.gmock:gmock:0.8.2') {
            export = false
        }
        test("org.seleniumhq.selenium:selenium-firefox-driver:2.31.0") {
            exclude 'selenium-server'
            export = false
        }
    }
    plugins {
        test (":spock:0.7") {
	        exclude "spock-grails-support"
            export = false
        }
        test (":geb:0.9.0") {
            export = false
        }
        compile (":resources:1.2") {
            export = false
        }
        build(':release:2.2.1', ':rest-client-builder:1.0.3') {
           export = false
        }
    }
}
