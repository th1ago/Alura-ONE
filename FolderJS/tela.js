var tela = document.querySelector("canvas")
var pincel = tela.getContext("2d")

pincel.fillStyle = "red";
pincel.fillRect(0, 0, 600, 400);

function exibeAlerta() {
    alert("Cliquei");
}

tela.onclick = exibeAlerta;