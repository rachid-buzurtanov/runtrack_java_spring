Job 1 — Spring Initializr

Question : Qu'est-ce que Spring Initializr et comment peut-il faciliter la création d'un nouveau projet Spring ?

Spring Initializr, c’est un site qui permet de générer en quelques clics la base d’un projet Spring Boot. On choisit juste les options (langage, version de Java, dépendances comme Web ou Thymeleaf) et il nous donne un projet déjà prêt à importer dans un IDE.
Ça évite de tout configurer à la main, surtout au début, et on peut directement commencer à coder sans perdre du temps.

Job 2 — pom.xml
Question : Pourquoi le fichier pom.xml est-il crucial dans un projet Maven ?

Le pom.xml, c’est un peu la carte d’identité et le guide du projet.
Il dit à Maven qui est le projet (nom, version, packaging), quelles librairies il doit télécharger, et comment il doit compiler et lancer l’appli.
Dès qu’on a besoin d’une nouvelle dépendance, on l’ajoute dans ce fichier et Maven s’occupe du reste.
Bref, sans le pom.xml, le projet ne pourrait pas tourner correctement.

Job 3 — Contrôleur Spring MVC
Question : Qu'est-ce qu'un contrôleur dans le contexte de Spring MVC ?

Un contrôleur, c’est la classe qui gère les requêtes HTTP.
Quand un utilisateur tape une URL ou envoie une requête, le contrôleur reçoit l’info, fait le traitement nécessaire, et renvoie une réponse (du texte, une page HTML, du JSON, etc.).
En gros, c’est le lien entre ce que demande l’utilisateur et ce que renvoie l’application.

Job 4 — Injection de propriétés
Question : Comment Spring permet-il l'injection de propriétés depuis des fichiers de configuration ?

Dans Spring, on peut mettre nos paramètres (comme un message ou une URL de base de données) dans un fichier application.yml ou application.properties.
Après, avec l’annotation @Value, on peut récupérer ces valeurs directement dans le code.
Ça permet de changer la configuration sans toucher au code Java, ce qui est super pratique si on passe d’un environnement à un autre.

Job 5 — Profils
Question : Pourquoi serait-il utile d'avoir différents profils dans une application Spring ?

Les profils, ça sert à adapter l’appli selon l’environnement.
Par exemple, en mode dev on veut peut-être une base de données en mémoire et beaucoup de logs, alors qu’en prod, on veut une vraie base de données et moins de détails dans les logs.
Du coup, on n’a pas besoin de modifier le code à chaque fois : il suffit de lancer l’appli avec le bon profil et Spring s’occupe de charger la bonne config.

Job 6 — DevTools
Question : En quoi la dépendance DevTools est-elle bénéfique pour le développement ?

DevTools, c’est un vrai gain de temps quand on développe.
Au lieu de redémarrer l’appli à la main à chaque petite modification, elle se recharge toute seule.
Ça rend le travail beaucoup plus fluide : tu changes ton code, tu sauvegardes, et quelques secondes plus tard tu peux déjà tester dans ton navigateur.
C’est exactement ce qu’il faut pour être efficace en phase de dev.
