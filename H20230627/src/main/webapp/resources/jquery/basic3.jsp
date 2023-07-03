<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>basic3.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script>
    // $(document).ready(function(){

    //     $('button').on('click',function(e){
    //     let tr = $('<tr />');
    //     tr.append($('<td />').text($('.id').val()));
    //     tr.append($('<td />').text($('.name').val()));

    //         $('.id').val('')
    //         $('.name').val('')

    //         $('#target').append(tr);
    //     });
    // })
    
    $(document).ready(function(){

    
    function addBtn(e) {
    let tr = $('<tr />');
    tr.append($('<td />').text($('.id').val()));
    tr.append($('<td />').text($('.name').val()));

        $('.id').val('')
        $('.name').val('')

        $('#target').append(tr);
        }
        $('button').on('click',addFnc2)
        function addFnc2(e) {

            if($('input.id').val()==false || $('input.name').val() == false) {
                alert('값을 입력하세요.');
                return;
            }
            let cloned = $('.clone').clone();
            cloned.css('display', 'table-row');
            cloned.removeClass('clone');
            cloned.find('td.id').text($('input.id').val());
            cloned.find('td.name').text($('input.name').val());
            console.log(cloned);
            $('#target').append(cloned);

            //init
            $('input.id').val('');
            $('input.name').val('');
        }
   
    });


</script>
</head>
<body>
    ID:<input class="id">
    Name:<input class="name">
    <button>등록</button>
    <br>
    <table border="1">
        <thead>
        <tr>
            <th>아이디</th>
            <th>이름</th>
        </tr>
    </thead>
    <tbody id="target">
        <tr class="clone"  style="display: none;">
            <td class="id"></td>
            <td class="name"></td>
        </tr>
    </tbody>
    </table>
</body>
</html>