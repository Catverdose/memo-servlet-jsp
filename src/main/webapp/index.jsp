<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>메모 프로젝트</title>
</head>
<body>

    <h1>메모 프로젝트</h1>

    <form action="${pageContext.request.contextPath}/memos" method="get">
        <button type="submit">메모 목록 보기</button>
    </form>

</body>
</html>