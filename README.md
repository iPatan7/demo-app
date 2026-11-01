# demo-app

A small Maven project (a calculator with JUnit 5 tests) used to practise Jenkins
pipelines in the DevOps Process Automation lab, Experiment 6.

| File | What it is |
|------|------------|
| `Jenkinsfile` | Scripted pipeline, run by a Jenkins job with *Pipeline script from SCM* |
| `Jenkinsfile.declarative` | The same pipeline converted to declarative syntax |

Each pipeline runs the nine Maven goals as separate stages:
`clean`, `validate`, `compile`, `test`, `package`, `verify`, `install`, `site`, `deploy`.

`mvn deploy` needs a target repository. `pom.xml` points `distributionManagement`
at a folder on the build machine (`~/maven-remote-repo`), so the goal really
uploads the jar without a Nexus or Artifactory server.

Jenkins needs two tools under *Manage Jenkins > Tools*: a Maven installation
named `Maven3` and a JDK named `JDK25`.

Build and test locally:

```bash
mvn clean verify
```
