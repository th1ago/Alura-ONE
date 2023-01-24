var textArea = document.querySelector("#mensagem");

function criptografa() {
    var txt = textArea ? textArea.value : '';

    var crypto = txt.replace(/e/g, "enter").replace(/i/g, "imes").replace(/a/g, "ai").replace(/o/g, "ober").replace(/u/g, "ufat")

    document.getElementById('card').innerHTML = '<textarea readonly id="output-texto">' + crypto + 
    '</textarea>' + '<button class="btn-copiar" id="copiar" onclick="copiar()">Copiar</button>'
}

function descriptografa(){
    var txt = textArea ? textArea.value : '';

    var outCrypto = txt.replace(/enter/g, "e").replace(/imes/g, "i").replace(/ai/g, "a").replace(/ober/g, "o").replace(/utaf/g, "u")

    document.getElementById('card').innerHTML = '<textarea readonly id="output-texto">' + outCrypto + 
    '</textarea>' + '<button class="btn-copiar" id="copiar" onclick="copiar()">Copiar</button>'
}

function copiar() {
    var copia = document.getElementById("output-texto");

    copia.select();
    document.execCommand("copy");
}