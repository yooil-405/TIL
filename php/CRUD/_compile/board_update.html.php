<?php /* Template_ 2.2.8 2022/10/12 09:28:58 /Users/dev1/Desktop/TIL/php/CRUD/_template/board_update.html 000001282 */ 
$TPL_post_1=empty($TPL_VAR["post"])||!is_array($TPL_VAR["post"])?0:count($TPL_VAR["post"]);?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>update</title>
</head>
<body>

    <h1>수정 페이지</h1>
<?php if($TPL_post_1){foreach($TPL_VAR["post"] as $TPL_V1){?>
    <label for="title">제목</label>
    <input type="text" id="title" value="<?php echo $TPL_V1["title"]?>" size="50"> <br>

    <label for="text">게시판</label>
    <select name="board_select" id="board_select" tabindex="-1" class="select2-hidden-accessible" aria-hidden="true">
        <option value="no_data" selected="a">게시판 선택</option>
        <option value="a">공지사항</option>
        <option value="b">정보보안 뉴스</option>
        <option value="c">사내뉴스레터</option>
    </select> <br>

    <label for="text">내용</label>
    <textarea name="" id="text" cols="30" rows="10"></textarea> <br>

    <button>수정하기</button>
    <button>취소</button>
<?php }}?>

    
</body>
</html>