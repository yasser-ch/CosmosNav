# 🌌 CosmosNav — Lab 10 : Navigation Drawer & Fragments

## Objectif

Construire une application Android utilisant un **Navigation Drawer** pour naviguer entre plusieurs **Fragments** au sein d'une seule Activity. Ce lab couvre les transactions de fragments, le FragmentManager, et la composition dynamique de l'interface.

---

## Concepts Abordés

- Modèle Navigation Drawer Activity
- Création et inflation de fragments
- `FragmentManager` et `FragmentTransaction`
- `ListFragment` avec un `ArrayAdapter`
- Animations de transition personnalisées (fondu entrant/sortant)
- Gestion de l'ouverture/fermeture du Drawer avec `GravityCompat`

---

## Aperçu de l'Application

**CosmosNav** est une application de navigation sur le thème de l'espace, avec trois sections accessibles depuis un menu latéral :

| Élément du menu     | Fragment            | Description                              |
|--------------------|---------------------|------------------------------------------|
| 🪐 Planet View      | `PlanetFragment`    | Écran violet avec informations planétaires |
| 🌌 Galaxy View      | `GalaxyFragment`    | Écran bleu foncé avec informations galactiques |
| ⭐ Star Catalogue   | `StarListFragment`  | Liste déroulante de corps célestes       |

---
## DEMO 


https://github.com/user-attachments/assets/bba18b8f-cea6-4312-9876-9a38ae5dc4e8


## Structure du Projet

```
CosmosNav/
├── java/com/example/cosmosnav/
│   ├── MainActivity.java
│   ├── PlanetFragment.java
│   ├── GalaxyFragment.java
│   └── StarListFragment.java
├── res/
│   ├── anim/
│   │   ├── fade_in.xml
│   │   └── fade_out.xml
│   ├── drawable/
│   │   ├── ic_planet.xml
│   │   ├── ic_galaxy.xml
│   │   └── ic_stars.xml
│   ├── layout/
│   │   ├── activity_main.xml
│   │   ├── content_main.xml
│   │   ├── nav_header_main.xml
│   │   ├── fragment_planet.xml
│   │   └── fragment_galaxy.xml
│   ├── menu/
│   │   └── drawer_menu.xml
│   └── values/
│       ├── colors.xml
│       └── themes.xml
```

---

## Détails Clés de l'Implémentation

### Navigation entre Fragments
Chaque élément du drawer déclenche une `FragmentTransaction` qui remplace le contenu dans `fragment_host` (un `FrameLayout` dans `content_main.xml`) :

```java
getSupportFragmentManager().beginTransaction()
    .setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
    .replace(R.id.fragment_host, new PlanetFragment())
    .commit();
```

### Animation de Fondu
Les transitions entre fragments utilisent une animation fondu entrant / fondu sortant définie dans `res/anim/`.

### Liste Star Catalogue
`StarListFragment` étend `ListFragment` et utilise un `ArrayAdapter` pour afficher une liste de corps célestes sans nécessiter de layout personnalisé.

---

## Choix de Design

- **Thème :** Sombre / Espace Profond
- **Palette de couleurs :** Bleu marine foncé (`#0D0D1A`), Turquoise (`#00BCD4`), Ambre (`#FFB300`), Violet (`#CE93D8`)
- **Fragment par défaut** au lancement : `PlanetFragment`
- **Bouton retour** ferme le drawer s'il est ouvert, sinon quitte l'application

---

## Comment Exécuter

1. Cloner ou ouvrir le projet dans **Android Studio**
2. Vérifier que le Min SDK est défini à **24**
3. Lancer sur un émulateur ou un appareil physique (Android 7.0+)
4. Glisser depuis le bord gauche ou appuyer sur l'icône hamburger pour ouvrir le drawer
5. Naviguer entre les trois fragments

---

## Référence du Lab

- **Numéro du lab :** 10
- **Titre :** Démo Navigation Drawer et Fragments
- **Langage :** Java
- **Min SDK :** 24 (Android 7.0 Nougat)
