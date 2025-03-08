# Injection des Dépendances et Inversion de Contrôle

Ce projet illustre les concepts d'**Injection des Dépendances (DI)** et d'**Inversion de Contrôle (IoC)** à travers différentes méthodes d'implémentation : instanciation statique, dynamique et utilisation du framework **Spring**.

## 📌 Objectifs
- Comprendre l'injection des dépendances et l'inversion de contrôle.
- Implémenter une architecture à **couplage faible**.
- Expérimenter différentes méthodes d'injection de dépendances :
    - **Instanciation statique**
    - **Instanciation dynamique**
    - **Utilisation de Spring** (XML et annotations)

## 🚀 Étapes d'implémentation
### Partie 1 : Développement des interfaces et implémentations
1. **Créer l'interface `IDao`** avec une méthode `getData()`.
2. **Créer une implémentation de `IDao`** qui fournit des données simulées.
3. **Créer l'interface `IMetier`** avec une méthode `calcul()`.
4. **Créer une implémentation de `IMetier`** qui utilise `IDao` avec un couplage faible.


### Partie 2 : Injection des Dépendances
1. **Injection par instanciation statique**
    - Instancier `DaoImpl` directement dans `MetierImpl`.
2. **Injection par instanciation dynamique**
    - Charger dynamiquement l'implémentation de `IDao` via un fichier de configuration ou réflexion Java.
3. **Injection via le Framework Spring**
    - **Configuration XML**
    - **Utilisation des annotations (`@Autowired`, `@Component`, `@Service`, etc.)**
   

### Presentation Statique
1. **Version base donnée**
![injection_statique.png](Image/injection_statique.png)


2. **Version web service**
![injection_statique_SRV.png](Image/injection_statique_SRV.png)


### Presentation Dynamique
1. **Version base donnée**
   ![injection_dynamique.png](Image/injection_dynamique.png)


2. **Version web service**
   ![injection_dynamique_srv.png](Image/injection_dynamique_srv.png)





### Presentation Spring XML
1. **Version base donnée**
   ![injection_spring_xml.png](Image/injection_spring_xml.png)


2. **Version web service**
   ![injection_spring_xml_wsv.png](Image/injection_spring_xml_wsv.png)




### Presentation Spring Annotations
1. **Version base donnée**
   ![injection_spring_annotation.png](Image/injection_spring_annotation.png)


2. **Version web service**
   ![injection_spring_annotation_wvr.png](Image/injection_spring_annotation_wvr.png)


### Diagramme de classe 

![diagramme_classe.png](Image/diagramme_classe.png)

## 📂 Structure du projet
┣ 📂 src\
┃ ┣ 📂 main \
┃ ┃ ┣ 📂 java \
┃ ┃ ┃ ┣ 📂 dao \
┃ ┃ ┃ ┃ ┣ 📜 IDao.java   
┃ ┃ ┃ ┃ ┣ 📜 DaoImpl.java  
┃ ┃ ┃ ┣ 📂 metier \
┃ ┃ ┃ ┃ ┣ 📜 IMetier.java  
┃ ┃ ┃ ┃ ┣ 📜 MetierImpl.java    
┃ ┃ ┃ ┣ 📂 presentation \
┃ ┃ ┃ ┃ ┣ 📜 pres_dynamique.java  
┃ ┃ ┃ ┃ ┣ 📜 pres_spring_annotations.java  
┃ ┃ ┃ ┃ ┣ 📜 pres_spring_xml.java  
┃ ┃ ┃ ┃ ┣ 📜 pres_statique.java  
┃ ┃ ┣ 📂 resources \
┃ ┃ ┃ ┣ 📜 config.xml   
┣ 📜 pom.xml (si Maven)  
┣ 📜 README.md


## 🛠️ Technologies utilisées
- **Java**
- **Spring Framework**
- **Maven / Gradle**
- **Git / GitHub**