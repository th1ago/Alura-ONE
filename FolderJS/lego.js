var tela = document.querySelector("canvas")
var pincel = tela.getContext("2d")

// head
pincel.fillStyle = "lightgrey";
pincel.fillRect(200, 50, 350, 300);

// eye
pincel.fillStyle = "green";
pincel.fillRect(250, 110, 90, 90);
pincel.fillRect(410, 110, 90, 90);

// nose
pincel.fillStyle = "red";
pincel.fillRect(340, 200, 70, 100);

// legs
pincel.fillStyle = "black";
pincel.fillRect(300, 240, 40, 110);
pincel.fillRect(410, 240, 40, 110);