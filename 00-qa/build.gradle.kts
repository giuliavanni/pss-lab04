plugins {
    id 'java'
    id 'checkstyle'
}

checkstyle {
    toolVersion = '8.45'
    configFile = file('checkstyle.xml')
}

tasks.withType(Checkstyle) {
    reports {
        xml.enabled = false
        html.enabled = true
    }
}
