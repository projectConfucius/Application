/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function calcscore() {
    var score = 0;
    $(".calc:checked").each(function() {
        score += parseInt($(this).val(), 10);
    });
    $("input[name=sum]").val(score)
}
$().ready(function() {
    $(".calc").change(function() {
        calcscore()
    });
});


