var tela = document.querySelector('canvas');
var pincel = tela.getContext('2d');

pincel.fillStyle = 'gray';
pincel.fillRect(0, 0, 600, 400);

var raio = 10;
var xAleatorio;
var yAleatorio;

function desenhaCirculo(x, y, raio, cor) {
    pincel.fillStyle = cor;
    pincel.beginPath();
    pincel.arc(x, y, raio, 0, 2 * Math.PI);
    pincel.fill();
}

function limpaTela() {
    pincel.clearRect(0, 0, 600, 400);
}

function desenhaAlvo(x, y){
    // the order will be big first and smaller last
    desenhaCirculo(x, y, raio+20, "red")
    desenhaCirculo(x, y, raio+10, "white")
    desenhaCirculo(x, y, raio, "red")
}

function sorteiaPosicao(max){
    return Math.floor(Math.random() * max)
}

function atualizaTela() {
    limpaTela()
    xAleatorio = sorteiaPosicao(600);
    yAleatorio = sorteiaPosicao(400);
    desenhaAlvo(xAleatorio, yAleatorio);
}

setInterval(atualizaTela, 1000);

function dispara(evento) {
    var x = evento.pageX - tela.offsetLeft;
    var y = evento.pageY - tela.offsetTop;

    if ((x > xAleatorio - raio) 
        && (x > xAleatorio + raio) 
        && (y > xAleatorio - raio) 
        && (y > yAleatorio + raio)) {
            
            alert("Voce acertou")
    }
}

tela.onclick = dispara;