<html>
<head>
    <meta charset="UTF-8">
    <title>修改页面</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
</head>
<body>
<form id="updateform">
    <input type="hidden" name="userId" value="${user.userId}">
    <table border="1">
        <tr>
            <td>账号</td>
            <td>
                <input type="text" name="userAccount" value="${user.userAccount}">
            </td>
        </tr>
    </table>
    <br>
    <input type="button" onclick="submitToForm()" value="确认">
</form>
<script type="text/javascript">
    function submitToForm(){
        $.ajax({
            url:"updateUserTemp.jhtml",
            type:"post",
            data:$("#updateform").serialize(),
            success:function (msg){
                location.href="selectUserListTemp.jhtml"
            }
        })
    }
</script>
</body>
</html>