Memory game 

# 🃏 Memory Game — De Letras a Imágenes
 
## Descripción del Proyecto
 
**Memory Game** es un juego de cartas de memoria donde el jugador debe encontrar parejas de cartas iguales. La versión original usaba letras; esta nueva versión usa **imágenes** representadas como cartas físicas con animación de volteo.

![Imagen del artículo sobre Markdown](https://play-lh.googleusercontent.com/XuBmdh_n34GJy3VOLsZLV8q-b5t-7rwmEYo1VcjMKtnh_7jOCDot0YWGPrUXP-S8_6_JeaV99cT_BYzUaHXPWhc)
 
---
 
## 🎯 Objetivo del Juego
 
El jugador debe encontrar todas las parejas de cartas en el menor número de intentos posible. Las cartas están boca abajo y se voltean de dos en dos: si coinciden, se quedan visibles; si no, se voltean de nuevo.
 
---
 
## 🗂️ Estado Actual vs Nueva Versión
 
| Característica       | Versión Actual (Letras) | Nueva Versión (Imágenes) |
|----------------------|------------------------|--------------------------|
| Contenido de carta   | Letra del abecedario   | Imagen / ilustración     |
| Aspecto visual       | Simple, texto plano    | Carta con diseño real    |
| Animación            | Ninguna                | Flip 3D al voltear       |
| Dificultad           | Fácil de distinguir    | Más entretenido visualmente |
| Temáticas posibles   | Solo letras            | Animales, frutas, emojis, etc. |
 
---
 
## 🃏 Mecánica de las Cartas
 
Cada carta tiene **dos caras**:
 
- **Dorso (cara oculta):** diseño decorativo igual para todas las cartas.
- **Frente (cara visible):** imagen única que se comparte con su pareja.
### Estados de una carta:
1. `hidden` — boca abajo, no visible
2. `flipped` — volteada, imagen visible
3. `matched` — pareja encontrada, permanece visible
---
 
## 🖼️ Imágenes / Temáticas Posibles
 
Puedes cambiar la temática del juego fácilmente:
 
- 🐾 **Animales** — perro, gato, conejo, pez...
- 🍎 **Frutas** — manzana, plátano, uva, fresa...
- 🌍 **Banderas** — países del mundo
- 🎨 **Emojis** — versión colorida y divertida
- 🧩 **Personajes** — héroes, monstruos, robots...
> Las imágenes pueden cargarse desde una carpeta local (`/img/`) o desde URLs externas.
 
---
 
## ⚙️ Lógica del Juego
 
```
1. Se genera un array con pares de imágenes
2. Se mezclan aleatoriamente (Fisher-Yates shuffle)
3. Se renderizan en el grid como cartas ocultas
4. El jugador hace clic en una carta → se voltea
5. Si ya hay una carta volteada:
   a. ¿Coinciden? → ambas quedan visibles (matched)
   b. ¿No coinciden? → se vuelven a ocultar tras 1s
6. El juego termina cuando todas las parejas están encontradas
```
 
---
 
## 📐 Estructura de Archivos Sugerida
 
```
memory-game/
├── index.html
├── style.css
├── script.js
└── img/
    ├── back.png       ← dorso de la carta
    ├── cat.png
    ├── dog.png
    ├── rabbit.png
    ├── fox.png
    ├── bear.png
    ├── owl.png
    ├── wolf.png
    └── duck.png
```
 
---
 
## 🎨 Diseño Visual de las Cartas
 
```
┌─────────────┐     ┌─────────────┐
│  ~ ~ ~ ~ ~  │     │             │
│  ~ ~ ~ ~ ~  │ ──► │   🐱        │
│  ~ ~ ~ ~ ~  │     │   (imagen)  │
│  ~ ~ ~ ~ ~  │     │             │
└─────────────┘     └─────────────┘
   DORSO               FRENTE
```
 
- Bordes redondeados (`border-radius: 12px`)
- Sombra suave (`box-shadow`)
- Animación CSS `rotateY(180deg)` para el volteo
- Transición de `0.5s`
---
 
## 🏆 Sistema de Puntuación (ideas)
 
- **Intentos:** cuántas veces el jugador ha levantado dos cartas
- **Tiempo:** cronómetro desde el inicio hasta completar
- **Estrellas:** 3 estrellas si completas rápido y con pocos errores
---
 
## 📝 Próximas Mejoras
 
- [ ] Selección de temática antes de empezar
- [ ] Niveles de dificultad (4x4, 6x6, 8x8)
- [ ] Sonidos al voltear y al hacer match
- [ ] Animación de celebración al finalizar
- [ ] Guardar récord en `localStorage`
- [ ] Modo multijugador (turnos alternos)
---
 
## 🧪 Prototipo HTML (Preview)
 
> A continuación hay un bloque HTML de ejemplo que puedes editar directamente.
> Las imágenes son placeholders — sustitúyelas por tus propias rutas.
