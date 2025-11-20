# 📚 Lista de Exercícios - Coleções em Java

[![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=flat&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

Repositório dedicado a exercícios práticos sobre **Collections Framework** em Java, explorando as principais estruturas de dados: **List**, **Set** e **Map**.

## 🎯 Objetivo

Consolidar o conhecimento sobre coleções em Java através da prática, abordando:
- Manipulação de List (ArrayList, LinkedList)
- Operações com Set (HashSet, TreeSet, LinkedHashSet)
- Uso de Map (HashMap, TreeMap, LinkedHashMap)
- Iteração, ordenação e busca em coleções
- Comparators e Comparable
- Stream API (quando aplicável)

## 📋 Estrutura do Projeto

```
lista_de_exercicios_de_colecoes/
├── src/
│    ├── Ex_01.java 
│    ├── Ex_02.java  
│    ├── Ex_03.java        
│    ├── (...) 
│    └── Ex_20 
└── README.md
```

## 🚀 Exercícios Implementados

### 📝 List
- [ ] Adicionar e remover elementos
- [ ] Buscar elementos por índice e valor
- [ ] Ordenar lista de objetos
- [ ] Filtrar elementos com predicados
- [ ] Converter arrays para listas e vice-versa

### 🔢 Set
- [ ] Remover duplicatas de uma coleção
- [ ] Comparar conjuntos
- [ ] Ordenar elementos com TreeSet

### 🗂️ Map
-  Adicionar, buscar e remover pares chave-valor
-  Iterar sobre chaves, valores e entries
-  Contar frequência de elementos

## 🛠️ Tecnologias Utilizadas

- **Java 17+**

## 📖 Conceitos Abordados

### List (Interface)
Coleções ordenadas que permitem elementos duplicados.
```java
List<String> lista = new ArrayList<>();
lista.add("Java");
lista.add("Python");
lista.add("Java"); // duplicata permitida
```

### Set (Interface)
Coleções que não permitem elementos duplicados.
```java
Set<Integer> conjunto = new HashSet<>();
conjunto.add(1);
conjunto.add(2);
conjunto.add(1); // ignorado - duplicata
```

### Map (Interface)
Coleções de pares chave-valor, sem chaves duplicadas.
```java
Map<String, Integer> mapa = new HashMap<>();
mapa.put("idade", 29);
mapa.put("ano", 2025);
```

## 📚 Recursos de Estudo

- [Oracle - Collections Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html)
- [Baeldung - Java Collections](https://www.baeldung.com/java-collections)
- [Java Collections Cheat Sheet](https://zeroturnaround.com/rebellabs/java-collections-cheat-sheet/)
 
## 📝 Licença

Este projeto está sob a licença MIT.

## 👤 Autor

**José Paulo Froes**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-José%20Froes-0077B5?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/josepaulofroes/)
[![GitHub](https://img.shields.io/badge/GitHub-jfroes-181717?style=flat&logo=github&logoColor=white)](https://github.com/jfroes)
[![Email](https://img.shields.io/badge/Email-josepaulo.froes@gmail.com-D14836?style=flat&logo=gmail&logoColor=white)](mailto:josepaulo.froes@gmail.com)

---

<div align="center">

*Desenvolvido com ☕ e Java*

</div>