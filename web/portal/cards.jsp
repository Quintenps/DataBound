<%@ page import="platform.User" %>
<%@ page import="dao.cardreceivedDAO" %>
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
    <link href="../dist/components/dropdown.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/transition.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/message.css" rel="stylesheet" type="text/css">
    <link href="../dist/style.css" rel="stylesheet" type="text/css">

    <script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
    <script src="../dist/components/dropdown.min.js"></script>
    <script src="../dist/components/transition.min.js"></script>



    <link href="../dist/components/menu.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/divider.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/list.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/segment.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/dropdown.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/icon.css" rel="stylesheet" type="text/css">
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

        <%
            Object headermsg = request.getAttribute("headermsg");
            Object bodymsg = request.getAttribute("bodymsg");

            if (headermsg != null) {
                out.println("<div class=\"ui positive message\">\n" +
                        "            <i class=\"close icon\"></i>\n" +
                        "            <div class=\"header\">\n" +headermsg+
                        "            </div>\n" +
                        "            <p>"+bodymsg+"</p>\n" +
                        "        </div>");
            }


        %>
<form method="post" action="/QuickSendCard.do" class="ui form stacked">
  <h2>Quick Send</h2>
  <div class="fields">
    <div class="field">
      <label>Recipient ID</label>
      <input type="number" name="receiveruid">
    </div>
    <div class="field">
        <label>Choose card</label>
        <select class="ui dropdown" name="cardname">
          <option value="">Choose card</option>
          <option value="FamilyCard">Family card</option>
          <option value="BusinessCard">Business card</option>
          <option value="UnknownCard">Public card</option>
        </select>
    </div>
    <div class="field">
      <label style="opacity:0;">123</label>
      <button class="ui button small green">Send</button>
    </div>
  </div>
</form>

<br /><br />
<script>
$('select.dropdown')
  .dropdown()
;
</script>


        <%
            User person = (User)session.getAttribute("loggedUser");
            cardreceivedDAO cardreceivedao = new cardreceivedDAO();

        %>

<h2>My Cards</h2>
<div class="ui link centered cards">
 <a class="card" href="/portal/editcard-family.jsp">
    <div class="image">
      <img src="/portal/images/familycard.jpg">
    </div>
    <div class="content">
      <div class="header">Family card</div>
      <div class="meta">
        <span class="date">Used for friends</span>
      </div>
    </div>
    <div class="extra content">
      <span>
        <i class="unhide icon"></i><% out.println(cardreceivedao.cardShareCount(person.getUID(),"FamilyCard")); %>
      </span>
    </div>
  </a>

 <a class="card" href="/portal/editcard-business.jsp">
    <div class="image">
      <img src="/portal/images/businesscard.jpg">
    </div>
    <div class="content">
      <div class="header">Business card</div>
      <div class="meta">
        <span class="date">Used for business</span>
      </div>
    </div>
    <div class="extra content">
      <span>
        <i class="unhide icon"></i><% out.println(cardreceivedao.cardShareCount(person.getUID(),"BusinessCard")); %>
      </span>
    </div>
  </a>

   <a class="card" href="/portal/editcard-public.jsp">
    <div class="image">
      <img src="/portal/images/publiccard.jpg">
    </div>
    <div class="content">
      <div class="header">Public card</div>
      <div class="meta">
        <span class="date">Used for unknown people</span>
      </div>
    </div>
    <div class="extra content">
      <span>
        <i class="unhide icon"></i><% out.println(cardreceivedao.cardShareCount(person.getUID(),"UnknownCard")); %>
      </span>
    </div>
  </a>
 

</div>
</div>
        



    </div></main>
<jsp:include page="includes/footer.jsp" />
</body>
</html>