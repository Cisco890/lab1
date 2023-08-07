public class Dado{

    int lazamiento(){
    int cara= (int)(Math.random()*6 + 1);
    return cara;
    }


   
}
// El dado del juego, funciona con la librería Math.random(), me ayudé de este código https://www.lawebdelprogramador.com/foros/Java/1692149-Programa-de-lanzamiento-de-dados.html 