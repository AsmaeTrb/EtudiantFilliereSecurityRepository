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
