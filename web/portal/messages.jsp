<%@ page import="platform.User" %>
<%@ page import="dao.cardreceivedDAO" %>
<%@ page import="dao.datastoreDAO" %>
<%@ page import="dao.userDAO" %>
<%@ page import="java.util.*" %>
<%@ page import="dao.MessageDAO" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.ZoneId" %>
<%@ page import="java.time.Instant" %>
<%@ page import="java.text.SimpleDateFormat" %>
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
        <div class='ui list'>
            <%

                userDAO userdao = new userDAO();
                MessageDAO msgdao = new MessageDAO();
                int myUID = (Integer) session.getAttribute("uid");

                HashMap<Integer, Integer> allmsgs = msgdao.whichMessages(myUID);
                msgdao.markRead(myUID);



                Set set = allmsgs.entrySet();
                Iterator iterator = set.iterator();
                while(iterator.hasNext()) {
                    Map.Entry mentry = (Map.Entry) iterator.next();
                    int mentryUID = Integer.parseInt(mentry.getValue().toString());
                    HashMap<Integer, String> msgdata = msgdao.allMessages(mentryUID, (Integer)mentry.getKey());
                    SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy 'at' h:mm a");
                    String date = sdf.format(Long.parseLong(msgdata.get(1))*1000);

//                    Long unixTimeStamp = Long.parseLong(msgdata.get(1));
//
//                    Instant dateTime = Instant.now();
//
//                    if(unixTimeStamp != 0) {
//                        dateTime = Instant.ofEpochSecond(unixTimeStamp);
//                    }

                    String name = userdao.getName(mentryUID);
                    out.println(" <div class='item'> <img class='ui avatar image' src='https://api.adorable.io/avatars/128/\"+name+\"@adorable.io.png'>");
                    out.println(" <div class='content'>"+name+"<div class='description'><b>"+msgdata.get(4)+"</b> @ "+date+"</div></div></div>");
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