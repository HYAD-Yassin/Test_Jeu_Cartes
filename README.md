# Jeu de Cartes - Simulation en Java

## Diagramme de Classe Simplifié

Les classes principales du projet sont :

- **Carte** : Représente une carte individuelle avec ses attributs (valeur, symbole).
- **Joueur** : Représente un joueur avec ses attributs et ses méthodes.
- **DeckOfCartes** : Représente le paquet de cartes complet avec des méthodes pour mélanger, distribuer et trier les cartes.
- **Pli** : Représente un ensemble de cartes jouées lors d'un tour, avec une méthode pour déterminer le gagnant du pli.
- **Game** : Gère le déroulement du jeu (classe principale), l'initialisation des joueurs, la distribution des cartes, la gestion des plis et la détermination du gagnant final.

![Diagramme de classe](images/ClassD_page-0001.jpg)

---

## Affichage des cartes triées par couleur et valeur

Cette section affiche les cartes de manière organisée, en respectant l'ordre des couleurs et des valeurs, facilitant ainsi la lecture et la compréhension du jeu.

![Cartes triées](images/Capture.PNG)

---

## Les Joueurs et leurs Cartes

Cette section affiche les cartes distribuées à chaque joueur après le mélange du jeu. Comme vous pouvez le voir dans les deux exemples ci-dessous, les cartes changent à chaque exécution grâce à la fonction de mélange, assurant une distribution aléatoire et équitable entre les joueurs.

### Exemple 1

**Main du Joueur 1** : 8 de Coeur, Reine de Pique, Reine de Trèfle, 10 de Coeur, 5 de Coeur, Valet de Carreau, 9 de Pique, Valet de Pique, Roi de Pique, Valet de Coeur, 8 de Trèfle, As de Trèfle, Roi de Trèfle.  
**Main du Joueur 2** : 10 de Pique, 3 de Trèfle, Valet de Trèfle, 2 de Coeur, 7 de Coeur, 7 de Pique, Reine de Carreau, 9 de Trèfle, 3 de Coeur, 4 de Coeur, 6 de Coeur, 3 de Carreau, 6 de Trèfle.  
**Main du Joueur 3** : 7 de Trèfle, 10 de Carreau, 8 de Pique, 7 de Carreau, 2 de Trèfle, 2 de Carreau, 4 de Trèfle, 8 de Carreau, 2 de Pique, Roi de Coeur, As de Carreau, Reine de Coeur, 4 de Pique.  
**Main du Joueur 4** : 3 de Pique, 6 de Pique, 9 de Carreau, As de Coeur, 10 de Trèfle, As de Pique, 6 de Carreau, 9 de Coeur, 5 de Trèfle, 5 de Pique, 4 de Carreau, Roi de Carreau, 5 de Carreau.

### Exemple 2

**Main du Joueur 1** : 5 de Pique, 8 de Pique, 7 de Coeur, 2 de Carreau, Valet de Coeur, 8 de Trèfle, 6 de Carreau, As de Coeur, 6 de Pique, Reine de Carreau, 4 de Pique, 10 de Trèfle, Reine de Coeur.  
**Main du Joueur 2** : Roi de Pique, 4 de Trèfle, 8 de Carreau, 7 de Trèfle, 10 de Carreau, 2 de Pique, 3 de Coeur, 3 de Pique, 10 de Coeur, 2 de Coeur, As de Trèfle, 5 de Coeur, As de Carreau.  
**Main du Joueur 3** : As de Pique, Roi de Carreau, 8 de Coeur, 4 de Coeur, 6 de Trèfle, Valet de Carreau, Valet de Trèfle, 10 de Pique, Roi de Coeur, Reine de Trèfle, 3 de Carreau, 9 de Trèfle, Roi de Trèfle.  
**Main du Joueur 4** : 9 de Coeur, 5 de Carreau, 7 de Pique, 2 de Trèfle, 9 de Pique, Reine de Pique, 5 de Trèfle, Valet de Pique, 3 de Trèfle, 7 de Carreau, 6 de Coeur, 4 de Carreau, 9 de Carreau.

---

## Simulation du Jeu de Cartes

Le programme simule un jeu de cartes où les joueurs reçoivent des cartes, jouent un pli, et déterminent le vainqueur de chaque pli en fonction de la valeur des cartes jouées.

Le jeu peut prendre du temps à se compiler en raison du choix aléatoire des cartes par les joueurs ainsi que du mélange des cartes, ce qui entraîne des calculs supplémentaires lors de chaque distribution.

![Jeu en cours](images/Game.PNG)

---

## Exécution du Projet

1. **Compiler le projet** :
   ```sh
   javac Game.java
   ```
2. **Exécuter le projet** :
   ```sh
   java Game
   ```

---

## Auteurs

Développé par **Yassin HYAD**.

---

## Licence

Ce projet est sous licence MIT.
