
# 🧮 Calculadora UDP - Cliente JavaFX

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX-25-blue?style=for-the-badge)
![UDP Protocol](https://img.shields.io/badge/Protocol-UDP-success?style=for-the-badge)

Cliente de red desarrollado en Java con interfaz gráfica (GUI) en JavaFX. Este proyecto implementa una calculadora que envía peticiones aritméticas a un servidor remoto a través del protocolo de datagramas de usuario (UDP). 

Desarrollado como parte del **Taller 1** para la **Escuela Politécnica Nacional (EPN) - ESFOT**.

## ✨ Características Principales

* **Arquitectura Cliente-Servidor:** Comunicación en tiempo real sin conexión persistente (stateless) usando `DatagramSocket` y `DatagramPacket`.
* **Configuración de Red Dinámica:** Permite al usuario modificar la dirección IP y el puerto de destino directamente desde la interfaz, ideal para pruebas en laboratorios.
* **Interfaz de Usuario Moderna:** Diseño "Dark Mode" profesional construido con FXML, optimizado para una excelente experiencia de usuario (UX).
* **Manejo de Excepciones:** Prevención de caídas del sistema mediante validación de entradas numéricas y control de errores de red (Timeouts/Host Unreachable).

## 📂 Estructura del Proyecto

El proyecto sigue una separación lógica entre la capa de red y la capa de presentación:

```text
src/
├── entidades/
│   └── Cliente.java              # Lógica de red (Sockets UDP, envío y recepción)
├── vista/
│   ├── Main.java                 # Clase principal y lanzador de la aplicación
│   ├── ControladorCalculadora.java # Manejo de eventos y conexión Vista-Modelo
│   └── CalculadoraGuia.fxml      # Diseño estructurado de la interfaz gráfica
```

## 🛠️ Tecnologías y Requisitos Previos

Para ejecutar este proyecto, necesitas tener instalado en tu entorno de desarrollo:

* **Java Development Kit (JDK):** Versión 11 o superior (Testeado en JDK 24+).
* **JavaFX SDK:** Versión 25 o compatible.
* Un IDE de tu preferencia (IntelliJ IDEA, Eclipse o VS Code).

## 🚀 Instrucciones de Ejecución

Debido a que JavaFX ya no está incluido en el JDK por defecto, debes agregar los módulos correspondientes en los argumentos de la máquina virtual (VM Options) al momento de ejecutar:

1. Clona este repositorio.
2. Configura la ruta de tu SDK de JavaFX.
3. Ejecuta la clase `vista.Main` añadiendo los siguientes parámetros a la VM:

```bash
--module-path "Ruta\A\Tu\javafx-sdk\lib" --add-modules javafx.controls,javafx.fxml
```

## 💻 Uso

1. Inicia un servidor UDP compatible que escuche en una IP y puerto específicos y espere una cadena con el formato: `operacion,numero1,numero2`.
2. Abre la aplicación Cliente.
3. Ingresa la **IP del Servidor** (ej. `192.168.100.83`) y el **Puerto** (ej. `5000`).
4. Ingresa los dos operandos.
5. Haz clic en la operación deseada (`+`, `-`, `*`, `/`).
6. El resultado o los errores de validación se mostrarán en la parte inferior de la pantalla.

## 👨‍💻 Autor

**Antony Cisneros** *Estudiante de Tecnología Superior en Desarrollo de Software*
