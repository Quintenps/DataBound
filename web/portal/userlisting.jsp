<%@ page import="platform.User" %>
<%@ page import="dao.cardreceivedDAO" %>
<%@ page import="dao.datastoreDAO" %>
<%@ page import="dao.userDAO" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Standard Meta -->
    <meta charset="utf-8">
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0"
          name="viewport"><!-- Site Properties -->
    <title>Simple Data</title>
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
    </style>
</head>
<body class="Site">
<jsp:include page="includes/menu.jsp" />
<main class="Site-content">
    <div class="ui main container">

        <div class="ui grid">
            <div class="four wide column">
                <div class="ui breadcrumb">
                    <a class="section">Home</a>
                    <div class="divider">
                        /
                    </div><a class="active section">Dashboard</a>
                </div>
            </div>
        </div>
        <br /><br />
        <div class='ui massive middle aligned divided list'>
            <%

                userDAO userdao = new userDAO();
                HashMap<Integer, String> users = userdao.selectAllUsers();

                Set set = users.entrySet();
                Iterator iterator = set.iterator();
                while(iterator.hasNext()) {
                    Map.Entry mentry = (Map.Entry) iterator.next();
                    int mentryUID = Integer.parseInt(mentry.getKey().toString());
                    out.println(" <div class='item'> <div class='right floated content'> <div class='ui orange label'>ID#"+mentry.getKey()+"</div></div>");
                    out.println("<img class='ui avatar image' src='"+userdao.getAvatarURL(mentryUID)+"'> <div class='content'>"+mentry.getValue()+"</div></div>");
                }

            %>
        </div>





    </div>
    </div>
    </div>




    </div>
</main>
<jsp:include page="includes/footer.jsp" />
</body>
</html>