<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="js/jquery-3.4.1.min.js"></script>
    <script>
        reg = () =
        >
        {
            let username = $("#username").val();
            let password = $("#password").val();
            let userInfo = {"username": username, "password": password};
            $.post("<%=basePath%>/reg", userInfo, function (result) {
                if (result.flag) {
                    $("#info").text(result.msg);
                    $("#info").removeAttr("hidden");
                } else {
                    $("#info").text(result.msg);
                    $("#info").removeAttr("hidden");
                }
            }, "json");
        }
        ;

        login = () =
        >
        {
            let username = $("#username").val();
            let password = $("#password").val();
            let userInfo = {"username": username, "password": password};
            $.post("<%=basePath%>/login", userInfo, function (result) {
                if (result.flag) {
                    $("#info").text(result.msg);
                    $("#info").removeAttr("hidden");
                    window.location.href = "<%=basePath%>/mainList?userId=" + result.userId;
                } else {
                    $("#info").text(result.msg);
                    $("#info").removeAttr("hidden");
                }
            }, "json");


            <%--$.ajax({--%>
            <%--    url: "<%=basePath%>/reg",--%>
            <%--    type: "post",--%>
            <%--    data: userInfo,--%>
            <%--    dataType: "json",--%>
            <%--    success: function (result) {--%>
            <%--        console.log(result.flag);--%>
            <%--    }--%>
            <%--});--%>
        }
    </script>
    <style>
        * {
            margin: 0px;
            padding: 0px;
        }

        input {
            border: none;
            border-bottom: 1px solid #000000;
            width: 20rem;
            height: 2rem;
            font-size: 1.5rem;
            padding-left: 0.5rem;
        }

        .type {
            font-family: "微软雅黑", "黑体", monospace;
            font-size: 2rem;
            margin-right: 1rem;
        }

        button {
            font-size: 2rem;
            width: 10rem;
            background-color: #0693ff;
            color: #ffffff;
            border: 1px solid #0693ff;
            border-radius: 0.3rem;
            margin: 1rem;
        }


        button:hover {
            background-color: #ffffff;
            color: #0693ff;
        }


        p {
            margin: 1rem;
        }

        #info {
            position: fixed;
            top: 0px;
            padding: 1rem;
            font-size: 1rem;
            width: 100%;
            background: #ecffec;
        }


    </style>
</head>
<body>
<div style="display: flex;flex-direction: column;align-items: center;padding-top: 20%;">
    <p>
        <span class="type">用户名</span><input name="username" id="username" type="text" placeholder="UserName">
    </p>
    <p>
        <span class="type">密&#12288;码</span><input name="password" id="password" type="password" placeholder="PassWord">
    </p>
    <p>
        <button onclick="login()">登录</button>
        <button onclick="reg()">注册</button>
    </p>
</div>
<span id="info" hidden></span>
</body>
</html>
