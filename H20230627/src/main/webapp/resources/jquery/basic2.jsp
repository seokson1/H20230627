<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>basic2</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
        <script>
            $(document).ready(function () {
                // document.addEventListener('DOMContentLoaded', function(){

                $('li:nth-child(1)').css('background-color', 'yellow');

                let li = $('<li />').text('Melon');
                console.log(li);

                $('ul').append(li);

                //버튼 추가.
                $('li').append($('<button />').text('삭제').on('click', delBtn));
                function delBtn(e) {
                    console.log(e);
                    // e.currentTarget : DOM 요소
                    // $(e.currentTarget) : jquery.객체
                    $(e.currentTarget).parent().remove();
                }

                // 이벤트 등록 방법: on
                $('#del').on('click', function () {
                    $('li:nth-child(1)').remove();
                })


                // })

                // 추가 이벤트
                $('#addBtn').on('click', function(e) {
                     let li =  $('<li />').text($('#userInput').val()).append($('<button />').text('삭제').on('click',delBtn));
                     // $('ul').prepend(li); // 첫번째 부터 계속 추가
                     //li.appendTo($('ul'));  // 맨 뒤에서 부터 계속 추가
                     $('li:nth-child(2)').after(li); // 특별한 위치에 지정하여 추가 할 때 after 사용 이전에 넣기는 before
                     
                      $('#userInput').val('');

                    })
                    //$('button').wrap($('<div />')); wrap 어떤 요소를 감싸다 
                });
        </script>
    </head>

    <body>

        <button id="del">요소제거</button>
        <input id="userInput"><button id="addBtn">추가</button>

        <ul>
            <li>Apple</li>
            <li>Banana</li>
            <li>Cherry</li>
        </ul>

    </body>

    </html>