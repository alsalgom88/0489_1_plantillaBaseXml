# 📱 Plantilla Base Android XML (ViewBinding)

Proyecto base de Android creado con **Android Studio**, usando **interfaz XML tradicional (Views)** y **ViewBinding**.  
Incluye varios ejemplos de layouts para trabajar distintos tipos de diseño.

---

## 🧩 Información del proyecto

- **Nombre:** plantillaBaseXml
- **Lenguaje:** Kotlin
- **UI:** XML (Views)
- **IDE:** Android Studio
- **SDK mínimo:** API 21+
- **Binding:** ViewBinding activado
- **Arquitectura:** Activity + XML

---

## 📂 Estructura del proyecto

```text
app/
 ├─ manifests/
 │   └─ AndroidManifest.xml
 │
 ├─ kotlin-java/
 │   └─ com.example.plantillabasexml/
 │       ├─ MainConstraintActivity.kt
 │       ├─ MainLinearActivity.kt
 │       └─ MainLegacyActivity.kt
 │
 ├─ res/
 │   ├─ layout/
 │   │   ├─ activity_main_constraint.xml
 │   │   ├─ activity_main_linear.xml
 │   │   └─ activity_main_legacy.xml
 │   │
 │   ├─ values/
 │   │   ├─ colors.xml
 │   │   ├─ strings.xml
 │   │   └─ themes.xml
 │   │
 │   ├─ mipmap/
 │   └─ xml/
 │       ├─ backup_rules.xml
 │       └─ data_extraction_rules.xml
 │
 └─ Gradle Scripts/
````

---

## 🧭 Activities incluidas

### 🔹 MainConstraintActivity

* Utiliza **ConstraintLayout**
* ViewBinding activado
* Ejemplo de:

  * Texto dinámico
  * Botón con `setOnClickListener`
  * Layout moderno y adaptable

### 🔹 MainLinearActivity

* Ejemplo con **LinearLayout**
* Útil para comprender layouts verticales y horizontales

### 🔹 MainLegacyActivity

* Ejemplo de layout más tradicional
* Pensado para comparar con enfoques actuales

---

## ⚙️ Tecnologías usadas

* Kotlin
* XML Layouts
* ViewBinding
* AppCompat
* Gradle Kotlin DSL (`.kts`)

---

## ▶️ Ejecución del proyecto

1. Abrir el proyecto en **Android Studio**
2. Esperar a la sincronización de Gradle
3. Seleccionar emulador o dispositivo físico
4. Ejecutar con **Run ▶**

---

## 🧪 Uso educativo

Proyecto diseñado como **plantilla base** para:

* DAM / DAW
* Aprender layouts XML
* Entender ViewBinding
* Comparar distintos tipos de layouts
* Practicar eventos y UI básica

---

## 🚀 Posibles ampliaciones

* Navegación entre Activities
* Fragmentos
* RecyclerView
* Room / APIs REST
* Material Design
* Migración a Jetpack Compose (comparativa)

---

## 🧑‍💻 Autor

* **Autor:** *Alejandro*
* **Curso:** DAM / DAW
* **Módulo:** Programació multimèdia / Android
* **Centro:** *El puig Castellar*

---

## 📄 Licencia

Proyecto de uso educativo.
Libre para modificar y reutilizar con fines formativos.

```