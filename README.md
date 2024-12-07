# Swagger Core JAX RS Analyzer

Simple projet : Generate API documentation swagger.json without Swagger annotations using jax-rs_Analyzer

## How to run
```
mvn clean install
```

Documentation : target/jaxrs-analyzer/swagger.json

JAX-RS Analyzer Maven Plugin
Maven plugin for the JAX-RS Analyzer.

To enable the plugin, simply add these lines to your pom.xml in the <plugins> section.
```
<plugin>
    <groupId>com.sebastian-daschner</groupId>
    <artifactId>jaxrs-analyzer-maven-plugin</artifactId>
    <version>0.14</version>
    <executions>
        <execution>
            <goals>
                <goal>analyze-jaxrs</goal>
            </goals>
            <configuration>
                <backend>swagger</backend>
                <deployedDomain>example.com</deployedDomain>
            </configuration>
        </execution>
    </executions>
</plugin>
```
After building your project, the documentation resides under 'target/jaxrs-analyzer/'.

For all configuration options please see the Maven plugin documentation.
