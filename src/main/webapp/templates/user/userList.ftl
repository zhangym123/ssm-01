<html>
    <head>
        <meta charset="UTF-8">
        <title>郭老头</title>
        <script type="text/javascript" src="/js/jquery.min.js"></script>
    </head>
    <body>
        <h1> <font color="violet">郭哥 you love me ?</font></h1>
        <input type="button" value="新增" onclick="addUser()">
        <table border="1">
            <tr>
                <td>id</td>
                <td>账号</td>
                <td>操作</td>
            </tr>
            <#list map.list as item>
                <tr
                    <#if item.userId % 2 == 0 && item.userId &gt; 1 >
                            style="background-color: aqua"
                    <#else>
                            style="background-color: hotpink"
                    </#if>>
                    <td>
                        <#if item.userId == 1>
                            <font color="#dc143c">ccc</font>
                        <#else>
                            #{item.userId}
                        </#if>
                    </td>
                    <td>${item.userAccount}</td>
                    <td>
                        <input type="button" value="删除" onclick="deleteUserByIdTemp(${item.userId})">
                        <input type="button" value="修改" onclick="huiXianByIdTemp(${item.userId})">
                    </td>
                </tr>
            </#list>
        </table>
    <script>
        function addUser(){
            location.href = "toAddPage.jhtml";
        }

        function deleteUserByIdTemp(id) {
            location.href="deleteUserByIdTemp.jhtml?userId="+id;
        }

        function huiXianByIdTemp(id){
            location.href="huiXianByIdTemp.jhtml?userId="+id;
        }

    </script>
    </body>
</html>