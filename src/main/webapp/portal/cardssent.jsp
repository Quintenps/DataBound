<%@ page import="platform.User" %>
<%@ page import="dao.cardsentDAO" %>
<%@ page import="dao.userDAO" %>
<%@ page import="java.util.*" %>
<%@ page import="dao.cardDAO" %>
<%@ page import="platform.CardAccess" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Standard Meta -->
    <meta charset="utf-8">
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0"
          name="viewport"><!-- Site Properties -->
    <title>DataBound :: Cards Sent</title>
    <link href="../dist/components/reset.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/site.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/container.css" rel="stylesheet" type=
            "text/css">
    <link href="../dist/components/grid.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/header.css" rel="stylesheet" type=
            "text/css">
    <link href="../dist/components/image.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/button.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/shape.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/breadcrumb.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/label.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/form.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/card.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/label.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/modal.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/dimmer.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/transition.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/message.css" rel="stylesheet" type="text/css">



    <script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
    <script src="../components/modal.js"></script>
    <script src="../components/transition.js"></script>
    <script src="../components/dimmer.js"></script>


    <link href="../dist/components/menu.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/divider.css" rel="stylesheet" type=
            "text/css">
    <link href="../dist/components/list.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/segment.css" rel="stylesheet" type=
            "text/css">
    <link href="../dist/components/dropdown.css" rel="stylesheet" type=
            "text/css">
    <link href="../dist/components/icon.css" rel="stylesheet" type="text/css">
    <link href="../dist/style.css" rel="stylesheet" type="text/css">

    <style type="text/css">
        body {
            background-color: #FFFFFF;
        }
        .ui.menu .item img.logo {
            margin-right: 1.5em;
        }
        .main.container {
            margin-top: 7em;
        }
        .wireframe {
            margin-top: 2em;
        }
        .ui.footer.segment {
            margin: 5em 0em 0em;
            padding: 5em 0em;
        }

        .ui.list .list > .item [class*="right floated"], .ui.list > .item [class*="right floated"] { min-width: 180px; }
    </style>
</head>
<body class="Site">
<jsp:include page="includes/menu.jsp" />
<main class="Site-content">
    <div class="ui main container">

        <div class="ui grid">
            <div class="four wide column">
                <div class="ui breadcrumb">
                    <a href="/portal/index.jsp" class="section">Home</a>
                    <div class="divider">
                        /
                    </div><a class="active section">Cards Sent</a>
                </div>
            </div>
        </div>
        <br /><br />
        <%
            Object headermsg = request.getAttribute("headermsg");
            Object bodymsg = request.getAttribute("bodymsg");
            Object status = request.getAttribute("status");



            if (headermsg != null) {
                out.println("<div class=\"ui "+status+" message\">\n" +
                        "            <i class=\"close icon\"></i>\n" +
                        "            <div class=\"header\">\n" +headermsg+
                        "            </div>\n" +
                        "            <p>"+bodymsg+"</p>\n" +
                        "        </div>");
            }


        %>
        <div class='ui massive middle aligned divided list'>
            <%
                User person = (User)session.getAttribute("loggedUser");
                int uid = (Integer) session.getAttribute("uid");

                cardsentDAO cardsentdao = new cardsentDAO();
                cardDAO carddao = new cardDAO();
                userDAO userdao = new userDAO();


                ArrayList<CardAccess> ca = cardsentdao.cardAccess(uid);

                for(CardAccess item : ca) {


                    String name = userdao.getName(item.getUid());

                    out.println(" <div class='item'> <div class='right floated content'> <div class='ui orange label'>ID#" + item.getUid() + "</div><a class='ui blue label' id='" + name + item.getCardname() + "'><i class='arrow down icon'></i> " + item.getCardname() + "</a><br />&nbsp; <a href=\"/removeAccess.do?uid=" + item.getUid() + "&cn=" + item.getCardname() + "\" class=\"ui red basic button\" style='margin: 5px 0px 0px 0px; float:left;'> <i class=\"trash outline icon\"></i> Remove Access </a></div>");
                    out.println("<img class='ui avatar image' src='" + userdao.getAvatarURL(item.getUid()) + "'> <div class='content'>" + name + "</div></div>");

                }


            %>

            <script>
                $(".blue").click(function(){
                    var thisCard = $(this).attr('id');
                    console.log(this);
                    $('.modal#'+thisCard+'').modal('show');
                });
            </script>

        </div>




    </div>
</main>
<jsp:include page="includes/footer.jsp" />
</body>
</html>