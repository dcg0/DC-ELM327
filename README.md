# HC-ELM327 / DCarECU

![HC-ELM327](hc-elm327.png)
# 🚗 DC-ELM327

<p align="center">
  <img src="https://github.com/dcg0/DC-ELM327/raw/refs/heads/main/readme.png" alt="DC-ELM327" width="100%">
</p>

<h2 align="center">Sistema de diagnóstico automotriz OBD-II</h2>

<p align="center">
  Diagnóstico y monitoreo de parámetros del vehículo mediante un módulo <b>ELM327</b>.
</p>

---

## 📋 Descripción

**DC-ELM327** es una aplicación orientada al diagnóstico y monitoreo automotriz utilizando el protocolo **OBD-II** y módulos compatibles con **ELM327**.

La aplicación permite establecer comunicación con la ECU del vehículo y visualizar información del automóvil mediante una interfaz tipo tablero.

---

## 🔧 Características

- Conexión con módulos **ELM327**.
- Comunicación mediante **OBD-II**.
- Lectura de parámetros de la ECU.
- Monitoreo de datos en tiempo real.
- Visualización de RPM.
- Velocidad del vehículo.
- Temperatura del motor.
- Nivel de combustible.
- Lectura de información de diagnóstico.
- Interfaz gráfica tipo tablero automotriz.
- Diseño orientado al diagnóstico y monitoreo.

---

## 📡 Comunicación

DC-ELM327 está diseñado para trabajar con adaptadores compatibles con:

```text
OBD-II
   │
   ▼
ELM327
   │
   ├── Bluetooth
   │
   └── Wi-Fi
          │
          ▼
     DC-ELM327
          │
          ▼
         ECU
<div align="center">

# 🚗 DC-ELM327

[![Get it on F-Droid](https://f-droid.org/badge/get-it-on.png)](https://f-droid.org/packages/com.fr3ts0n.ecu.gui.com/)
[![License](https://img.shields.io/badge/license-GPLv3-blue.svg)](LICENSE)
[![Platform](https://img.shields.io/badge/platform-Android-green.svg)](https://www.com)

**DC-ELM327** es una potente aplicación de diagnóstico vehicular OBD2 para dispositivos Android. Conéctate a la computadora de tu auto en tiempo real, lee y borra códigos de falla, y monitorea cada detalle del rendimiento de tu motor de manera fácil y profesional.

---

![Vehículos en la playa](1000026289.png)

</div>

---

## ✨ Características Principales

### 🔌 Tipos de Conexión
* **Bluetooth** (Classic y LE)
* **USB** (Adaptadores seriales / FTDI)
* **Wi-Fi** (Redes OBD ELM327 inalámbricas)

### 🛠️ Funcionalidad Esencial
* 🔍 **Lectura de códigos de falla:** Identifica por qué se encendió el testigo "Check Engine".
* 🧹 **Borrado de códigos de falla:** Limpia los códigos DTC y apaga la luz del motor una vez reparado el problema.
* 📊 **Lectura y grabación de datos en tiempo real:** Monitoreo en vivo de sensores del vehículo.
* ❄️ **Cuadro congelado (Freeze Frame):** Analiza las condiciones exactas del vehículo en el momento en que ocurrió una falla.
* 📋 **Información del vehículo:** Obtén número VIN, calibraciones y datos de la ECU.

<details>
  <summary><b>🔥 Ampliar lista de características avanzadas</b></summary>
  
#### 🎨 Personalización y Visualización
* Vista Día / Noche automática o manual.
* Gráficos de datos avanzados y dinámicos.
* Panel personalizable (Tablero / Dashboard).
* Pantalla frontal (HUD - Head Up Display) para el parabrisas.
* Guardar y cargar sesiones grabadas para análisis detallados posteriores.
* Exportación de datos en formato **CSV**.

#### ⚙️ Personalización de Datos PID
* Selección de elementos de datos PID personalizados.
* Conversiones de unidades y fórmulas de datos.

#### 🔌 Soporte de Extensiones y Plugins
* **Desarrollo:** [Repositorio del plugin DC-ELM327](https://github.com/fr3ts0n/AndrOBD-Plugin)
* **Plugins Disponibles:**
  * [MQTT publisher](https://f-droid.org/en/packages/com.fr3ts0n.androbd.plugin.mqtt/) - Publica datos OBD directamente a un broker MQTT.
  * [GpsProvider](https://f-droid.org/en/packages/com.fr3ts0n.Dc-elm327.plugin.gpsprovider/) - Proporciona datos GPS sincronizados.
  * [SensorProvider](https://f-droid.org/en/packages/com.fr3ts0n.DCELM327.plugin.sensorprovider/) - Integra datos del acelerómetro del teléfono.

#### 🌍 Soporte de Idioma Nativo
* Traducible e interactivo vía [weblate.org](https://hosted.weblate.org/engage/androbd/)
  * Diálogos del programa y configuración.
  * Descripciones detalladas de datos OBD.
  * Base de datos de descripciones de códigos de falla.

</details>

---

## 📸 Vistazo Rápido a la App

| Dashboard Principal | Gráficos y Diagnóstico |
| :--: | :--: |
| ![Dashboard](watermarked_img_8268063300938201679.png) | ![Gráficos](watermarked_img_14262094370467484248.png) |

---

## 📥 Descarga e Instalación

Puedes descargar la aplicación directamente desde F-Droid:

[<img src="https://f-droid.org/badge/get-it-on.png" alt="Get it on F-Droid" height="80">](https://f-droid.org/packages/com.fr3ts0n.ecu.gui.androbd/)


<img src="https://f-droid.org/badge/get-it-on.png" alt="Get it on F-Droid" height="80">
Características
Tipos de conexión
Bluetooth
USB
Wi-Fi
Funcionalidad
Leer códigos de falla
Borrar códigos de falla
Leer/grabar datos en tiempo real
Leer datos de cuadro congelado (freeze frame)
Leer datos de información del vehículo
<details>
<summary>Ampliar lista de características</summary>
Características adicionales
Vista Día/Noche
Gráficos de datos
Panel (Tablero)
Pantalla frontal (HUD)
Guardar datos grabados
Cargar datos grabados (para análisis)
Exportar a CSV
Personalización de datos PID
Elementos de datos PID
Conversiones de datos
Soporte de extensiones de complementos
Desarrollo: Repositorio del plugin DC-ELM327
Plugins disponibles:
MQTT publisher - Publicar datos OBD a un broker MQTT
GpsProvider - Proporcionar datos GPS a DC-ELM327
SensorProvider - Proporcionar datos del acelerómetro a DC-ELM327
Soporte de idioma nativo
Traducible a través de weblate.org
Diálogos del programa
Descripciones de datos OBD
Descripciones de códigos de falla
</details>
Capturas de pantalla
