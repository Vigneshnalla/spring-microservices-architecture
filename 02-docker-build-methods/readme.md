
# ***Building Docker Images***

In this section, we explain how to build a Docker image for the microservice.

---

## 1. ***Using a Dockerfile***

- A **Dockerfile** should be created in the **root directory** where the `pom.xml` file is located.
- Ensure the **packaging** type in `pom.xml` is set to **jar**:

```xml
<packaging>jar</packaging>
```

---

## 1.1 ***Package the Application Using Maven***

Use the following command to generate the JAR:

```bash
mvn clean package
```

---

## 1.2. ***Build the Docker Image***

Run the following command to build the Docker image:

```bash
docker build -t vigneshramnalla/accounts:s2 .
```

---

## 2. ***Using Buildpacks***

# Build Docker Image Using Spring Boot Maven Plugin

Ensure the **packaging** type in `pom.xml` is set to **jar**:

```xml
<packaging>jar</packaging>
```

Ensure the Spring Boot Maven Plugin includes the image configuration. Inside the `<configuration>` tag, add the image name you want:

```xml
<configuration>
  <image>
    <name>vignesh/${project.artifactId}:s3</name>
  </image>
</configuration>
```

Run the following command to build the Docker image:

```bash
mvn spring-boot:build-image
```


---

## 3. ***Using Goolge Jib***

Ensure the **packaging** type in `pom.xml` is set to **jar**:

```xml
<packaging>jar</packaging>
```

Ensure the Spring Boot  includes the jib-maven-plugin and the image configuration. Inside the `<configuration>` tag, add the image name you want:

```xml
  <plugin>
    <groupId>com.google.cloud.tools</groupId>
    <artifactId>jib-maven-plugin</artifactId>
    <version>3.4.1</version>
    <configuration>
      <to>
        <image>vigneshramnalla/${project.artifactId}:jib</image> <!-- Change as needed -->
      </to>
    </configuration>
  </plugin>
```
Run the following command to build the Docker image:

```bash
mvn compile jib:dockerBuild
```


---

## 🔧 Helper Commands

- **List all Docker images:**
  ```bash
  docker images
  ```

- **Inspect a Docker image by image ID:**
  ```bash
  docker inspect <image-id>
  ```

---
