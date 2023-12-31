package edu.eci.arep.Services;

/**
 * Cliente de busqueda de archivos dentro del disco duro
 * @version 1.0
 */
public class SearchService implements Service{


    public String getBody(){
        return "<!DOCTYPE html>"+
                "<html lang=\"es\">"+
                "  <head>"+
                "    <meta charset=\"utf-8\" />"+
                "    <title>BUSCA ARCHIVOS</title>"+
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />"+
                "    <style>"+
                "      * {"+
                "        box-sizing: border-box;"+
                "      }"+
                "      body {"+
                "        background-color: #FF0000;"+
                "        text-align: center;"+
                "        margin: 0;"+
                "        padding: 0;"+
                "      }"+
                "      .header {"+
                "        background-color: #FFFFFF;"+
                "        padding: 5px;"+
                "        text-align: center;"+
                "        font-size: 20px;"+
                "        color: black;"+
                "        border: 2px solid black;"+
                "        border-radius: 5px;"+
                "      }"+
                "      .container {"+
                "        margin-top: 15px;"+
                "        text-align: left;"+
                "        margin-left: 10px;"+
                "        margin-right: 10px;"+
                "      }"+
                "      input {"+
                "        padding: 12px 20px;"+
                "      }"+
                ""+
                "      button {"+
                "        background-color: #FFFFFF;"+
                "        border: 2px solid black;"+
                "        color: black;"+
                "        align: center;"+
                "        position: center;"+
                "        text-align: center;"+
                "        text-decoration: none;"+
                "        display: inline-block;"+
                "        border-radius: 5px;"+
                "        cursor: pointer;"+
                "      }"+
                "    </style>"+
                "    <script>"+
                "      let connected;"+
                "      let ws;"+
                "      let flag = false;"+
                "      function sendJSON() {"+
                "        let path = document.querySelector(\"#path\").value;"+
                "        console.log(path);"+
                "        function makeHttpObject() {"+
                "          if (\"XMLHttpRequest\" in window) return new XMLHttpRequest();"+
                "          else if (\"ActiveXObject\" in window)"+
                "            return new ActiveXObject(\"Msxml2.XMLHTTP\");"+
                "        }"+
                "        function _arrayBufferToBase64(buffer) {"+
                "          var binary = \"\";"+
                "          var bytes = new Uint8Array(buffer);"+
                "          var len = bytes.byteLength;"+
                "          for (var i = 0; i < len; i++) {"+
                "            binary += String.fromCharCode(bytes[i]);"+
                "          }"+
                "          return window.btoa(binary);"+
                "        }"+
                "        var request = makeHttpObject();"+
                "        request.withCredentials = false;"+
                "        request.open(\"GET\", \"http://localhost:35000/file/\" + path, true);"+
                "        request.responseType = \"arraybuffer\";"+
                "        request.send(null);"+
                "        request.onreadystatechange = function () {"+
                "          if (request.readyState == 4) {"+
                "            let responseDec = \"\";"+
                "            if (request.getResponseHeader(\"content-type\").includes(\"image\")) {"+
                "              document.getElementById(\"archivo\").innerHTML ="+
                "                \"No se pueden mostrar imagenes\";"+
                "              document.getElementById(\"archivo\").style.visibility = \"visible\";"+
                "            } else {"+
                "              var enc = new TextDecoder(\"utf-8\");"+
                "              responseDec = enc.decode(request.response);"+
                "              document.getElementById(\"archivo\").innerHTML = responseDec;"+
                "              document.getElementById(\"archivo\").style.visibility = \"visible\";"+
                "              console.log(responseDec);"+
                "            }"+
                "          }"+
                "        };"+
                "        flag = true;"+
                "      }"+
                "    </script>"+
                "  </head>"+
                ""+
                "  <body>"+
                "    <div class=\"header\">"+
                "      <h3>BUSCA ARCHIVOS</h3>"+
                "    </div>"+
                "    <div class=\"container\">"+
                "      <center><input"+
                "        id=\"path\""+
                "        type=\"text\""+
                "        placeholder=\"Escriba el path del archivo\""+
                "      /></center>"+
                "       <div class=\"container\">"+
                "      <center><button type=\"button\" onclick=\"sendJSON()\">Buscar</button></center>"+
                "       <div class=\"container\">"+
                "      <p id=\"archivo\" style=\"color: black\"></p>"+
                "    </div>"+
                "  </body>"+
                "</html>";
    }

    public String getHeader(){
        return "HTTP/1.1 200 OK\r\n"
                + "Access-Control-Allow-Origin: *\r\n"
                + "Content-Type:text/html \r\n"
                + "\r\n";
    }


}
