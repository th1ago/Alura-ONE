var tela = document.querySelector("canvas")
var pincel = tela.getContext("2d")

pincel.fillStyle = "red";
pincel.fillRect(0, 0, 600, 400);

function exibeCirculo(evento) {
    var x = evento.pageX - tela.offsetLeft;
    var y = evento.pageY - tela.offsetTop;

    pincel.fillStyle = "yellow";
    pincel.beginPath();
    pincel.arc(x, y, 10, 0,2 + 3.14);
    pincel.fill();

}

// onclick esta aguardando a funcao exibeCirculo
tela.onclick = exibeCirculo;