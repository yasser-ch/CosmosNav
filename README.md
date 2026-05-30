# 🌌 CosmosNav — Lab 10: Navigation Drawer & Fragments

## Objective

Build an Android application using a **Navigation Drawer** to navigate between multiple **Fragments** within a single Activity. This lab covers fragment transactions, the FragmentManager, and dynamic UI composition.

---

## Concepts Covered

- Navigation Drawer Activity template
- Fragment creation and inflation
- `FragmentManager` and `FragmentTransaction`
- `ListFragment` with an `ArrayAdapter`
- Custom fragment transition animations (fade in/out)
- Drawer open/close handling with `GravityCompat`

---

## App Overview

**CosmosNav** is a space-themed navigation app with three sections accessible from a side drawer:

| Menu Item       | Fragment            | Description                        |
|----------------|---------------------|------------------------------------|
| 🪐 Planet View  | `PlanetFragment`    | Purple screen with planet info     |
| 🌌 Galaxy View  | `GalaxyFragment`    | Deep blue screen with galaxy info  |
| ⭐ Star Catalogue | `StarListFragment` | Scrollable list of celestial bodies |

---

## Project Structure

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

## Key Implementation Details

### Fragment Navigation
Each drawer item triggers a `FragmentTransaction` that replaces the content inside `fragment_host` (a `FrameLayout` in `content_main.xml`):

```java
getSupportFragmentManager().beginTransaction()
    .setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
    .replace(R.id.fragment_host, new PlanetFragment())
    .commit();
```

### Fade Animation
Fragment switches use a custom fade-in / fade-out animation defined in `res/anim/`.

### Star Catalogue List
`StarListFragment` extends `ListFragment` and uses an `ArrayAdapter` to display a list of celestial bodies without needing a custom layout.

---

## Design Choices

- **Theme:** Dark / Deep Space
- **Color palette:** Deep navy (`#0D0D1A`), Teal (`#00BCD4`), Amber (`#FFB300`), Purple (`#CE93D8`)
- **Default fragment** loaded on launch: `PlanetFragment`
- **Back button** closes the drawer if open, otherwise exits normally

---

## How to Run

1. Clone or open the project in **Android Studio**
2. Ensure Min SDK is set to **24**
3. Run on an emulator or physical device (Android 7.0+)
4. Swipe from the left edge or tap the hamburger icon to open the drawer
5. Navigate between the three fragments

---

## Lab Reference

- **Lab number:** 10
- **Title:** Démo Navigation Drawer et Fragments
- **Language:** Java
- **Min SDK:** 24 (Android 7.0 Nougat)
