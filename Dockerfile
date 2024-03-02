# Используйте официальный образ базового Java (например, OpenJDK), подходящий для вашего приложения
FROM openjdk:17-jdk-slim

# Установите рабочую директорию внутри контейнера
WORKDIR /app

# Скопируйте ваш собранный JAR-файл в рабочую директорию контейнера
COPY target/MontyHallGame-1.0-SNAPSHOT.jar /app/MontyHallGame.jar

# Запустите ваше приложение
CMD ["java", "-jar", "MontyHallGame.jar"]
