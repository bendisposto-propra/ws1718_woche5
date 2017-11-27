# BBB
Die aus dem ersten Praktikum bekannte Eisdielen Marketing-Anwendung soll auf das Spring Framework portiert werden. In diesem Repository finden Sie eine Version, die bereits Dependency Injection verwendet. Das passiert hier aber noch per Hand. Ihre Aufgabe ist es, die Anwendung so umzuschreiben, dass die Konstruktion von Klassen mit Hilfe des Spring Frameworks statt per Hand durchgeführt wird.

Implementieren Sie in einem neuen Branch `xml`  eine Version, die mit Hilfe einer XML Konfiguration funktioniert und in einem neuen Branch `annotation` eine Version, die mit Hilfe von Annotationen funktioniert.

# Anwendung konfigurieren und Ausführen
Im Folgenden ist beschrieben, wie Sie die Anwendung für einen Systemtest konfigurieren und in Betrieb nehmen können. 

## Konfiguration
Die Anwendung wird über eine Datei `src/main/resources/credentials.properties` konfiguriert. Es wird ein Google Mailaccount  enötigt und ein API Key von [Open Weathermap](http://openweathermap.org/api).

Die Datei hat folgende Form:
```
mail.user=someaccount@gmail.com
mail.password=passwordfortheaccount
forecast.key=theapikey
```

Es gibt zusätzlich eine Datei `src/main/resources/customers.txt`, in der der initiale Inhalt der Kundendataenbank gespeichert ist.

## Ausführen der Anwendung
Die Anwendung besteht aus zwei Programmen. Ein Programm zur Initialisierung der Datenbank und die Marketinganwendung. Die Programme können aus Gradle heraus gestartet werden, dazu existieren zwei Tasks ```initDB``` um die Datenbank zu initialisieren und ```run```, um die Marketinganwendung zu starten.
