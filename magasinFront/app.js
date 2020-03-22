$(document).ready(function() {    
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/articles",        
        dataType: "json",
        success: function(data){
            console.log(data)
            createTable(data)    
        },
        failure: function(errMsg) {
            console.log("failure" + errMsg)                
        } 
    })
})

function createTable(data) {

    for(var i = 0; i < data.length; i++) {
        $("tbody").append(
            "<tr>"+
                "<td>"+ data[i].id + "</td>" +
                "<td>"+ data[i].name + "</td>" +
                "<td>"+ data[i].price + "</td>" +
            "</tr>");
    }   
}