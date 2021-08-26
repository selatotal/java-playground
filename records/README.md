# Java Records

Teste com Java Records utilizando Java 16

Esta POC verifica o funcionamento do tipo Records em Java e o seu funcionamento em serialização/deserialização com JSON

Os testes:
1 - Criação de record pelo construtor
2 - Criação de record via deserialização com GSON
3 - Criação de record via deserialização com Jackson
4 - Serialização do record via deserialização com GSON
5 - Serialização do  record via deserialização com Jackson
6 - Comportamento do toString
7 - Verificar se um record com os mesmos dados de outro podem ser comparados com igualdade

Até o momento desta POC, a DESERIALIZAÇÃO VIA GSON ainda não está OK (versão 2.8.8 da Gson). Existe uma issue em https://github.com/google/gson/issues/1794 para realizar esta verificação.

Os demais testes estão OK

Para executar:
```shell
gradle app:run
```