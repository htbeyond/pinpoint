plugins {
    id("com.navercorp.pinpoint.java11-library")
}

dependencies {
    api(project(":pinpoint-flink"))
    implementation(libs.hbase2.client) {
        exclude(group = "com.google.protobuf", module = "protobuf-java")
        exclude(group = "org.slf4j", module = "slf4j-log4j12")
        exclude(group = "javax.annotation", module = "javax.annotation-api")
        exclude(group = "javax.activation", module = "javax.activation-api")
        exclude(group = "org.apache.curator", module = "curator-client")
        exclude(group = "org.apache.curator", module = "curator-framework")
    }
}

description = "pinpoint-hbase2-flink"
