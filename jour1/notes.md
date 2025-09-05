Job 1 — Spring Initializr

Question : Qu'est-ce que Spring Initializr et comment peut-il faciliter la création d'un nouveau projet Spring ?
Spring Initializr est un générateur de projet en ligne qui permet de créer très rapidement un squelette d’application Spring Boot.
Plutôt que de configurer soi-même Maven, les dépendances et la structure des dossiers, on choisit quelques options (langage, version de Spring, dépendances nécessaires) et l’outil nous fournit directement un projet prêt à importer dans un IDE.
C’est un gain de temps énorme et ça évite bien des erreurs de configuration pour démarrer.

Job 2 — pom.xml
Question : Pourquoi le fichier pom.xml est-il crucial dans un projet Maven ?
Le fichier pom.xml est la pièce maîtresse d’un projet Maven.
Il contient toutes les informations nécessaires pour construire l’application : son identité (groupId, artifactId, version), la liste des dépendances, les plugins de build, ainsi que la configuration pour différents environnements.
En pratique, sans pom.xml, Maven ne saurait pas quelles bibliothèques télécharger ni comment compiler, tester et exécuter le projet.
C’est donc lui qui orchestre tout le cycle de vie du projet Java.

Job 3 — Contrôleur Spring MVC
Question : Qu'est-ce qu'un contrôleur dans le contexte de Spring MVC ?
Un contrôleur est une classe qui reçoit les requêtes HTTP envoyées par un utilisateur (par exemple quand on tape une URL dans le navigateur), exécute la logique correspondante et renvoie une réponse.
Dans Spring MVC, un contrôleur est souvent annoté avec @Controller ou @RestController et expose des méthodes associées à des routes (@GetMapping, @PostMapping, etc.).
Concrètement, c’est le point d’entrée de notre code côté serveur pour gérer la communication avec le client.

Job 4 — Injection de propriétés
Question : Comment Spring permet-il l'injection de propriétés depuis des fichiers de configuration ?
Spring lit automatiquement les fichiers de configuration comme application.properties ou application.yml.
Ces fichiers contiennent des clés/valeurs (exemple : greeting.message = Bonjour !).
Grâce à l’annotation @Value("${greeting.message}"), on peut injecter directement cette valeur dans une variable Java.
Spring propose aussi @ConfigurationProperties pour lier un ensemble de propriétés à une classe.
L’idée est de séparer la configuration du code, ce qui rend l’application plus flexible.

Job 5 — Profils
Question : Pourquoi serait-il utile d'avoir différents profils dans une application Spring ?
Les profils permettent de définir des configurations différentes selon l’environnement où tourne l’application : développement, test, production…
Par exemple :

En dev, on peut afficher plus de logs et utiliser une base de données en mémoire.

En prod, on utilisera une vraie base de données et une configuration plus sécurisée.
Cela permet d’éviter de modifier le code à chaque changement d’environnement : on active simplement le profil correspondant et Spring charge la bonne configuration.

Job 6 — DevTools
Question : En quoi la dépendance DevTools est-elle bénéfique pour le développement ?
Spring Boot DevTools est une dépendance pensée pour améliorer le confort du développeur.
Elle permet notamment le rechargement automatique de l’application quand on modifie du code ou des fichiers de configuration, sans avoir à redémarrer manuellement.
Elle ajoute aussi quelques fonctionnalités pratiques comme la désactivation du cache de templates (utile avec Thymeleaf).
Résultat : le cycle “écrire → tester” est beaucoup plus rapide, ce qui rend le développement plus fluide et agréable.
