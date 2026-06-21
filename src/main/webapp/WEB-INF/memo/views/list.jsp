<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="memo.dto.MemoDto" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>메모 목록</title>
</head>
<body>

<h1>메모 목록</h1>

<%
    List<MemoDto> memoList =
        (List<MemoDto>) request.getAttribute("memoList");

    if (memoList == null || memoList.isEmpty()) {
%>

    <p>등록된 메모가 없습니다.</p>

<%
    } else {
        for (MemoDto memo : memoList) {
%>

    <div>
        <h2><%= memo.getTitle() %></h2>
        <p><%= memo.getContent() %></p>
        <hr>
    </div>

<%
        }
    }
%>

</body>
</html>