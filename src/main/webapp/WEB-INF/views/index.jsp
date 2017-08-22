<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/8/21
  Time: 上午9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--bootstrap模板框架基础--%>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述的meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>首页</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
</head>
<body>
<div class="row">
    <div class="col-md-2"></div>
    <div class="col-md-8">
        <br/>
        <h2>留言板</h2>
        <br/>
        <textarea id="content" class="form-control" rows="3"></textarea>
        <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-8"></div>
            <div class="col-md-2">
                <div class="row">
                    <div class="col-md-5"></div>
                    <div class="col-md-7">
                        <button type="button" id="btn1" class="btn btn-info">&nbsp;发布&nbsp;</button>
                    </div>
                </div>
            </div>
        </div>
        <br/>
        <table class="table" id="table1">
        </table>
        <nav aria-label="Page navigation">
            <ul class="pagination">
                <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
                <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
                ...
            </ul>
        </nav>

    </div>
    <div class="col-md-2"></div>
</div>
</body>
<script>
//    $("#btn1").click(function () {
//        var val = $("#content").val();
//        alert(val);
//        $.ajax({
//            url:"/",
//            type:"get",
//            data:{
//
//            }
//        })
//    })
    function showBorad(id,content,time,topCount,treadCount,userName){
        var tdLeft = $("<td class='active' width='300'></td>").html("&nbsp;&nbsp;&nbsp;&nbsp;<span>用户:</span>" +
            "<span>" + userName+ "</span>" +
            "<p>&nbsp;&nbsp;&nbsp;&nbsp;" + content + "</p>" +
            "<p>&nbsp;&nbsp;&nbsp;&nbsp;" + time + "</p>");
        var tdRight = $("<td class='active' width='50'></td>");
        tdRight.append("<a href='#'>顶:</a>");
        $("<span></span>").html(topCount).appendTo(tdRight);
        tdRight.append("<a href='#'>踩:</a>");
        $("<span></span>").html(treadCount).appendTo(tdRight);
        var obj = $("<tr style='border: 1px solid aqua' class='active'></tr>").append(tdLeft).append(tdRight).attr("id","ss" + id);
        $("#table1").append(obj);
    }
    function getAllBorad() {
        $.ajax({
            url:"/getAllBorad",
            success: function (result){
                console.log(result);
                for (var i = 0;i < result.length;i++ ){
                    var obj = result[i];
                    showBorad(obj.boradId,obj.boradContent,obj.boradTime,obj.topCount,obj.treadCount,"嘿嘿");
                }

            }

        })
    }
    getAllBorad()
</script>
</html>
