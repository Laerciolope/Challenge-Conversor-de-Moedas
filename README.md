# Conversor de Moedas 💰

Este projeto é um conversor de moedas que permite converter valores entre diferentes moedas, utilizando a [ExchangeRate-API](https://www.exchangerate-api.com/) para obter taxas de câmbio atualizadas.

## 📂 Estrutura do Projeto

O projeto é composto por três arquivos principais:

- **Principal.java**: Gerencia o fluxo da aplicação e a interação com o usuário.
- **ConversorMoeda.java**: Realiza a conversão de moedas por meio de requisições HTTP para a API de taxas de câmbio.
- **Moeda.java**: Define um registro (`record`) que armazena os resultados da conversão.

## 🚀 Como Utilizar

1. Clone este repositório:
   ```sh
   git clone [URL_DO_REPOSITORIO]
   ```

2. Navegue até o diretório do projeto:
   ```sh
   cd conversor-moedas
   ```

3. Compile os arquivos Java:
   ```sh
   javac -d . Principal.java ConversorMoeda.java Moeda.java
   ```

4. Execute o programa:
   ```sh
   java Principal
   ```

5. Escolha uma opção do menu e insira um valor para conversão.

## 🛠 Tecnologias Utilizadas

- **Java** para a lógica de programação.
- **Google Gson** para manipulação de JSON.
- **Java HTTP Client** para requisições à API de taxas de câmbio.

## 🔗 API Utilizada

Este projeto utiliza a [ExchangeRate-API](https://www.exchangerate-api.com/) para obter as taxas de conversão entre moedas. 

