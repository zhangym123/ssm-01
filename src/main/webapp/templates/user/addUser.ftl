<html>
<head>
    <meta charset="UTF-8">
    <title>新增页面</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
</head>
<body>
    <form id="userform">
        <table border="1">
            <tr>
                <td>账号</td>
                <td>
                    <input type="text" name="userAccount" >
                </td>
            </tr>
        </table>
        <br>
        <input type="button" onclick="submitForm()" value="确认">
    </form>
<script type="text/javascript">
    function submitForm(){
        $.ajax({
            url:"insertUserTemp.jhtml",
            type:"post",
            data:$("#userform").serialize(),
            success:function (msg){
                location.href="selectUserListTemp.jhtml"
            }
        })
    }
</script>
</body>
</html>