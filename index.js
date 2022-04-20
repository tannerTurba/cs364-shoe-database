//index.js 

let today = new Date();
let dayOfWeek = today.getDay();
if(dayOfWeek === 0 || dayOfWeek === 6){
    document.writeln("It's the weekend, leave me alone");
}

function showMessage(message){
    const formInfo = document.getElementById("formInfo");
    formInfo.innerHTML = "<p>" + message + "</p>";
}

function clearMessage(){
    formInfo.innerHTML = "";
}

const contactForm = document.getElementById("contactForm");
contactForm.addEventListener("submit", function (event){
    event.preventDefault();
    showMessage("sending your email...");
});

const expirences = document.getElementsByClassName("class");

for(let x = 0; x < expirences.length; x++){
    const item = expirences[x];
    item.addEventListener("mouseenter", function(event){
        event.target.style = "background-color: #999999;";
    });
    item.addEventListener("mouseleave", function(event){
        event.target.style = "";
    });
}