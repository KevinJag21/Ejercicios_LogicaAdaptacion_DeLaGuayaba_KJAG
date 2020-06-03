//Autor: Kevin Araya Granados

function calculateFactorial(){
    var number = document.getElementById("number").value;
    console.log(number);
    var factorial = 1;
    if(number == 0){
        document.getElementById("result").innerHTML = factorial;
    }else{
      
        while ( number > 1 ){
            factorial = factorial * number;
            number--;
        }

        document.getElementById("result").innerHTML = factorial;
    }
}