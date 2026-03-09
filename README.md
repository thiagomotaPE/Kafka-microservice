# 🛒 Venda Service — Kafka Demo

Microsserviço simples desenvolvido com **Java + Spring Boot** para demonstrar o funcionamento básico do **Apache Kafka**.

O serviço envia um ID de venda aleatório, publica a mensagem no Kafka e um consumer consome essa mensagem e exibe no console.

---

## 🔄 Fluxo

```
Producer (venda-service)
        |
        |  "Venda realizada: #a3f9c1"
        ▼
   [Kafka Broker]
        |
        ▼
   Consumer (venda-service)
        |
        ▼
Console: "Venda realizada: #a3f9c1"
```

---

## 🧱 Tecnologias

- Java 17+
- Spring Boot 3.x
- Spring Kafka
- Apache Kafka

---

## 🚀 Como executar

### 1. Subir o servidor Kafka

Consulte o arquivo anexado no repositório com o passo a passo para subir o servidor Kafka localmente.

### 2. Rodar a aplicação

```bash
./mvnw spring-boot:run
```

### 3. Resultado esperado no console

Configure a requisição no Insomnia da seguinte forma:

| Campo | Valor |
|-------|-------|
| Método | `POST` |
| URL | `http://localhost:8081/venda` |
| Body | `"id": "ssdfsdf345345swdgf"` |

### 4. Resultado esperado no console

```
Venda realizada: ssdfsdf345345swdgf
```

---

## 📚 Tutoriais utilizados

| # | Título | Link |
|---|--------|------|
| 1 | MICROSERVIÇOS com JAVA SPRING e KAFKA - Comece por aqui | [Assistir no YouTube](https://www.youtube.com/watch?v=dITqvVB34ys&t=3652s) |
| 2 | Como subir o servidor Kafka | [Assistir no YouTube](https://www.youtube.com/watch?v=2wQ2XIy5WDM) |

> O tutorial 2 também está disponível como arquivo anexado neste repositório.
> Para uma melhor visualização do serviço do Kafka recomendo utilizar o Kafka Tools(Offset Explorer)