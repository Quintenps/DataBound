<%@ page import="platform.User" %>
<%@ page import="dao.MessageDAO" %>

<% User person = (User)session.getAttribute("loggedUser"); int uid = (Integer) session.getAttribute("uid"); MessageDAO msgdao = new MessageDAO(); %>
<div class="ui fixed inverted menu">
        <div class="ui container">
            <a class="header item" href="/portal/index.jsp"><img src="../images/logo-icon.svg" style="width:48px; padding:0px 10px;"> DataBound</a> <a class="item"
            href="/portal/index.jsp">Home</a> <a class="item" href="/portal/messages.jsp">Messages
            <div class="ui red label">
                <% out.println(msgdao.selectUnread(uid)); %>
            </div></a>
            <div class="right menu">
                <div class="ui simple dropdown item">
                    <img class="ui avatar image" src="https://cnt.bet9ja.com/super9ja/img/login-user-icon.png"><span><%  out.println(person.getUsername()); %></span><i class="dropdown icon"></i>
                    <div class="menu">
                        <div class="header">
                            Profile
                        </div><a class="item" href="/portal/datastore.jsp">Datastore</a> <a class=
                        "item" href="/portal/userlisting.jsp">User listing</a> <a class="item" href=
                        "/portal/cards.jsp">Send card</a>
                        <div class="divider"></div><a class="item" href=
                        "/portal/settings.jsp">Settings</a> <a class="item" href="/LogoutServlet.do">Logout</a>
                    </div>
                </div>
            </div>
        </div>
    </div>