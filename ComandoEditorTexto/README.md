# Exercício - Padrão Comando - Editor de Texto

Alteraçao de projeto para que as classes Avancar, Voltar, e Salvar passem a utilizar o padrão Command.<br/>
Código da TelaCommand alterado no trecho abaixo para usar o padrão comando:

public void actionPerformed(ActionEvent e) {<br/> 
Object o = e.getSource();<br/>
if (o instanceof Avancar) <br/>
((Avancar)o).doAvancar(); <br/>
else if (o instanceof Voltar) <br/>
((Voltar)o).doVoltar(); <br/>
else if (o instanceof Salvar)<br/> 
((Salvar)o).salvar(); <br/>
}<br/>

Diagrama de classe da solução:

![alt tag](https://github.com/GiseliSiqueira/POO2/blob/master/ComandoEditorTexto/ComandoEditorTexto%20-%20Diagrama%20de%20classes.png)
