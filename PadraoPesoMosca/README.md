
# Exercício -  Padrão Peso Mosca 

Implementação de um sistema de vendas mostrado no modelo abaixo.
* Implementação sem utilizar o padrão FlyWeight;
* Implementação utilizando o padrão FlyWeight;
* Criação das classes Main utilizando e não utilizando o padrão;
* .txt contendo a diferença de consumo de memória para as duas implementações.

A classe StatusItem pode ser compartilhada entre os itens do pedido(ItemPedido), pois ele é imutável, ou seja, seus atributos não mudam depois da sua criação.
Ela pode ser criada com as seguintes configurações de atributos: <br><br>


![alt text](https://github.com/GiseliSiqueira/POO2/blob/master/PadraoPesoMosca/diagrama_peso_mosca.png)



```
new StatusItem(Estado.CARRINHO, true, false);
new StatusItem(Estado.FECHADO, true, false);
new StatusItem(Estado.PAGO, true, true);
new StatusItem(Estado.ENVIADO, false, true);
new StatusItem(Estado.ENTREGUE, false, true);
```

<br>
<br>

Para a Main sem o padrão faça:
```
public static void main(String[] args) {            
        ArrayList<Pedido> pedidos = new ArrayList();        
        for(int i=0; i< 200000; i++){             
            Pedido pedido = new Pedido();
            Item item1 = new Item();
            item1.setDescricao("lapis de cor modelo xyz");
            item1.setNome("lapis");                        
            item1.setStatus(new StatusItem(StatusItem.Estado.CARRINHO , true, false));
            Item item2 = new Item();
            item2.setDescricao("caneta cor azul");
            item2.setNome("caneta");                                    
            item2.setStatus(new StatusItem(StatusItem.Estado.CARRINHO , true, false));
            Item item3 = new Item();
            item3.setDescricao("caneta cor vermelha");
            item3.setNome("caneta");                        
            item3.setStatus(new StatusItem(StatusItem.Estado.CARRINHO , true, false));                       
            pedido.addItemPedido(item1);
            pedido.addItemPedido(item2);
            pedido.addItemPedido(item3);                                   
            pedidos.add(pedido);
        }
        System.out.println("KB: " + (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024);        
        System.out.println(pedidos.size());    
    }
```

Para a main com o padrão faça:<br>

```
public static void main(String[] args) {            
        ArrayList<Pedido> pedidos = new ArrayList();        
        for(int i=0; i< 200000; i++){             
            Pedido pedido = new Pedido();
            Item item1 = new Item();
            item1.setDescricao("lapis de cor modelo xyz");
            item1.setNome("lapis");                        
            item1.setStatus(FlyweightStatusItem.get(StatusItem.Estado.CARRINHO));
            Item item2 = new Item();
            item2.setDescricao("caneta cor azul");
            item2.setNome("caneta");                                    
            item2.setStatus(FlyweightStatusItem.get(StatusItem.Estado.CARRINHO));
            Item item3 = new Item();
            item3.setDescricao("caneta cor vermelha");
            item3.setNome("caneta");                        
            item3.setStatus(FlyweightStatusItem.get(StatusItem.Estado.CARRINHO));                       
            pedido.addItemPedido(item1);
            pedido.addItemPedido(item2);
            pedido.addItemPedido(item3);          
            pedidos.add(pedido);                         
        }
        System.out.println("KB: " + (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024);        
        System.out.println(pedidos.size());
    }
```

## Qual a diferença entre dos dois códigos?? 

A diferença é a criação do objeto para setar o status do pedido, onde sem o padrão os parametros são passados para o metodo a cada instancia do objeto (e podem ser alterados!). Já com o padrão, os status não mudam (e são compartilhados) e já são armazenados em um ArrayList dentro da classe do padrão, sendo passado apenas o nome do status para que suas configurações sejam recuperadas.



