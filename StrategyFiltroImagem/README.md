# Exercício - Padrão Estratégia - Filtro de Imagem

Alteração de projeto visto em sala para implementar o filtro da imagem utilizando o padrão Strategy. 

case 0: /* original */<br/>
return; <br/>
case 1: /* low pass filter */<br/>
case 2: /* sharpen */<br/>
float[] data = (opIndex == 1) ? BLUR3x3 : SHARPEN;<br/>
op = new ConvolveOp(new Kernel(3, 3, data),<br/>
ConvolveOp.EDGE_NO_OP,<br/>
null);<br/>

break;<br/>
case 3 : /* lookup */<br/>
byte lut[] = new byte[256];<br/>
for (int j=0; j<256; j++) {<br/>
lut[j] = (byte)(256-j); <br/>
}<br/>
ByteLookupTable blut = new ByteLookupTable(0, lut); <br/>
op = new LookupOp(blut, null);<br/>
break;<br/>
}<br/>

Diagrama de classe da solução:

![alt tag](https://github.com/GiseliSiqueira/POO2/blob/master/StrategyFiltroImagem/Strategy%20-%20Filtro%20Imagem%20-%20Diagrama%20de%20classes.png)
