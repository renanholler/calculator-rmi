# Usar uma imagem base com JDK
FROM openjdk:11-jdk-slim

# Definir o diretório de trabalho
WORKDIR /app

# Copiar os arquivos necessários para o container
COPY ./src /app/src

# Compilar os arquivos Java
RUN javac -d /app/bin /app/src/*.java

# Definir o comando padrão para iniciar o container
CMD ["java", "-cp", "/app/bin", "CalculatorServer"]