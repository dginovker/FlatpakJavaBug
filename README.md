# Flatpak Bug with Java + InetAddress

Only seems to happen on some machines.

Steps to reproduce:

## Outside Flatpak (Works):
* `javac Main.java`
* `java Main`

## Inside Flatpak (Some people fail):
* `javac Main.java`
* `flatpak install flathub org.freedesktop.Platform//22.08 org.freedesktop.Sdk//22.08 org.freedesktop.Sdk.Extension.openjdk11//22.08`
* `flatpak-builder build-dir --force-clean io.github.flatpakjavabug.json`
* `flatpak-builder --user --install --force-clean build-dir io.github.flatpakjavabug.json`
* `flatpak run io.github.flatpakjavabug`

