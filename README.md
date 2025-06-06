[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/hnrTHX4T)
 # ✅ README: Exercício — Encapsulamento, Herança, Relacionamento e Coleções em Java

## 📚 Sistema de Gerenciamento de Biblioteca Pessoal

📝 Descrição
Neste exercício, você irá desenvolver um sistema simples para gerenciar livros de uma biblioteca pessoal. O sistema terá uma classe base chamada Livro, da qual herdarão as subclasses LivroFisico e LivroDigital. Cada livro será associado a um Autor. Todos os livros serão armazenados em uma coleção do tipo ArrayList.

## 📦 Requisitos
1. **Classe Autor**
Atributos privados:

 - nome (String)

 - nacionalidade (String)

Métodos:
 Getters e setters para ambos os atributos.

2. **Classe Base: Livro**
Atributos privados:

 - titulo (String)

 - anoPublicacao (int)

 - autor (Autor)

Métodos:

 - Getters e setters para todos os atributos.

 - Método `exibirDetalhes()` que imprime os dados do livro e do autor.

3. **Subclasse: LivroFisico**
Herda de Livro.

Atributo adicional:

 - numeroDePaginas (int)

Métodos:

 - Getter e setter para numeroDePaginas.

 - Sobrescreva o método `exibirDetalhes()` para incluir o número de páginas.

4. **Subclasse: LivroDigital**
Herda de Livro.

Atributo adicional:

 - `tamanhoDoArquivoMB` (double)

Métodos:

 - Getter e setter para `tamanhoDoArquivoMB`.

 - Sobrescreva o método exibirDetalhes() para incluir o tamanho do arquivo.

# 🧪 5. Teste a Aplicação (Main)
Crie uma ArrayList`<Livro>` chamada biblioteca.

Crie pelo menos dois objetos LivroFisico e dois objetos LivroDigital.

Crie objetos Autor e associe a cada livro.

Adicione os livros à lista biblioteca.

Percorra a lista e chame o método `exibirDetalhes()` de cada livro.

## 📌 Exemplo de Saída Esperada

Livro Físico - Título: Dom Casmurro, Ano: 1899, Páginas: 256
Autor: Machado de Assis, Nacionalidade: Brasileira

Livro Digital - Título: Clean Code, Ano: 2008, Tamanho: 1.5MB
Autor: Robert C. Martin, Nacionalidade: Americana
