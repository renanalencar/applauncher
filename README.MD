# 📱 AppLauncher – Jetpack Compose Kotlin App

Este é um aplicativo Android simples escrito em **Kotlin com Jetpack Compose** que permite abrir outro aplicativo instalado no dispositivo usando seu `packageName`.

---

## ✨ Funcionalidades

- Verifica se o aplicativo com o pacote `br.com.renanalencar.detectlauncher` está instalado.
- Abre o aplicativo diretamente com um clique.
- Mostra uma mensagem amigável se o app não estiver instalado.

---

## 🧱 Tecnologias utilizadas

- ✅ Kotlin
- ✅ Jetpack Compose
- ✅ Material 3
- ✅ Android SDK

---

## 🚀 Como executar

1. Clone este repositório:

```bash
git clone https://github.com/seu-usuario/AppLauncher.git
cd AppLauncher
````

2. Abra o projeto no **Android Studio**.

3. Conecte um dispositivo Android ou inicie um emulador.

4. Clique em **Run** ▶️  para instalar e executar o app.

---

## 📄 Estrutura do Projeto

```
AppLauncher/
├── MainActivity.kt       # Atividade principal com lógica para abrir o app externo
├── AppLauncher.kt        # Composable responsável pela UI
├── ui.theme/             # Paleta de cores, tipografia e tema
└── AndroidManifest.xml   # Configurações da aplicação
```

---

## 🧪 Teste rápido

1. Instale um app com o pacote `br.dev.r3.detectlauncher` no seu dispositivo.
2. Execute este projeto.
3. Toque no botão “Abrir App Externo”.
4. O app será aberto. Caso contrário, será exibida uma mensagem de erro.

---

## 🛠️ Possíveis melhorias

* Fallback para abrir a Google Play Store se o app não estiver instalado.
* Mensagens com `Snackbar`.
* Suporte a múltiplos apps a partir de uma lista.

---

## 📄 Licença

Este projeto é livre para uso e aprendizado. Modifique conforme necessário!

---

## 🙋‍♂️  Autor

Desenvolvido por [@renanalencar](https://github.com/renanalencar).

---
