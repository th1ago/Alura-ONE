function desenhaQuadrado(x, y, cor) {
    var tela = document.querySelector('canvas');
    var pincel = tela.getContext('2d');

    pincel.fillStyle = cor;
    pincel.fillRect(y, y, 50, 50);
    pincel.fillStroke = "black"
    pincel.strokeRect(y, y, 50, 50);
        
}
var x = 0;

while (x < 600) {
    desenhaQuadrado(x, 0, " red")
    x = x + 50;
}

// for (var x = 0; x < 600; x = x + 50){
//     desenhaQuadrado(x, 0, "yellow")
// }