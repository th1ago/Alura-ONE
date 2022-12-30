var textArea = document.querySelector("#mensagem");

function criptografa() {
    var crypto = textArea.replace(/e/g, "enter").replace(/i/g, "imes").replace(/a/g, "ai").replace(/o/g, "ober").replace(/u/g, "ufat")

    document.getElementById('card').innerHTML = '<textarea readonly id="output-texto">' + crypto + 
    '</textarea>' + '<button class="btn-copiar" id="copiar" onclick="copiar()">Copiar</button>'

    console.log(crypto);
}

function descriptografa(){
    
}

function copiar() {
    var copia = document.getElementById("output-texto");

    copia.select();
    document.execCommand("copy");

    console.log(copia);
}