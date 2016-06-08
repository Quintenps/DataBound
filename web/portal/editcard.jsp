<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="platform.User" %>
<%@ page import="dao.datastoreDAO" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>

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
    <link href="../dist/components/message.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/checkbox.css" rel="stylesheet" type="text/css">

    <script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script> 
    <script src="../dist/components/form.min.js"></script>
    <script src="../dist/components/checkbox.min.js"></script>


    

    <link href="../dist/components/card.css" rel="stylesheet" type="text/css">

    <link href="../dist/style.css" rel="stylesheet" type="text/css">



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

<%
    User person = (User)session.getAttribute("loggedUser");
    datastoreDAO datastoredao = new datastoreDAO();
    HashMap<Integer, String> allData = datastoredao.selectAllData(person);
    Object headermsg = request.getAttribute("headermsg");
    Object bodymsg = request.getAttribute("bodymsg");

    pageContext.setAttribute("hashmap", allData);

    pageContext.setAttribute("firstname", 1);
    pageContext.setAttribute("middlename", 2);
    pageContext.setAttribute("lastname", 3);
    pageContext.setAttribute("gender", 4);
    pageContext.setAttribute("dateofbirth", 5);
    pageContext.setAttribute("country", 6);
    pageContext.setAttribute("city", 7);
    pageContext.setAttribute("town", 8);
    pageContext.setAttribute("facebook", 9);
    pageContext.setAttribute("twitter", 10);
    pageContext.setAttribute("skype", 11);
    pageContext.setAttribute("emailpersonal", 12);
    pageContext.setAttribute("emailbusiness", 13);
    pageContext.setAttribute("website", 14);


%>

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

<div class="ui grid row stackable">
<h1>Editing: Business card</h1>
</div><br /><br />
        <%

            if (headermsg != null) {
                out.println("<div class=\"ui positive message\">\n" +
                        "            <i class=\"close icon\"></i>\n" +
                        "            <div class=\"header\">\n" +headermsg+
                        "            </div>\n" +
                        "            <p>"+bodymsg+"</p>\n" +
                        "        </div>");
            }


        %>

<div class="ui form">
  <h3>Personal data</h3>
    <form action="/UpdateCard.do" method="post">

  <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" tabindex="0" name="firstname" value="<c:out value="${hashmap[firstname]}"/>" class="hidden">
      <label>First name</label>
    </div>
    <div class="ui left pointing label"><c:out value="${hashmap[firstname]}"/></div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" name="middlename" value="<c:out value="${hashmap[middlename]}"/>" tabindex="0" class="hidden">
      <label>Middle name</label>
    </div>
    <div class="ui left pointing label"><c:out value="${hashmap[middlename]}"/></div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" name="lastname" value="<c:out value="${hashmap[lastname]}"/>" tabindex="0" class="hidden">
      <label>Last name</label>
    </div>
    <div class="ui left pointing label"><c:out value="${hashmap[lastname]}"/></div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" name="gender" value="<c:out value="${hashmap[gender]}"/>" tabindex="0" class="hidden">
      <label>Gender</label>
    </div>
    <div class="ui left pointing label"><c:out value="${hashmap[gender]}"/></div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" name="dateofbirth" value="<c:out value="${hashmap[dateofbirth]}"/>" tabindex="0" class="hidden">
      <label>Date of Birth</label>
    </div>
    <div class="ui left pointing label"><c:out value="${hashmap[dateofbirth]}"/></div>
  </div>

</div>
<br /><br />
<div class="ui form">
  <h3>Online presence</h3>

  <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" name="emailpersonal" value="<c:out value="${hashmap[emailpersonal]}"/>" tabindex="0" class="hidden">
      <label>Email personal</label>
    </div>
      <div class="ui left pointing label"><c:out value="${hashmap[emailpersonal]}"/></div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" name="emailbusiness" value="<c:out value="${hashmap[emailbusiness]}"/>" tabindex="0" class="hidden">
      <label>Email business</label>
    </div>
        <div class="ui left pointing label"><c:out value="${hashmap[emailbusiness]}"/></div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" name="website" value="<c:out value="${hashmap[website]}"/>" tabindex="0" class="hidden">
      <label>Website URL</label>
    </div>
        <div class="ui left pointing label"><c:out value="${hashmap[website]}"/></div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" name="facebook" value="<c:out value="${hashmap[facebook]}"/>" tabindex="0" class="hidden">
      <label>Facebook URL</label>
    </div>
        <div class="ui left pointing label"><c:out value="${hashmap[facebook]}"/></div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" name="twitter" value="<c:out value="${hashmap[twitter]}"/>" tabindex="0" class="hidden">
      <label>Twitter</label>
    </div>
        <div class="ui left pointing label"><c:out value="${hashmap[twitter]}"/></div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" name="skype" value="<c:out value="${hashmap[skype]}"/>" tabindex="0" class="hidden">
      <label>Skype</label>
    </div>
        <div class="ui left pointing label"><c:out value="${hashmap[skype]}"/></div>
  </div>

    <input type="hidden" name="cardname" value="BusinessCard">

</div><br /><br />
<button class="ui green button">Update card</button>
</form>
<br /><br /><br /><br />


<div class="ui middle aligned divided list ">
  <h1>People you shared this card with</h1><br />
  <div class="item">
    <div class="right floated content">
      <div class="ui button red tiny">Remove access</div>
    </div>
    <img class="ui avatar image" src="https://cnt.bet9ja.com/super9ja/img/login-user-icon.png">
    <div class="content">
      Lena
    </div>
  </div>
  <div class="item">
    <div class="right floated content">
      <div class="ui button red tiny">Remove access</div>
    </div>
    <img class="ui avatar image" src="https://cnt.bet9ja.com/super9ja/img/login-user-icon.png">
    <div class="content">
      Lindsay
    </div>
  </div>
  <div class="item">
    <div class="right floated content">
      <div class="ui button red tiny">Remove access</div>
    </div>
    <img class="ui avatar image" src="https://cnt.bet9ja.com/super9ja/img/login-user-icon.png">
    <div class="content">
      Mark
    </div>
  </div>
  <div class="item">
    <div class="right floated content">
      <div class="ui button red tiny">Remove access</div>
    </div>
    <img class="ui avatar image" src="https://cnt.bet9ja.com/super9ja/img/login-user-icon.png">
    <div class="content">
      Molly
    </div>
  </div>
</div>
</div>

        
    <script>
$('.ui.checkbox').checkbox();

$(function(){
    $('.orange').click(function(){
        var select_all = (this.value === 'Select All');
        $('input:checkbox').attr('checked', select_all);
        this.value = (select_all) ? 'Deselect All' : 'Select All';        
    });
});

</script>


    </div></main>
<jsp:include page="includes/footer.jsp" />
</body>
</html>