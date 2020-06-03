//Autor: Kevin Araya Granados

const array1 = [2, 3, 4, 6];
const array2 = [123, 67, 890, 4];
const array3 = [2, 3, 7, 9, 4, 5, 6, 9, 12];

function multiplicate (numbers){

    var result = new Array();

    for (number of numbers){

       var member = 1;
        for(n of numbers){
            
            if (n !== number) {
                member = member * n;
                  
            } 
             
       } 

       result.push(member); 
    }
    document.getElementById("total").innerHTML = result;
    console.log(result);
 
}

document.getElementById("button1").onclick = function (){
    multiplicate(array1);
}

document.getElementById("button2").onclick = function (){
    multiplicate(array2);
}

document.getElementById("button3").onclick = function (){
    multiplicate(array3);
}



