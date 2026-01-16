# 🚀 HelloVPS

Um projeto de teste para demonstrar a criação de uma **VPS na Oracle Cloud**, subir **containers Docker** e integrar o **Google OAuth2** com Spring Boot.

---

## 🌐 Link do endpoint

Você pode testar o login com Google acessando:

[http://vps-fabricio.duckdns.org/hellovps](http://vps-fabricio.duckdns.org/hellovps)

---

## 🛠 Tecnologias usadas

* **Java 17**
* **Spring Boot 4.0.1**
* **Spring Security OAuth2 Client**
* **Spring Data JPA** com MySQL/MariaDB
* **Spring Mail** (Envio de emails)
* **Docker & Docker Compose**
* **Oracle Cloud VPS**
* **Maven** para build e gerenciamento de dependências

---

## 📦 Estrutura do projeto

```
helloVPS/
├── src/main/java/com/fabricio/helloVPS
│   ├── controller/      -> Endpoints REST
│   ├── entity/          -> Entidades JPA
│   ├── repository/      -> Repositórios JPA
│   ├── service/         -> Lógica de serviço (Emails, OAuth2)
│   └── config/          -> Configurações do Spring Security
├── src/main/resources
│   └── application.yml  -> Configurações de banco, OAuth2 e email
├── docker-compose.yml   -> Containers da aplicação e banco
├── pom.xml              -> Gerenciamento de dependências Maven
└── HELP.md              -> Referências e documentação
```

---

## ⚙️ Como rodar localmente

1. Clone o projeto:

```bash
git clone https://github.com/seu-usuario/helloVPS.git
cd helloVPS
```

2. Crie um arquivo `.env` com suas variáveis de ambiente:

```
CLIENT_ID=seu-client-id-google
CLIENT_SECRET=seu-client-secret-google
EMAIL_USERNAME=seu-email@gmail.com
EMAIL_PASSWORD=sua-senha-de-aplicativo
DB_USER=sua-senha-banco-de-dados
DB_PASSWORD=sua-senha-banco-de-dados
DB_URL=jdbc:mysql://db:3306/hellovps?allowPublicKeyRetrieval=true&useSSL=false&createDatabaseIfNotExist=true
```

> 🔐 **Dica:** Nunca versionar `.env` com credenciais sensíveis.

3. Suba os containers Docker:

```bash
docker-compose up --build
```

4. Acesse o endpoint:

```
http://localhost:8080/hellovps
```

---

## 📧 Funcionalidades

* Login via **Google OAuth2**
* Armazenamento de usuários no **MariaDB**
* Envio automático de **emails HTML**
* Redirecionamento para página de sucesso após login

---

## ⚡ Observações

* Projeto criado apenas para **testes e aprendizado**
* VPS utilizada: **Oracle Cloud**
* Containers Docker configurados para: **App Spring Boot + MariaDB**

---

## 🌟 Autor

**Fabrício Ferreira de Lima**
Estudante de programação back-end.

💡 Experimente logar com Google e veja o envio de emails funcionando!
