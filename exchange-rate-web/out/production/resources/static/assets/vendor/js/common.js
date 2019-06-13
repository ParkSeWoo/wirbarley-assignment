$(document).ready(function() {
    var rateUrl = "/v1/exchange-rate/currency?currency=";
    var calUrl = "/v1/exchange-rate/currency/calculation";

    $("#result_area").hide();

    $('#recipient-country').change(function () {
        var currency = $(this).val();
        $.ajax({
            url: rateUrl + currency,
            type:"GET",
            success : function (data) {
                var map = data.quotes;
                $('#exchange-rate').text(numberWithCommas(resultMap(map,"USD"+currency)) + " " + currency + "/USD");
            },
            error : function (e) {
                console.log(e.responseText);
            }
        });

    });

    $('#btn-submit').on('click',function() {

        var currency = $("#recipient-country option:selected").val();
        var price = $("#remittance-amount").val();

        if(!validation(currency, price)) return false;

        $.ajax({
            url: calUrl,
            type:"POST",
            data:{"currency":currency,"price":price},
            success : function (data) {

                $("#result_area").show();
                $("#amount-received").text(data.price);
                $("#currency").text(data.currencyType);
            },
            error : function (e) {
                //서버에서 주는 에러 추가 혹시나 모를 스크립트 조작으로.. 테스트하실까봐..
                var obj;
                if (e.responseText != null || e.responseText != undefined) {
                    obj = JSON.parse(e.responseText);
                }

                if (obj.code < 0) {
                    alert(obj.error);
                }

                console.log(e.responseText);
            }
        });
    });


});

var resultMap = function(map,k) {
    return map[k];
}

var numberWithCommas = function(x) {
    var y = Math.floor(x*100)/100;
    y = y.toFixed(2);
    return y.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
}

var validation = function(currency, price) {
    var i = 0;
    $('#recipient-country').each(function(index){
        if($(this).val() == currency) {
            i++;
        }
    });

    if (i <= 0) {
        alert("수취국가를 선택하셔야 합니다.");
        $('#recipient-country').focus();
        return false;
    }

    price = parseInt(price);

    /*if (price <= 0 || price > 10000) {
        alert("송금액(USD)이 바르지 않습니다.");
        $("#remittance-amount").focus();
        return false;
    }*/

    return true;
}





