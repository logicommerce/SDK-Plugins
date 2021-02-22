# Repositorio Maven

Para la creación de plugins en **LogiCommerce** se ha creado un repositorio maven: <http://10.254.2.116:8081/>

Cada usuario tiene sus credenciales y, para poder programar un plugin habrá añadirlas a la configuración de maven local.

## settings.xml

Hay que editar el archivo settings.xml que se encuentra en `~/.m2/settings.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<settings xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.1.0 http://maven.apache.org/xsd/settings-1.1.0.xsd" xmlns="http://maven.apache.org/SETTINGS/1.1.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <servers>
    <server>
      <username>username</username>
      <password>encryptedPassword</password>
      <id>central</id>
    </server>
    <server>
      <username>username</username>
      <password>encryptedPassword</password>
      <id>snapshots</id>
    </server>
  </servers>
  <profiles>
    <profile>
      <repositories>
        <repository>
          <snapshots>
            <enabled>false</enabled>
          </snapshots>
          <id>central</id>
          <name>libs-release</name>
          <url>http://10.254.2.116:8081/artifactory/libs-release</url>
        </repository>
        <repository>
          <snapshots />
          <id>snapshots</id>
          <name>libs-snapshot</name>
          <url>http://10.254.2.116:8081/artifactory/libs-snapshot</url>
        </repository>
      </repositories>
      <pluginRepositories>
        <pluginRepository>
          <snapshots>
            <enabled>false</enabled>
          </snapshots>
          <id>central</id>
          <name>libs-release</name>
          <url>http://10.254.2.116:8081/artifactory/libs-release</url>
        </pluginRepository>
        <pluginRepository>
          <snapshots />
          <id>snapshots</id>
          <name>libs-snapshot</name>
          <url>http://10.254.2.116:8081/artifactory/libs-snapshot</url>
        </pluginRepository>
      </pluginRepositories>
      <id>artifactory</id>
    </profile>
  </profiles>
  <activeProfiles>
    <activeProfile>artifactory</activeProfile>
  </activeProfiles>
</settings>
```

Para generar la clave encriptada hay que ir al la edición de la cuenta de Artifactory (Edit profile) y copiar la contraseña encriptada.

### Configuración plugin

Al crear un nuevo proyecto maven para un plugin habrá que añadir el archivo *pom.xml* lo siguiente:

```xml
<distributionManagement>
    <snapshotRepository>
        <id>snapshots</id>
        <name>ip-10-254-2-116.eu-west-1.compute.internal-snapshots</name>
        <url>http://10.254.2.116:8081/artifactory/libs-snapshot-local</url>
    </snapshotRepository>
</distributionManagement>
```

De momento el desarrollo de los plugins se hace sobre el repositorio **snapshot**. Este repositorio se dejará de utilizar cuando salga la primera versión de **Beyond** y entonces se utilizará el repositorio de producción.
