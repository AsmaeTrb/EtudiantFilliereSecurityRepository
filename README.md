## 🚀 GitHub Actions

CI/CD automatisé avec **GitHub Actions** sur la branche main.
![Pipeline CI/CD](https://github.com/AsmaeTrb/workshop2--groupe6-/blob/b6e7994555984a00d16ebcc8b919e54e770898cf/Capture%20d'%C3%A9cran%202025-12-18%20224505.png)
Le projet a passé avec succès le **Quality Gate SonarQube**, sans bugs ni vulnérabilités.
![Sonarqube](https://github.com/AsmaeTrb/workshop2--groupe6-/blob/1ccca9f1bf6acc6822e5bbba38efb9cd4ee3065d/image.png)
## 🔍 SonarQube – Jenkins

L’analyse de la qualité du code est automatisée à l’aide de **Jenkins**.  
Le serveur **SonarQube** est configuré dans Jenkins avec une URL dédiée et un **token d’authentification**, permettant l’exécution automatique des scans et la validation du **Quality Gate**.
![SonarqubeConfigurationJenkins](https://github.com/AsmaeTrb/workshop2--groupe6-/blob/2561f8ea4dfa375160bc464a541fedbbe3ef3c96/Capture%20d'%C3%A9cran%202025-12-18%20225930.png)

![JenkinsPipelineSucces](https://github.com/AsmaeTrb/workshop2--groupe6-/blob/881ed0d4cc4058403b1d96765357ae73d8f60b65/Capture%20d'%C3%A9cran%202025-12-18%20230847.png)
![SonarQubeAnalyse](https://github.com/AsmaeTrb/workshop2--groupe6-/blob/3a89c6030ffd06ea18866c4171fd7971faeb654a/Capture%20d'%C3%A9cran%202025-12-18%20162122.png)
## 🚀 CI/CD – Jenkins/SonarQube/Semgrep

Le projet utilise **Jenkins** pour l’intégration continue (CI/CD).

Le pipeline Jenkins automatise :
- 🔐 **Semgrep** pour l’analyse de sécurité statique du code (SAST)
- 🔍 **SonarQube** pour l’analyse de la qualité du code, des bugs et des vulnérabilités
![SonarQubeAnalyse-Semgrep](https://github.com/AsmaeTrb/workshop2--groupe6-/blob/77dea3592bd05e949bb750062b85ba819fceaf2a/Capture%20d'%C3%A9cran%202025-12-19%20000504.png)
## 🔐 Dependabot – Dependency Management

Ce projet utilise **GitHub Dependabot** pour automatiser la gestion et la sécurité des dépendances Maven.

### ⚙️ Fonctionnalités
- 🔄 Scan automatique des dépendances (`pom.xml`)
- 📦 Mises à jour des dépendances **directes et transitives**
- 🧩 Regroupement des dépendances **Spring** dans une seule Pull Request
- 🕒 Exécution planifiée (daily)
- 🔐 Détection des vulnérabilités de sécurité
- 📊 Intégration avec le **Dependency Graph** de GitHub
![Dependency Graph]https://github.com/AsmaeTrb/workshop2--groupe6-/blob/a01c49657478c1bdbb18087dea17f2ad97d93763/Capture%20d'%C3%A9cran%202025-12-24%20192538.png
![ Pull Request1]https://github.com/AsmaeTrb/workshop2--groupe6-/blob/1e272fb1d0feb1642853d8d4fbf285c5ba2e5a22/Capture%20d'%C3%A9cran%202025-12-24%20192544.png
![ Pull Request2]https://github.com/AsmaeTrb/workshop2--groupe6-/blob/c5035b18e5df61fe0a2aaf90c729e02eb5395459/Capture%20d'%C3%A9cran%202025-12-24%20192552.png

### 🔁 Pull Requests automatiques
Dependabot crée automatiquement des Pull Requests pour les mises à jour, par exemple :

```text
deps(deps): bump org.springframework.boot:spring-boot-starter-parent 
from 3.5.7 to 4.0.1 in /SecurityService

