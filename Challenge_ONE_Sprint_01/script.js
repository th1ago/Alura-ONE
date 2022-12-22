document.querySelector('button').addEventListener('click', criptografa);
document.querySelector('button').addEventListener('click', descriptografa);

function criptografa(){

    var mensagem = document.dados.msg.value;
    var ascii = 0;
    x=0;

    console.log(mensagem)

    while(mensagem[x]) {
        ascii = mensagem[x].charCodeAt();
        ascii+=3;

    document.dados.mensagem2.value += String.fromCharCode(ascii);
    x++;

    }
}


function descriptografa(){

}